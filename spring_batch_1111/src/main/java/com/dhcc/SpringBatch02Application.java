package com.dhcc;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.dhcc.*"})
@EnableBatchProcessing
public class SpringBatch02Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringBatch02Application.class, args);
    }
}
