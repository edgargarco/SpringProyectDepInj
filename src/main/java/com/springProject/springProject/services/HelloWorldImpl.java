package com.springProject.springProject.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


public class HelloWorldImpl implements HelloWorldService {
    @Override
    public String getGreting() {
        return "Hello World!";
    }
}
