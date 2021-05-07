package com.example.application;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.function.context.FunctionalSpringApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
@Slf4j
public class ServerlessApplication {

    public static void main(String[] args) {
        FunctionalSpringApplication.run(ServerlessApplication.class, args);
    }

    @Bean
    public Function<String, Boolean> isGreeting() {
        return content -> {
            log.debug("Handling request with content: {}", content);
            return StringUtils.containsAny(content.toLowerCase(), "hello", "hi", "hi there", "hiya", "howdy", "greetings");
        };
    }
}
