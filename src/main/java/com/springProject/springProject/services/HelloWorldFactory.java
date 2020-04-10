package com.springProject.springProject.services;

public class HelloWorldFactory {
    public HelloWorldService createHelloWorldService(String language) {
        HelloWorldService helloWorldService = null;
        switch (language) {
            case "en":
                helloWorldService = new HelloWorldImpl();
                break;
            case "es":
                helloWorldService = new HelloWorldSpanishImpl();
                break;
            case "ru":
                helloWorldService = new HelloWorldRussianImpl();
                break;
            case "ch":
                helloWorldService = new HelloWorldChinneseImpl();
                break;
            default:
                new HelloWorldImpl();
        }
        return helloWorldService;
    }
}
