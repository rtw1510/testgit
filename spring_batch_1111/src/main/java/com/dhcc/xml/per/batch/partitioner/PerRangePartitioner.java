package com.dhcc.xml.per.batch.partitioner;


import com.dhcc.xml.per.batch.listener.PerJobExecutionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.configuration.annotation.StepScope;
import org.springframework.batch.core.partition.support.Partitioner;
import org.springframework.batch.item.ExecutionContext;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: PerRangePartitioner<br/>
 * Description: 一个文件默认最大条数(maxSum)为50w,gridSize为所用线程数，每个线程对应一个分区，
 *              分区：将数据（50W）按线程数（gridSize）写入的到的一块区域（range）,这里写入的是一个文件，数量为（range），然后将每个分区文件汇总到（50W）文件中
 *              1.文件流程：假如130w数据,会划分为3个Job,前两个默认最大值 50W,job按顺序执行
 *              2.job流程：每个job会按线程数（gridSize）分别写入到（range）数量的文件中，然后文件汇总到一个50w的文件中；
 * @author ChenJingYuan
 * @date 2018年4月4日
 */
@Component
@StepScope
public class PerRangePartitioner implements Partitioner {

	private static final Logger log = LoggerFactory.getLogger(PerRangePartitioner.class);
	
	/** 分线程处理的总条数 */
	@Value("#{jobParameters['sum']}")
	private String sum;
	/** 每个线程限制的最大条数 */
	@Value("#{jobParameters['range']}")
	private String range;
	/** 允许开启的最大线程数（优先级高于线程条数限制）*/
	@Value("#{jobParameters['maxGridSize']}")
	private String maxGridSize;
	/** 使用线程数，对应分区*/
	@Value("#{jobParameters['gridSize']}")
	private String gridSize;
	/** 每个文件最大条数；*/
	@Value("#{jobParameters['maxSum']}")
	private String maxSum;
	/** jobname*/
	@Value("#{jobParameters['jobName']}")
	private String jobName;
	
	/** 根据分配线程数进行分区数据处理*/
	public Map<String, ExecutionContext> partition(int maxGridSize) {
		Map<String, ExecutionContext> result = new HashMap<String, ExecutionContext>();
		int sum = Integer.valueOf(this.sum);
		int gridSize = Integer.valueOf(this.gridSize);
	    maxGridSize = Integer.valueOf(this.maxGridSize);
		int maxSum = Integer.valueOf(this.maxSum);
		int range = 0;//每个分区（线程）需要处理的平均条数
		
		int times = 0;//job需要循环的次数,同一类需要报文生成的个数
		//设置分块最大值 默认为50W
       // int maxSum = 500000;
		if(sum>maxSum){
			if (sum % maxSum > 0) {//计算生成几个Job来生成当前报文
				times = sum / maxSum + 1;
			} else {
				times = sum / maxSum;
			}
		}else{
			times = 1;
			maxSum = sum;
		}
		//设置Job循环执行的数量
		if(PerJobExecutionListener.JOB_MAP.get(jobName) == 0){
			PerJobExecutionListener.JOB_MAP.put(jobName,times);
		}
		if(PerJobExecutionListener.JOB_MAP.get(jobName)!=1){
			sum=maxSum;
		}else{
			sum=sum-(times-1)*maxSum;
		}
		//分区起始id
		int fromId = (times-PerJobExecutionListener.JOB_MAP.get(jobName))*maxSum+1;

		//设置最大值
        int maxSumC = fromId+maxSum-1;

		// 1、如果线程大于4个只用4个线程重新定取数的范围
		if (gridSize > maxGridSize) {
			gridSize = maxGridSize;
		}
		//1.1如果设置的线程数>待生成报文的条数，线程数设为条数值或者=1
		if(gridSize>sum){
			gridSize=1;
		}
		// 2、如果总条数小于分区条数，不进行分线程处理
		range = (sum / gridSize);
		if(range==0){//报文条数小于线程数range=1
			range=1;
		}
		// 3、动态分区,确认每个分区的处理的id
		int toId = 1;
		// 4、如果只有一页的分页toId取sum(组报文主表的总数)
		if (gridSize == 1) {
			toId = fromId + sum - 1;
		} else {
			toId = fromId + range - 1;
		}
		//5、分区（分线程）给fromId和toId赋值
		for (int i = 1; i <= gridSize; i++) {
			ExecutionContext value = new ExecutionContext();
			System.out.println("\nStarting : Thread" + i + " fromId : " + fromId+" toId : " + toId);
			value.putInt("fromId", fromId);
			value.putInt("toId", toId);
			// give each thread a name, thread 1,2,3
			value.putString("threadName", "Thread:" + i);
			result.put("partition" + i, value);
			fromId = toId + 1;
			// 6、当获取最后一个线程的toId时，取余累加
			if (i == (gridSize-1)) {
				toId = maxSumC;
			} else {
				toId += range;
			}
		}
		return result;
	}
	
	
	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getSum() {
		return sum;
	}

	public void setSum(String sum) {
		this.sum = sum;
	}
	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getMaxGridSize() {
		return maxGridSize;
	}

	public void setMaxGridSize(String maxGridSize) {
		this.maxGridSize = maxGridSize;
	}
	
	public String getGridSize() {
		return gridSize;
	}
	
	public void setGridSize(String gridSize) {
		this.gridSize = gridSize;
	}
	
	public String getMaxSum() {
		return maxSum;
	}
	
	public void setMaxSum(String maxSum) {
		this.maxSum = maxSum;
	}
	
	
	
}