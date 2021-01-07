package com.dhcc.xml.ent.batch.job.finance;

import com.dhcc.xml.ent.batch.listener.EntJobExecutionListener;
import com.dhcc.xml.ent.batch.partitioner.EntRangePartitioner;
import com.dhcc.xml.ent.entity.finance.db.EB_FinaCsh07_Info;
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
public class CashFlows07JobConfig {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private EntRangePartitioner entRangePartitioner;

    @Autowired
    @Qualifier("CashFlows2007SgmtProcessor")
    private ItemProcessor itemProcessor;

    @Autowired
    private SpringBatchWriter springBatchWriter;

    @Autowired
    private OracleIbatisPagingItemReader cashFlows07Reader;

    @Autowired
    private EntJobExecutionListener entJobExecutionListener;
    private int commit_interval = 1000;

    @Bean("CashFlows07Job")
    public Job cashFlows07Job(){
        return jobBuilderFactory.get("CashFlows07Job")
                .start(cashFlows07Flow())
                .end()
                .listener(entJobExecutionListener)
                .build();
    }
    @Bean
    public Flow cashFlows07Flow() {
        return new FlowBuilder<Flow>("CashFlows07Flow")
                .start(cashFlows07Step())
                .build();
    }

    @Bean
    public Step cashFlows07Step() {
        return stepBuilderFactory.get("CashFlows07Step")
                .partitioner(cashFlows07SonStep().getName(),entRangePartitioner)
                .partitionHandler(cashFlows07RangePartitioner())
                .build();
    }
    @Bean
    public PartitionHandler cashFlows07RangePartitioner() {
        TaskExecutorPartitionHandler handler = new TaskExecutorPartitionHandler();
        //handler.setGridSize(4);
        handler.setTaskExecutor( cashFlows07PartitionHandlerTaskExecutor());
        handler.setStep(cashFlows07SonStep());//暂时存在
        try {
            handler.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return handler;
    }

    @Bean
    public SimpleAsyncTaskExecutor  cashFlows07PartitionHandlerTaskExecutor() {
        return new SimpleAsyncTaskExecutor();
    }
    @Bean
    public Step cashFlows07SonStep() {
        return stepBuilderFactory.get("CashFlows07Son")
                .<EB_FinaCsh07_Info,EB_FinaCsh07_Info>chunk(commit_interval)
                .reader(cashFlows07Reader)
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
