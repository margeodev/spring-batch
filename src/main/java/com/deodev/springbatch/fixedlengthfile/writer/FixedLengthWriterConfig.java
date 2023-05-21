package com.deodev.springbatch.fixedlengthfile.writer;

import com.deodev.springbatch.fixedlengthfile.domain.Client;
import org.springframework.batch.item.ItemWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FixedLengthWriterConfig {

    @Bean
    public ItemWriter<Client> fixedWidthFileWriter() {
        return items -> items.forEach(System.out::println);
    }
}
