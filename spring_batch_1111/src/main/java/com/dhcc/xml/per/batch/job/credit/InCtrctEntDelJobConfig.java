package com.dhcc.xml.per.batch.job.credit;

import com.dhcc.xml.per.batch.listener.PerJobExecutionListener;
import com.dhcc.xml.per.batch.partitioner.PerRangePartitioner;
import com.dhcc.xml.per.batch.reader.OracleIbatisPagingItemReader;
import com.dhcc.xml.per.batch.writer.SpringBatchWriter;
import com.dhcc.xml.per.entity.baseinfo.db.Pb_CustBase_Info;
import com.dhcc.xml.per.entity.credit.InCtrctEntDel;
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
public class InCtrctEntDelJobConfig {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    private PerRangePartitioner perRangePartitioner;

    @Autowired
    @Qualifier("InCtrctEntDelProcessor")
    private ItemProcessor itemProcessor;

    @Autowired
    private SpringBatchWriter springBatchWriter;

    @Autowired
    private OracleIbatisPagingItemReader inCtrctEntDelReader;

    @Autowired
    private PerJobExecutionListener perJobExecutionListener;
    private int commit_interval = 1000;

    @Bean("InCtrctEntDelJob")
    public Job inCtrctEntDelJob(){
        return jobBuilderFactory.get("InCtrctEntDelJob")
                .start(inCtrctEntDelFlow())
                .end()
                .listener(perJobExecutionListener)
                .build();
    }
    @Bean
    public Flow inCtrctEntDelFlow() {
        return new FlowBuilder<Flow>("InCtrctEntDelFlow")
                .start(inCtrctEntDelStep())
                .build();
    }

    @Bean
    public Step inCtrctEntDelStep() {
        return stepBuilderFactory.get("InCtrctEntDelStep")
                .partitioner(inCtrctEntDelSonStep().getName(),perRangePartitioner)
                .partitionHandler(inCtrctEntDelRangePartitioner())
                .build();
    }
    @Bean
    public PartitionHandler inCtrctEntDelRangePartitioner() {
        TaskExecutorPartitionHandler handler = new TaskExecutorPartitionHandler();
        //handler.setGridSize(4);
        handler.setTaskExecutor( inCtrctEntDelPartitionHandlerTaskExecutor());
        handler.setStep(inCtrctEntDelSonStep());//暂时存在
        try {
            handler.afterPropertiesSet();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return handler;
    }

    @Bean
    public SimpleAsyncTaskExecutor  inCtrctEntDelPartitionHandlerTaskExecutor() {
        return new SimpleAsyncTaskExecutor();
    }
    @Bean
    public Step inCtrctEntDelSonStep() {
        return stepBuilderFactory.get("InCtrctEntDelSon")
                .<InCtrctEntDel,InCtrctEntDel>chunk(commit_interval)
                .reader(inCtrctEntDelReader)
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
