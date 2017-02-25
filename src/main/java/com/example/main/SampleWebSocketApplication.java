package com.example.main;

import com.example.configuration.ApplicationConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(ApplicationConfiguration.class)
public class SampleWebSocketApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleWebSocketApplication.class, args);
    }
}