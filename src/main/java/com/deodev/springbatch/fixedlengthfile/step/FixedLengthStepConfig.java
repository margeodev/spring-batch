package com.deodev.springbatch.fixedlengthfile.step;

import com.deodev.springbatch.fixedlengthfile.domain.Client;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.batch.item.ItemReader;

@Configuration
@RequiredArgsConstructor
public class FixedLengthStepConfig {

    public final StepBuilderFactory factory;

    @Bean
    public Step fixedWidthFileStep(ItemReader<Client> fixedWidthFileReader,
                                   ItemWriter<Client> fixedWidthFileWriter) {
        return factory
                .get("fixedWidthFileStep")
                .<Client, Client>chunk(1)
                .reader(fixedWidthFileReader)
                .writer(fixedWidthFileWriter)
                .build();
    }
}
