package com.ggiova.chatbot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tools.jackson.databind.ObjectMapper;

/**
 * Configuration class for the app.
 * <p>
 * Currently has a bean for ObjectMapper.
 */
@Configuration
public class Config {
    /**
     * @return a new ObjectMapper
     * @see ObjectMapper
     */
    @Bean
    ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
