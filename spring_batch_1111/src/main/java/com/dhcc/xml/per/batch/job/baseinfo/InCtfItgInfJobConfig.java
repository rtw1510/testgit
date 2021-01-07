package com.dhcc.xml.per.batch.job.baseinfo;

import com.dhcc.xml.per.batch.listener.PerJobExecutionListener;
import com.dhcc.xml.per.batch.partitioner.PerRangePartitioner;
import com.dhcc.xml.per.batch.reader.OracleIbatisPagingItemReader;
import com.dhcc.xml.per.batch.writer.SpringBatchWriter;
import com.dhcc.xml.per.entity.baseinfo.InCtfItgInf;
import com.dhcc.xml.per.entity.baseinfo.db.Pb_CustBase_Info;
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
public class InCtfItgInfJobConfig {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private PerRangePartitioner perRangePartitioner;

    @Autowired
    @Qualifier("InCtfItgInfProcessor")
    private ItemProcessor itemProcessor;

    @Autowired
    private SpringBatchWriter springBatchWriter;

    @Autowired
    private OracleIbatisPagingItemReader inCtfItgInfReader;

    @Autowired
    private PerJobExecutionListener perJobExecutionListener;
    private int commit_interval = 1000;

    @Bean("InCtfItgInfJob")
    public Job inCtfItgInfJob(){
        return jobBuilderFactory.get("InCtfItgInfJob")
                .start(inCtfItgInfFlow())
                .end()
                .listener(perJobExecutionListener)
                .build();
    }
    @Bean
    public Flow inCtfItgInfFlow() {
        return new FlowBuilder<Flow>("InCtfItgInfFlow")
                .start(inCtfItgInfStep())
                .build();
    }

    @Bean
    public Step inCtfItgInfStep() {
        return stepBuilderFactory.get("InCtfItgInfStep")
                .partitioner(inCtfItgInfSonStep().getName(),perRangePartitioner)
                .partitionHandler(inCtfItgInfRangePartitioner())
                .build();
    }
    @Bean
    public PartitionHandler inCtfItgInfRangePartitioner() {
        TaskExecutorPartitionHandler handler = new TaskExecutorPartitionHandler();
        //handler.setGridSize(4);
        handler.setTaskExecutor( inCtfItgInfPartitionHandlerTaskExecutor());
        handler.setStep(inCtfItgInfSonStep());//暂时存在
        try {
            handler.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return handler;
    }

    @Bean
    public SimpleAsyncTaskExecutor  inCtfItgInfPartitionHandlerTaskExecutor() {
        return new SimpleAsyncTaskExecutor();
    }
    @Bean
    public Step inCtfItgInfSonStep() {
        return stepBuilderFactory.get("InCtfItgInfSon")
                .<InCtfItgInf,InCtfItgInf>chunk(commit_interval)
                .reader(inCtfItgInfReader)
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
