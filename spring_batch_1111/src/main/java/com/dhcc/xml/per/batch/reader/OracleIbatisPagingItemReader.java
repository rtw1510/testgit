package com.dhcc.xml.per.batch.reader;

/*
 * Copyright 2006-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.database.AbstractPagingItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.ClassUtils;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import static org.springframework.util.Assert.notNull;

/**
 * <p>
 * {@link org.springframework.batch.item.ItemReader} for reading database
 * records using iBATIS in a paging fashion.
 * </p>
 *
 * <p>
 * It executes the query specified as the {@link #setQueryId(String)} to
 * retrieve requested data. The query is executed using paged requests of a size
 * specified in {@link #setPageSize(int)}. Additional pages are requested when
 * needed as {@link #read()} method is called, returning an object corresponding
 * to current position. Some standard query parameters are provided by the
 * reader and the SQL in the named query must use some or all of these parameters
 * (depending on the SQL variant) to construct a result set of the required
 * size. The parameters are:</p>
 * <ul>
 * <li><code>_page</code>: the page number to be read (starting at 0)</li>
 * <li><code>_pagesize</code>: the size of the pages, i.e. the number of rows to
 * return</li>
 * <li><code>_skiprows</code>: the product of <code>_page</code> and
 * <code>_pagesize</code></li>
 * </ul>
 * <p>
 * Failure to write the correct platform-specific SQL often results in an
 * infinite loop in the reader because it keeps asking for the next page and
 * gets the same result set over and over.
 * </p>
 *
 * <p>
 * The performance of the paging depends on the iBATIS implementation.
 * Setting a fairly large page size and using a commit interval that matches the
 * page size should provide better performance.
 * </p>
 *
 * <p>
 * The implementation is thread-safe in between calls to
 * {@link #open(ExecutionContext)}, but remember to use
 * <code>saveState=false</code> if used in a multi-threaded client (no restart
 * available).
 * </p>
 *
 * <p><em>Note:</em> This reader was refactored as part of Spring Batch 3.0 to use the iBatis
 * APIs directly instead of using Spring's SqlMapClientTemplate as part of the upgrade to
 * support Spring 4.</p>

 * @author Thomas Risberg
 * @author Dave Syer
 * @author Michael Minella
 * @since 2.0
 * @deprecated as of Spring Batch 3.0, in favor of the native Spring Batch support
 * in the MyBatis follow-up project (http://mybatis.github.io/spring/)
 */

@StepScope
@Component
public class OracleIbatisPagingItemReader<T> extends AbstractPagingItemReader<T> {
	//private SqlMapClient sqlMapClient;
	//@Value("InBasInfJob_selectAllInfo")
	@Value("#{jobParameters['queryId']}")
	private String queryId;

	private Map<String, Object> parameterValues = new HashMap<>();
	@Autowired
	private DataSource dataSource;

	private SqlSessionTemplate sqlSessionTemplate;
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	@Value("#{jobParameters['tx_date']}")
	private String tx_date;
	@Value("#{jobParameters['br_no']}")
	private String br_no;
	@Value("#{jobParameters['record_id']}")
	private String record_id;
	@Value("#{jobParameters['pageNumber']}")
	private int pageSize;
	/**
	 *第一次分页进入标志
	 */  
	private boolean firstFlag=true;
	/**
	 *分区起始ID
	 */
	@Value("#{stepExecutionContext[fromId]}")
	private int fromId;
	/**
	 *分区结束ID
	 */
	@Value("#{stepExecutionContext[toId]}")
	private int toId;
	/**
	 *关联查询的最大页数
	 */  
	private int maxPage;
	/**
	 *关联查询的分页条数
	 */
	@Value("#{jobParameters['pageNumber']}")
	private int pageNumber; 

	/**
	 *关联查询分页的起始ID
	 */  
	private int fromNumber;
	/**
	 *关联查询分页的结束ID
	 */  
	private int toNumber;
	
	/**  
	 * 获取 pageNo
	 * @return the pageNo 关联查询的分页条数
	 */
	public int getPageNumber() {
		return pageNumber;
	}

	/**  
	 * 设置 pageNo  
	 * @param pageNo 关联查询的分页条数 
	 */
	public void setPageNumber(String pageNumber) {
		this.pageNumber = Integer.parseInt(pageNumber);
	}

	/**  
	 * 获取 fromId
	 * @return the fromId 分区起始ID 
	 */
	public int getFromId() {
		return fromId;
	}

	/**  
	 * 设置 fromId  
	 * @param fromId 分区起始ID  
	 */
	public void setFromId(int fromId) {
		this.fromId = fromId;
	}

	/**  
	 * 获取 toId
	 * @return the toId 分区结束ID 
	 */
	public int getToId() {
		return toId;
	}

	/**  
	 * 设置 toId  
	 * @param toId 分区结束ID  
	 */
	public void setToId(int toId) {
		this.toId = toId;
	}

	/**  
	 * 获取 fromNumber
	 * @return the fromNumber 关联查询分页的起始ID 
	 */
	public int getFromNumber() {
		return fromNumber;
	}

	/**  
	 * 设置 fromNumber  
	 * @param fromNumber 关联查询分页的起始ID  
	 */
	public void setFromNumber(int fromNumber) {
		this.fromNumber = fromNumber;
	}

	/**  
	 * 获取 toNumber
	 * @return the toNumber 关联查询分页的结束ID 
	 */
	public int getToNumber() {
		return toNumber;
	}

	/**  
	 * 设置 toNumber  
	 * @param toNumber 关联查询分页的结束ID  
	 */
	public void setToNumber(int toNumber) {
		this.toNumber = toNumber;
	}
	
	/**  
	 * 获取 firstFlag
	 * @return the firstFlag 第一次分页进入标志
	 */
	public boolean isFirstFlag() {
		return firstFlag;
	}

	/**  
	 * 设置 firstFlag  
	 * @param firstFlag 第一次分页进入标志  
	 */
	public void setFirstFlag(boolean firstFlag) {
		this.firstFlag = firstFlag;
	}

	/**  
	 * 获取 maxPage
	 * @return the maxPage 关联查询的最大页数 
	 */
	public int getMaxPage() {
		return maxPage;
	}


	/**  
	 * 设置 maxPage  
	 * @param maxPage 关联查询的最大页数  
	 */
	public void setMaxPage(int maxPage) {
		this.maxPage = maxPage;
	}


	public OracleIbatisPagingItemReader() {
		setName(ClassUtils.getShortName(OracleIbatisPagingItemReader.class));
	}


	/*public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}*/

	/*public void setSqlMapClient(SqlMapClient sqlMapClient) {
		this.sqlMapClient = sqlMapClient;
	}*/

	public void setQueryId(String queryId) {
		this.queryId = queryId;
	}
	


	/**
	 * The parameter values to be used for the query execution.
	 *
	 * @param parameterValues the values keyed by the parameter named used in
	 * the query string.
	 */
	public void setParameterValues(Map<String, Object> parameterValues) {
		this.parameterValues = parameterValues;
	}

	/**
	 * Check mandatory properties.
	 * @see org.springframework.beans.factory.InitializingBean#afterPropertiesSet()
	 */

	@Override
	public void afterPropertiesSet() throws Exception {
		super.afterPropertiesSet();
		/*Assert.notNull(sqlMapClient);
		Assert.notNull(queryId);*/
		notNull(sqlSessionFactory, "A SqlSessionFactory is required.");
		sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory, ExecutorType.BATCH);
		notNull(queryId, "A queryId is required.");
	}

	@Override
	/**
	 * 翻页计数从0开始，
	 * 例如：_page:0,1,2,3
	 */
	protected void doReadPage() {
		super.setPageSize(pageSize);
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameterValues.put("tx_date",tx_date);
		parameterValues.put("br_no",br_no);
		parameterValues.put("record_id",record_id);
		if (parameterValues != null) {
			parameters.putAll(parameterValues);
		}
		//如果第一次进入将分区的起始ID付给分页的起始ID
//		if(firstFlag){
//			this.fromNumber=this.fromId;
//			this.toNumber=this.fromNumber+this.pageNumber;
//			firstFlag=false;
//		}else{
//			this.fromNumber=this.toNumber;
//			this.toNumber=this.fromNumber+this.pageNumber;
//		}
		this.fromNumber = this.fromId + getPage() * this.pageNumber;
		this.toNumber = this.fromId + (getPage() + 1) * this.pageNumber;
		//分页大小大于实际查询的条数，分页大小=条数大小
		if(this.toNumber>this.toId){
			this.toNumber = this.toId + 1;
		}
		this.maxPage=(this.toId-this.fromId+1)/this.pageNumber+1;
		//如果分页刚好为整数,当前计算的页码减1，分页记数从1开始(1是开始页)
		if((this.toId-this.fromId+1)%this.pageNumber==0&&this.maxPage!=0){
			this.maxPage=this.maxPage-1;
		}
		//如果判断当前是分页的最后一页toNumber的值要+1，因为sql中判断结束用的<不是<=
//		if(getPage()+1==this.maxPage){
//			this.toNumber +=1;
//			firstFlag=true;
//		}
		parameters.put("_page", getPage());
		parameters.put("_pagesize", getPageSize());
		parameters.put("_skiprows", getPage() * getPageSize());
		parameters.put("_fromId",getFromId());
		parameters.put("_toId",getToId());
		parameters.put("_pageNumber", this.pageNumber);
		parameters.put("_fromNumber", this.fromNumber);
		parameters.put("_toNumber", this.toNumber);
		parameters.put("_maxPage", this.maxPage);
		if (results == null) {
			results = new CopyOnWriteArrayList<T>();
		}
		else {
			results.clear();
		}
		//results.addAll(execute(parameters));
		results.addAll(sqlSessionTemplate.<T> selectList(queryId, parameters));
	}

	@SuppressWarnings("unchecked")
	/*private List<T> execute(Map<String, Object> parameters) {
		// We always need to use a SqlMapSession, as we need to pass a Spring-managed
		// Connection (potentially transactional) in. This shouldn't be necessary if
		// we run against a TransactionAwareDataSourceProxy underneath, but unfortunately
		// we still need it to make iBATIS batch execution work properly: If iBATIS
		// doesn't recognize an existing transaction, it automatically executes the
		// batch for every single statement...

		SqlMapSession session = this.sqlMapClient.openSession();
		if (logger.isDebugEnabled()) {
			logger.debug("Opened SqlMapSession [" + session + "] for iBATIS operation");
		}
		Connection ibatisCon = null;

		try {
			Connection springCon = null;
			boolean transactionAware = (dataSource instanceof TransactionAwareDataSourceProxy);

			// Obtain JDBC Connection to operate on...
			try {
				ibatisCon = session.getCurrentConnection();
				if (ibatisCon == null) {
					springCon = (transactionAware ?
							dataSource.getConnection() : DataSourceUtils.doGetConnection(dataSource));
					session.setUserConnection(springCon);
					if (logger.isDebugEnabled()) {
						logger.debug("Obtained JDBC Connection [" + springCon + "] for iBATIS operation");
					}
				}
				else {
					if (logger.isDebugEnabled()) {
						logger.debug("Reusing JDBC Connection [" + ibatisCon + "] for iBATIS operation");
					}
				}
			}
			catch (SQLException ex) {
				throw new CannotGetJdbcConnectionException("Could not get JDBC Connection", ex);
			}

			// Execute given callback...
			try {
				return session.queryForList(queryId, parameters);
			}
			catch (SQLException ex) {
				SQLExceptionTranslator sqlStateSQLExceptionTranslator;

				if(dataSource != null) {
					sqlStateSQLExceptionTranslator = new SQLStateSQLExceptionTranslator();
				} else {
					sqlStateSQLExceptionTranslator = new SQLErrorCodeSQLExceptionTranslator(dataSource);
				}

				throw sqlStateSQLExceptionTranslator.translate("SqlMapClient operation", null, ex);
			}
			finally {
				try {
					if (springCon != null) {
						if (transactionAware) {
							springCon.close();
						}
						else {
							DataSourceUtils.doReleaseConnection(springCon, dataSource);
						}
					}
				}
				catch (Throwable ex) {
					logger.debug("Could not close JDBC Connection", ex);
				}
			}

			// Processing finished - potentially session still to be closed.
		}
		finally {
			// Only close SqlMapSession if we know we've actually opened it
			// at the present level.
			if (ibatisCon == null) {
				session.close();
			}
		}
	}*/

	@Override
	protected void doJumpToPage(int itemIndex) {
	}

}
