package org.examlpe.testproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;

@Configuration
public class StoreConfiguration {
    @Bean
    public HashMap<String, String> store() {
        return new HashMap<>();
    }
}
