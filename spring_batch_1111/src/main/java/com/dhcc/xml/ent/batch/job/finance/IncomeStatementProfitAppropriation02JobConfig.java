package com.dhcc.xml.ent.batch.job.finance;

import com.dhcc.xml.ent.batch.listener.EntJobExecutionListener;
import com.dhcc.xml.ent.batch.partitioner.EntRangePartitioner;
import com.dhcc.xml.ent.entity.finance.db.EB_FinaPro02_Info;
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
public class IncomeStatementProfitAppropriation02JobConfig {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private EntRangePartitioner entRangePartitioner;

    @Autowired
    @Qualifier("IncomeStatementProfitAppropriation2002SgmtProcessor")
    private ItemProcessor itemProcessor;

    @Autowired
    private SpringBatchWriter springBatchWriter;

    @Autowired
    private OracleIbatisPagingItemReader incomeStatementProfitAppropriation02Reader;

    @Autowired
    private EntJobExecutionListener entJobExecutionListener;
    private int commit_interval = 1000;

    @Bean("IncomeStatementProfitAppropriation02Job")
    public Job incomeStatementProfitAppropriation02Job(){
        return jobBuilderFactory.get("IncomeStatementProfitAppropriation02Job")
                .start(incomeStatementProfitAppropriation02Flow())
                .end()
                .listener(entJobExecutionListener)
                .build();
    }
    @Bean
    public Flow incomeStatementProfitAppropriation02Flow() {
        return new FlowBuilder<Flow>("IncomeStatementProfitAppropriation02Flow")
                .start(incomeStatementProfitAppropriation02Step())
                .build();
    }

    @Bean
    public Step incomeStatementProfitAppropriation02Step() {
        return stepBuilderFactory.get("IncomeStatementProfitAppropriation02Step")
                .partitioner(incomeStatementProfitAppropriation02SonStep().getName(),entRangePartitioner)
                .partitionHandler(incomeStatementProfitAppropriation02RangePartitioner())
                .build();
    }
    @Bean
    public PartitionHandler incomeStatementProfitAppropriation02RangePartitioner() {
        TaskExecutorPartitionHandler handler = new TaskExecutorPartitionHandler();
        //handler.setGridSize(4);
        handler.setTaskExecutor( incomeStatementProfitAppropriation02PartitionHandlerTaskExecutor());
        handler.setStep(incomeStatementProfitAppropriation02SonStep());//暂时存在
        try {
            handler.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return handler;
    }

    @Bean
    public SimpleAsyncTaskExecutor  incomeStatementProfitAppropriation02PartitionHandlerTaskExecutor() {
        return new SimpleAsyncTaskExecutor();
    }
    @Bean
    public Step incomeStatementProfitAppropriation02SonStep() {
        return stepBuilderFactory.get("IncomeStatementProfitAppropriation02Son")
                .<EB_FinaPro02_Info,EB_FinaPro02_Info>chunk(commit_interval)
                .reader(incomeStatementProfitAppropriation02Reader)
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
