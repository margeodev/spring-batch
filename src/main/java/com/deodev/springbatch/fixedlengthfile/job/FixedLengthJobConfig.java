package com.deodev.springbatch.fixedlengthfile.job;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@EnableBatchProcessing
@Configuration
public class FixedLengthJobConfig {

    private final JobBuilderFactory factory;

    @Bean
    public Job fixedWidthFileJob(Step fixedWidthStepRead) {
        return factory
                .get("fixedWidthFileJob")
                .start(fixedWidthStepRead)
                .incrementer(new RunIdIncrementer())
                .build();
    }
}
