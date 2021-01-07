package com.dhcc.xml.per.batch.job.loaninfo;

import com.dhcc.xml.per.batch.listener.PerJobExecutionListener;
import com.dhcc.xml.per.batch.partitioner.PerRangePartitioner;
import com.dhcc.xml.per.batch.reader.OracleIbatisPagingItemReader;
import com.dhcc.xml.per.batch.writer.SpringBatchWriter;
import com.dhcc.xml.per.entity.baseinfo.InBsInfDlt;
import com.dhcc.xml.per.entity.loaninfo.db.Pb_AcctMdf_Info;
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
public class InAcctMdfcJobConfig {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private PerRangePartitioner perRangePartitioner;

    @Autowired
    @Qualifier("InAcctMdfcProcessor")
    private ItemProcessor itemProcessor;

    @Autowired
    private SpringBatchWriter springBatchWriter;

    @Autowired
    private OracleIbatisPagingItemReader inAcctMdfcReader;

    @Autowired
    private PerJobExecutionListener perJobExecutionListener;
    private int commit_interval = 1000;

    @Bean("InAcctMdfcJob")
    public Job inAcctMdfcJob(){
        return jobBuilderFactory.get("InAcctMdfcJob")
                .start(inAcctMdfcFlow())
                .end()
                .listener(perJobExecutionListener)
                .build();
    }
    @Bean
    public Flow inAcctMdfcFlow() {
        return new FlowBuilder<Flow>("InAcctMdfcFlow")
                .start(inAcctMdfcStep())
                .build();
    }

    @Bean
    public Step inAcctMdfcStep() {
        return stepBuilderFactory.get("InAcctMdfcStep")
                .partitioner(inAcctMdfcSonStep().getName(),perRangePartitioner)
                .partitionHandler(inAcctMdfcRangePartitioner())
                .build();
    }
    @Bean
    public PartitionHandler inAcctMdfcRangePartitioner() {
        TaskExecutorPartitionHandler handler = new TaskExecutorPartitionHandler();
        //handler.setGridSize(4);
        handler.setTaskExecutor( inAcctMdfcPartitionHandlerTaskExecutor());
        handler.setStep(inAcctMdfcSonStep());//暂时存在
        try {
            handler.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return handler;
    }

    @Bean
    public SimpleAsyncTaskExecutor  inAcctMdfcPartitionHandlerTaskExecutor() {
        return new SimpleAsyncTaskExecutor();
    }
    @Bean
    public Step inAcctMdfcSonStep() {
        return stepBuilderFactory.get("InAcctMdfcSon")
                .<Pb_AcctMdf_Info,Pb_AcctMdf_Info>chunk(commit_interval)
                .reader(inAcctMdfcReader)
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
