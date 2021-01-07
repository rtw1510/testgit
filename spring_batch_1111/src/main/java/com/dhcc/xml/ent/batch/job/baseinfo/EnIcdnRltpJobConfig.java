package com.dhcc.xml.ent.batch.job.baseinfo;

import com.dhcc.xml.ent.batch.listener.EntJobExecutionListener;
import com.dhcc.xml.ent.batch.partitioner.EntRangePartitioner;
import com.dhcc.xml.ent.entity.baseinfo.EnIcdnRltpInf;
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
public class EnIcdnRltpJobConfig {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private EntRangePartitioner entRangePartitioner;

    @Autowired
    @Qualifier("EnIcdnRltpInfProcessor")
    private ItemProcessor itemProcessor;

    @Autowired
    private SpringBatchWriter springBatchWriter;

    @Autowired
    private OracleIbatisPagingItemReader enIcdnRltpReader;

    @Autowired
    private EntJobExecutionListener entJobExecutionListener;
    private int commit_interval = 1000;

    @Bean("EnIcdnRltpJob")
    public Job enIcdnRltpJob(){
        return jobBuilderFactory.get("EnIcdnRltpJob")
                .start(enIcdnRltpFlow())
                .end()
                .listener(entJobExecutionListener)
                .build();
    }
    @Bean
    public Flow enIcdnRltpFlow() {
        return new FlowBuilder<Flow>("EnIcdnRltpFlow")
                .start(enIcdnRltpStep())
                .build();
    }

    @Bean
    public Step enIcdnRltpStep() {
        return stepBuilderFactory.get("EnIcdnRltpStep")
                .partitioner(enIcdnRltpSonStep().getName(),entRangePartitioner)
                .partitionHandler(enIcdnRltpRangePartitioner())
                .build();
    }
    @Bean
    public PartitionHandler enIcdnRltpRangePartitioner() {
        TaskExecutorPartitionHandler handler = new TaskExecutorPartitionHandler();
        //handler.setGridSize(4);
        handler.setTaskExecutor( enIcdnRltpPartitionHandlerTaskExecutor());
        handler.setStep(enIcdnRltpSonStep());//暂时存在
        try {
            handler.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return handler;
    }

    @Bean
    public SimpleAsyncTaskExecutor  enIcdnRltpPartitionHandlerTaskExecutor() {
        return new SimpleAsyncTaskExecutor();
    }
    @Bean
    public Step enIcdnRltpSonStep() {
        return stepBuilderFactory.get("EnIcdnRltpSon")
                .<EnIcdnRltpInf,EnIcdnRltpInf>chunk(commit_interval)
                .reader(enIcdnRltpReader)
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
