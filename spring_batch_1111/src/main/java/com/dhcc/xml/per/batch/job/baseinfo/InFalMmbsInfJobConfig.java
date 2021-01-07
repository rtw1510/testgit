package com.dhcc.xml.per.batch.job.baseinfo;

import com.dhcc.xml.per.batch.listener.PerJobExecutionListener;
import com.dhcc.xml.per.batch.partitioner.PerRangePartitioner;
import com.dhcc.xml.per.batch.reader.OracleIbatisPagingItemReader;
import com.dhcc.xml.per.batch.writer.SpringBatchWriter;
import com.dhcc.xml.per.entity.baseinfo.InBsInfDlt;
import com.dhcc.xml.per.entity.baseinfo.InFalMmbsInf;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.core.partition.PartitionHandler;
import org.springframework.batch.core.partition.support.TaskExecutorPartitionHandler;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.SimpleAsyncTaskExecutor;

@Configuration
public class InFalMmbsInfJobConfig {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private PerRangePartitioner perRangePartitioner;

    @Autowired
    @Qualifier("InFalMmbsInfProcessor")
    private ItemProcessor itemProcessor;

    @Autowired
    private SpringBatchWriter springBatchWriter;

    @Autowired
    private OracleIbatisPagingItemReader inFalMmbsInfReader;

    @Autowired
    private PerJobExecutionListener perJobExecutionListener;
    private int commit_interval = 1000;

    @Bean("InFalMmbsInfJob")
    public Job inFalMmbsInfDltJob(){
        return jobBuilderFactory.get("InFalMmbsInfJob")
                .start(inFalMmbsInfFlow())
                .end()
                .listener(perJobExecutionListener)
                .build();
    }
    @Bean
    public Flow inFalMmbsInfFlow() {
        return new FlowBuilder<Flow>("InFalMmbsInfFlow")
                .start(inFalMmbsInfStep())
                .build();
    }

    @Bean
    public Step inFalMmbsInfStep() {
        return stepBuilderFactory.get("InFalMmbsInfStep")
                .partitioner(inFalMmbsInfSonStep().getName(),perRangePartitioner)
                .partitionHandler(inFalMmbsInfRangePartitioner())
                .build();
    }
    @Bean
    public PartitionHandler inFalMmbsInfRangePartitioner() {
        TaskExecutorPartitionHandler handler = new TaskExecutorPartitionHandler();
        //handler.setGridSize(4);
        handler.setTaskExecutor(inFalMmbsInfPartitionHandlerTaskExecutor());
        handler.setStep( inFalMmbsInfSonStep());//暂时存在
        try {
            handler.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return handler;
    }

    @Bean
    public SimpleAsyncTaskExecutor inFalMmbsInfPartitionHandlerTaskExecutor() {
        return new SimpleAsyncTaskExecutor();
    }
    @Bean
    public Step inFalMmbsInfSonStep() {
        return stepBuilderFactory.get("InFalMmbsInfSon")
                .<InFalMmbsInf,InFalMmbsInf>chunk(commit_interval)
                .reader(inFalMmbsInfReader)
                .processor(itemProcessor)
                //.writer(fileItemWriter)
                .writer(springBatchWriter)
                .build();
    }

    /*@Bean
    @StepScope
    public CommonPartitionMybatisItemReader commonPartitionMybatisItemReader( @Value("#{stepExecutionContext[fromId]}") String fromId,
                                                                              @Value("#{stepExecutionContext[toId]}") String toId) {
        return new CommonPartitionMybatisItemReader(sqlSessionFactory, Pb_CustBase_Info.class.getSimpleName(),fromId,toId);
    }*/

    /*@Bean
    @StepScope
    public CommonPartitionFileItemWriter commonPartitionFileItemWriter(@Value("#{stepExecutionContext[fromId]}") String fromId,
                                                                       @Value("#{stepExecutionContext[toId]}") String toId) {
        return new CommonPartitionFileItemWriter(Pb_CustBase_Info.class,fromId,toId);
    }*/


}
