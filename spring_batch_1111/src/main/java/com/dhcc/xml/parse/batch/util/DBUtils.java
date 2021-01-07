package com.dhcc.xml.parse.batch.util;

//import com.dhcc.core.util.SourceTemplate;
import com.dhcc.xml.util.SpringContextUtil;
import org.springframework.context.ApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

/**  
  * Title: DBUtils<br/>  
  * Description:JDBC数据库操作工具类 <br/>  
  * @author ChenJingYuan  
  * @date 2019-8-14  
  */  
public class DBUtils {
	//private static DataSource dataSource;
	private static Connection conn = null;

	
	/**  
	 * Title: getConnection<br\>  
	 * Description:获取数据库连接 <br\>  
	 */  
	public static Connection getConnection() throws Exception {

		try {
			if(conn==null){
				conn = getConn();
				conn.setAutoCommit(false);// 自动提交 关闭
			}
			return conn;
		} catch (SQLException e) {
			throw new Exception(e.getMessage(),e);
		}
	}
	
	/**  
	 * Title: getConn<br\>  
	 * Description:加载数据库连接 <br\>  
	 */  
	private static Connection getConn() throws Exception {

		try {
			//DataSource ds = (DataSource) SourceTemplate.getContext().getBean("dataSource");//WEB程序中直接获取项目已配置的JNDI数据源
			ApplicationContext applicationContext = SpringContextUtil.getApplicationContext();
			DataSource ds = applicationContext.getBean(DataSource.class);
			return ds.getConnection();
		} catch (Exception e) {
			throw new Exception(e.getMessage(),e);
		}
	}
	
	/**  
	 * Title: closeConn<br\>  
	 * Description:关闭数据库连接 <br\>  
	 */  
	public static void closeConn(Connection conn) throws Exception {
		try {
			if (conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage(), e);
		}
	}

	/**  
	 * Title: closePS<br\>  
	 * Description:关闭Statement <br\>  
	 */  
	public static void closePS(Statement stmt) throws Exception {
		try {
			if (stmt != null) {
				stmt.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage(), e);
		}
	}
	
	/**  
	 * Title: closeRS<br\>  
	 * Description:关闭结果集ResultSet <br\>  
	 */  
	public static void closeRS(ResultSet rs) throws Exception {
		try {
			if (rs != null) {
				rs.close();
			}
		} catch (SQLException e) {
			throw new Exception(e.getMessage(), e);
		}
	}
	
	/**  
	 * Title: execute_sql<br\>  
	 * Description: 批量执行Sql<br\>  
	 */  
	public static void execute_sql(List<String> sqlList) throws Exception {
		Connection conn = getConnection();
		Statement st = null;
		try {
			st = conn.createStatement();
			for(int i=0;i<sqlList.size();i++){
			    st.addBatch(sqlList.get(i));
			}
			st.executeBatch();
			conn.commit();
		} catch (SQLException e) {
			try {
				e.printStackTrace();
				conn.rollback();
				System.out.println("出现异常，已回滚!!!");
			} catch (SQLException e1) {
			   System.out.println("批处理回滚异常");
			}
	  }finally{
		  closePS(st);
	  }
	}
}
