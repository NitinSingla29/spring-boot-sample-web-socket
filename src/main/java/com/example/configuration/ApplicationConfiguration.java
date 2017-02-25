package com.example.configuration;

import com.example.controller.HelloWorldConroller;
import com.example.wshandler.SampleWebSocketHandler;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackageClasses = {HelloWorldConroller.class, SampleWebSocketHandler.class})
@Import({WebSocketConfiguration.class})
public class ApplicationConfiguration {
}
