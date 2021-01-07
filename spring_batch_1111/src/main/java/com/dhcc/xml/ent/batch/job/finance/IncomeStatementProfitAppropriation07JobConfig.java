package com.dhcc.xml.ent.batch.job.finance;

import com.dhcc.xml.ent.batch.listener.EntJobExecutionListener;
import com.dhcc.xml.ent.batch.partitioner.EntRangePartitioner;
import com.dhcc.xml.ent.entity.finance.db.EB_FinaPro07_Info;
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
public class IncomeStatementProfitAppropriation07JobConfig {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private EntRangePartitioner entRangePartitioner;

    @Autowired
    @Qualifier("IncomeStatementProfitAppropriation2007SgmtProcessor")
    private ItemProcessor itemProcessor;

    @Autowired
    private SpringBatchWriter springBatchWriter;

    @Autowired
    private OracleIbatisPagingItemReader incomeStatementProfitAppropriation07Reader;

    @Autowired
    private EntJobExecutionListener entJobExecutionListener;
    private int commit_interval = 1000;

    @Bean("IncomeStatementProfitAppropriation07Job")
    public Job incomeStatementProfitAppropriation07Job(){
        return jobBuilderFactory.get("IncomeStatementProfitAppropriation07Job")
                .start(incomeStatementProfitAppropriation07Flow())
                .end()
                .listener(entJobExecutionListener)
                .build();
    }
    @Bean
    public Flow incomeStatementProfitAppropriation07Flow() {
        return new FlowBuilder<Flow>("IncomeStatementProfitAppropriation07Flow")
                .start(incomeStatementProfitAppropriation07Step())
                .build();
    }

    @Bean
    public Step incomeStatementProfitAppropriation07Step() {
        return stepBuilderFactory.get("IncomeStatementProfitAppropriation07Step")
                .partitioner(incomeStatementProfitAppropriation07SonStep().getName(),entRangePartitioner)
                .partitionHandler(incomeStatementProfitAppropriation07RangePartitioner())
                .build();
    }
    @Bean
    public PartitionHandler incomeStatementProfitAppropriation07RangePartitioner() {
        TaskExecutorPartitionHandler handler = new TaskExecutorPartitionHandler();
        //handler.setGridSize(4);
        handler.setTaskExecutor( incomeStatementProfitAppropriation07PartitionHandlerTaskExecutor());
        handler.setStep(incomeStatementProfitAppropriation07SonStep());//暂时存在
        try {
            handler.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return handler;
    }

    @Bean
    public SimpleAsyncTaskExecutor  incomeStatementProfitAppropriation07PartitionHandlerTaskExecutor() {
        return new SimpleAsyncTaskExecutor();
    }
    @Bean
    public Step incomeStatementProfitAppropriation07SonStep() {
        return stepBuilderFactory.get("IncomeStatementProfitAppropriation07Son")
                .<EB_FinaPro07_Info,EB_FinaPro07_Info>chunk(commit_interval)
                .reader(incomeStatementProfitAppropriation07Reader)
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
