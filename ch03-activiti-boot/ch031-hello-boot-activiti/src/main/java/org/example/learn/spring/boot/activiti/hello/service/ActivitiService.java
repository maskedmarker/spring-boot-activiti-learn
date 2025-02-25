package org.example.learn.spring.boot.activiti.hello.service;

import org.activiti.engine.RuntimeService;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ActivitiService {

    @Autowired
    private RuntimeService runtimeService;

    public void startProcess() {
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("Process_1");
        System.out.println("Started process instance with ID: " + processInstance.getId());
    }
}
