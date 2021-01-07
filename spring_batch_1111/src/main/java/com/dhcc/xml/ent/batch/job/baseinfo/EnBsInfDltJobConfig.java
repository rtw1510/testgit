package com.dhcc.xml.ent.batch.job.baseinfo;

import com.dhcc.xml.ent.batch.listener.EntJobExecutionListener;
import com.dhcc.xml.ent.batch.partitioner.EntRangePartitioner;
import com.dhcc.xml.ent.entity.baseinfo.EnBsInfDlt;
import com.dhcc.xml.per.batch.reader.OracleIbatisPagingItemReader;
import com.dhcc.xml.per.batch.writer.SpringBatchWriter;
import com.dhcc.xml.per.entity.baseinfo.InBsInfDlt;
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
public class EnBsInfDltJobConfig {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private EntRangePartitioner entRangePartitioner;

    @Autowired
    @Qualifier("EnBsInfDltProcessor")
    private ItemProcessor itemProcessor;

    @Autowired
    private SpringBatchWriter springBatchWriter;

    @Autowired
    private OracleIbatisPagingItemReader enBsInfDltReader;

    @Autowired
    private EntJobExecutionListener entJobExecutionListener;
    private int commit_interval = 1000;

    @Bean("EnBsInfDltJob")
    public Job enBsInfDltJob(){
        return jobBuilderFactory.get("EnBsInfDltJob")
                .start(enBsInfDltFlow())
                .end()
                .listener(entJobExecutionListener)
                .build();
    }
    @Bean
    public Flow enBsInfDltFlow() {
        return new FlowBuilder<Flow>("EnBsInfDltFlow")
                .start(enBsInfDltStep())
                .build();
    }

    @Bean
    public Step enBsInfDltStep() {
        return stepBuilderFactory.get("EnBsInfDltStep")
                .partitioner(enBsInfDltSonStep().getName(),entRangePartitioner)
                .partitionHandler(enBsInfDltRangePartitioner())
                .build();
    }
    @Bean
    public PartitionHandler enBsInfDltRangePartitioner() {
        TaskExecutorPartitionHandler handler = new TaskExecutorPartitionHandler();
        //handler.setGridSize(4);
        handler.setTaskExecutor( enBsInfDltPartitionHandlerTaskExecutor());
        handler.setStep(enBsInfDltSonStep());//暂时存在
        try {
            handler.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return handler;
    }

    @Bean
    public SimpleAsyncTaskExecutor  enBsInfDltPartitionHandlerTaskExecutor() {
        return new SimpleAsyncTaskExecutor();
    }
    @Bean
    public Step enBsInfDltSonStep() {
        return stepBuilderFactory.get("EnBsInfDltSon")
                .<EnBsInfDlt,EnBsInfDlt>chunk(commit_interval)
                .reader(enBsInfDltReader)
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
