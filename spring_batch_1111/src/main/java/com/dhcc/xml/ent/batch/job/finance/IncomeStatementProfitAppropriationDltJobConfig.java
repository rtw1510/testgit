package com.dhcc.xml.ent.batch.job.finance;

import com.dhcc.xml.ent.batch.listener.EntJobExecutionListener;
import com.dhcc.xml.ent.batch.partitioner.EntRangePartitioner;
import com.dhcc.xml.ent.entity.finance.IncomeStatementProfitAppropriationDlt;
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
public class IncomeStatementProfitAppropriationDltJobConfig {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private EntRangePartitioner entRangePartitioner;

    @Autowired
    @Qualifier("IncomeStatementProfitAppropriationDltProcessor")
    private ItemProcessor itemProcessor;

    @Autowired
    private SpringBatchWriter springBatchWriter;

    @Autowired
    private OracleIbatisPagingItemReader incomeStatementProfitAppropriationDltReader;

    @Autowired
    private EntJobExecutionListener entJobExecutionListener;
    private int commit_interval = 1000;

    @Bean("IncomeStatementProfitAppropriationDltJob")
    public Job incomeStatementProfitAppropriationDltJob(){
        return jobBuilderFactory.get("IncomeStatementProfitAppropriationDltJob")
                .start(incomeStatementProfitAppropriationDltFlow())
                .end()
                .listener(entJobExecutionListener)
                .build();
    }
    @Bean
    public Flow incomeStatementProfitAppropriationDltFlow() {
        return new FlowBuilder<Flow>("IncomeStatementProfitAppropriationDltFlow")
                .start(incomeStatementProfitAppropriationDltStep())
                .build();
    }

    @Bean
    public Step incomeStatementProfitAppropriationDltStep() {
        return stepBuilderFactory.get("IncomeStatementProfitAppropriationDltStep")
                .partitioner(incomeStatementProfitAppropriationDltSonStep().getName(),entRangePartitioner)
                .partitionHandler(incomeStatementProfitAppropriationDltRangePartitioner())
                .build();
    }
    @Bean
    public PartitionHandler incomeStatementProfitAppropriationDltRangePartitioner() {
        TaskExecutorPartitionHandler handler = new TaskExecutorPartitionHandler();
        //handler.setGridSize(4);
        handler.setTaskExecutor( incomeStatementProfitAppropriationDltPartitionHandlerTaskExecutor());
        handler.setStep(incomeStatementProfitAppropriationDltSonStep());//暂时存在
        try {
            handler.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return handler;
    }

    @Bean
    public SimpleAsyncTaskExecutor  incomeStatementProfitAppropriationDltPartitionHandlerTaskExecutor() {
        return new SimpleAsyncTaskExecutor();
    }
    @Bean
    public Step incomeStatementProfitAppropriationDltSonStep() {
        return stepBuilderFactory.get("IncomeStatementProfitAppropriationDltSon")
                .<IncomeStatementProfitAppropriationDlt,IncomeStatementProfitAppropriationDlt>chunk(commit_interval)
                .reader(incomeStatementProfitAppropriationDltReader)
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
