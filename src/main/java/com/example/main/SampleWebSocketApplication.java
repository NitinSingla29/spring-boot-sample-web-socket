package com.example.main;
import com.example.controller.HelloWorldConroller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses = {HelloWorldConroller.class})
public class SampleWebSocketApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SampleWebSocketApplication.class, args);
    }
}