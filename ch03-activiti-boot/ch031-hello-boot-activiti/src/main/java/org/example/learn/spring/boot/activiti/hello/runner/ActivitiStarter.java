package org.example.learn.spring.boot.activiti.hello.runner;

import org.example.learn.spring.boot.activiti.hello.service.ActivitiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class ActivitiStarter implements CommandLineRunner {

    @Autowired
    private ActivitiService activitiService;

    @Override
    public void run(String... args) throws Exception {
        // Start the process on application startup
        activitiService.startProcess();
    }
}
