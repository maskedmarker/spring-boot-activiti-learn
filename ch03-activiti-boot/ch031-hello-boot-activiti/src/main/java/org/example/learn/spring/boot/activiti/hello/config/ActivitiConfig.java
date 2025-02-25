package org.example.learn.spring.boot.activiti.hello.config;

import org.example.learn.spring.boot.activiti.hello.runner.ActivitiStarter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ActivitiConfig {

    @Bean
    public ActivitiStarter activitiStarter() {
        return new ActivitiStarter();
    }
}
