package com.springProject.springProject.controllers;

import com.springProject.springProject.services.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

//@Controller
public class GretingController {
    private HelloWorldService helloWorldService;
    private HelloWorldService helloWorldServiceRussian;

    @Autowired
    @Qualifier("helloWorldImpl")
    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }
    @Autowired
    @Qualifier("helloWorldServiceRussian")
    public void setHelloWorldServiceRussian(HelloWorldService helloWorldServiceRussian) {
        this.helloWorldServiceRussian = helloWorldServiceRussian;
    }

    public String sayHello(){
        String greting = helloWorldService.getGreting();
        System.out.println(greting);
        System.out.println(helloWorldServiceRussian.getGreting());
        return greting;
    }
}
