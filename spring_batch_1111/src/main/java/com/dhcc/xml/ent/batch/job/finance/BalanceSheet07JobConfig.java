package com.dhcc.xml.ent.batch.job.finance;

import com.dhcc.xml.ent.batch.listener.EntJobExecutionListener;
import com.dhcc.xml.ent.batch.partitioner.EntRangePartitioner;
import com.dhcc.xml.ent.entity.finance.db.EB_FinaBal07_Info;
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
public class BalanceSheet07JobConfig {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private EntRangePartitioner entRangePartitioner;

    @Autowired
    @Qualifier("BalanceSheet2007SgmtProcessor")
    private ItemProcessor itemProcessor;

    @Autowired
    private SpringBatchWriter springBatchWriter;

    @Autowired
    private OracleIbatisPagingItemReader balanceSheet07Reader;

    @Autowired
    private EntJobExecutionListener entJobExecutionListener;
    private int commit_interval = 1000;

    @Bean("BalanceSheet07Job")
    public Job balanceSheet07Job(){
        return jobBuilderFactory.get("BalanceSheet07Job")
                .start(balanceSheet07Flow())
                .end()
                .listener(entJobExecutionListener)
                .build();
    }
    @Bean
    public Flow balanceSheet07Flow() {
        return new FlowBuilder<Flow>("BalanceSheet07Flow")
                .start(balanceSheet07Step())
                .build();
    }

    @Bean
    public Step balanceSheet07Step() {
        return stepBuilderFactory.get("BalanceSheet07Step")
                .partitioner(balanceSheet07SonStep().getName(),entRangePartitioner)
                .partitionHandler(balanceSheet07RangePartitioner())
                .build();
    }
    @Bean
    public PartitionHandler balanceSheet07RangePartitioner() {
        TaskExecutorPartitionHandler handler = new TaskExecutorPartitionHandler();
        //handler.setGridSize(4);
        handler.setTaskExecutor( balanceSheet07PartitionHandlerTaskExecutor());
        handler.setStep(balanceSheet07SonStep());//暂时存在
        try {
            handler.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return handler;
    }

    @Bean
    public SimpleAsyncTaskExecutor  balanceSheet07PartitionHandlerTaskExecutor() {
        return new SimpleAsyncTaskExecutor();
    }
    @Bean
    public Step balanceSheet07SonStep() {
        return stepBuilderFactory.get("BalanceSheet07Son")
                .<EB_FinaBal07_Info,EB_FinaBal07_Info>chunk(commit_interval)
                .reader(balanceSheet07Reader)
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
