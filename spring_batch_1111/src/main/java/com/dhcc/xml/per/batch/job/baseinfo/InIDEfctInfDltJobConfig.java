package com.dhcc.xml.per.batch.job.baseinfo;

import com.dhcc.xml.per.batch.listener.PerJobExecutionListener;
import com.dhcc.xml.per.batch.partitioner.PerRangePartitioner;
import com.dhcc.xml.per.batch.reader.OracleIbatisPagingItemReader;
import com.dhcc.xml.per.batch.writer.SpringBatchWriter;
import com.dhcc.xml.per.entity.baseinfo.InIDEfctInfDlt;
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
public class InIDEfctInfDltJobConfig {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private PerRangePartitioner perRangePartitioner;

    @Autowired
    @Qualifier("InIDEfctInfDltProcessor")
    private ItemProcessor itemProcessor;

    @Autowired
    private SpringBatchWriter springBatchWriter;

    @Autowired
    private OracleIbatisPagingItemReader inIDEfctInfDltReader;

    @Autowired
    private PerJobExecutionListener perJobExecutionListener;
    private int commit_interval = 1000;

    @Bean("InIDEfctInfDltJob")
    public Job inIDEfctInfDltJob(){
        return jobBuilderFactory.get("InIDEfctInfDltJob")
                .start(inIDEfctInfDltFlow())
                .end()
                .listener(perJobExecutionListener)
                .build();
    }
    @Bean
    public Flow inIDEfctInfDltFlow() {
        return new FlowBuilder<Flow>("InIDEfctInfDltFlow")
                .start(inIDEfctInfDltStep())
                .build();
    }

    @Bean
    public Step inIDEfctInfDltStep() {
        return stepBuilderFactory.get("InIDEfctInfDltStep")
                .partitioner(inIDEfctInfDltSonStep().getName(),perRangePartitioner)
                .partitionHandler(inIDEfctInfDltRangePartitioner())
                .build();
    }
    @Bean
    public PartitionHandler inIDEfctInfDltRangePartitioner() {
        TaskExecutorPartitionHandler handler = new TaskExecutorPartitionHandler();
        //handler.setGridSize(4);
        handler.setTaskExecutor( inIDEfctInfDltPartitionHandlerTaskExecutor());
        handler.setStep(inIDEfctInfDltSonStep());//暂时存在
        try {
            handler.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return handler;
    }

    @Bean
    public SimpleAsyncTaskExecutor  inIDEfctInfDltPartitionHandlerTaskExecutor() {
        return new SimpleAsyncTaskExecutor();
    }
    @Bean
    public Step inIDEfctInfDltSonStep() {
        return stepBuilderFactory.get("InIDEfctInfDltSon")
                .<InIDEfctInfDlt,InIDEfctInfDlt>chunk(commit_interval)
                .reader(inIDEfctInfDltReader)
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
