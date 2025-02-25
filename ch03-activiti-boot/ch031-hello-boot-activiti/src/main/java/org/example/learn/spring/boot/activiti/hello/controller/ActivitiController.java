package org.example.learn.spring.boot.activiti.hello.controller;

import org.example.learn.spring.boot.activiti.hello.service.ActivitiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActivitiController {

    @Autowired
    private ActivitiService activitiService;

    @GetMapping("/start-process/{processDefinitionKey}")
    public String startProcess(@PathVariable("processDefinitionKey") String processDefinitionKey) {
        activitiService.startProcess(processDefinitionKey);
        return "Process Started!";
    }
}