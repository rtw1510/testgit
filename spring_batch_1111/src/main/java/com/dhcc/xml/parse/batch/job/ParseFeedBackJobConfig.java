package com.dhcc.xml.parse.batch.job;

import com.dhcc.xml.parse.entity.FeedBackContext;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.StepExecutionListener;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.job.builder.FlowBuilder;
import org.springframework.batch.core.job.flow.Flow;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class ParseFeedBackJobConfig {
    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Autowired
    @Qualifier("batchItemProcessor")
    private ItemProcessor itemProcessor;

    @Autowired
    @Qualifier("batchItemWriter")
    private ItemWriter itemWriter;

    /*@Autowired
    @Qualifier("batchItemReader")
    private ItemReader itemReader;*/

    @Autowired
    @Qualifier("parseJobListener")
    private JobExecutionListener jobExecutionListener;
    @Autowired
    @Qualifier("parseStepListener")
    private StepExecutionListener stepExecutionListener;
    private int commit_interval = 1000;

    @Bean("parseFeedBackJob")
    public Job parseFeedBackJob(){
        return jobBuilderFactory.get("parseFeedBackJob")
                .start(importFeedBackFileFlow())
                .end()
                .listener(jobExecutionListener)
                .build();
    }
    @Bean
    public Flow importFeedBackFileFlow() {
        return new FlowBuilder<Flow>("importFeedBackFileFlow")
                .start(importFeedBackFileStep())
                .build();
    }

    @Bean
    public Step importFeedBackFileStep() {
        return stepBuilderFactory.get("importFeedBackFileStep")
                .<FeedBackContext,FeedBackContext>chunk(commit_interval)
                //.listener(stepExecutionListener)类型未知
                .reader(itemReader)
                .processor(itemProcessor)
                .writer(itemWriter)
                .build();
    }
}
