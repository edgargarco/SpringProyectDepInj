package com.springProject.springProject.config;

import com.springProject.springProject.services.HelloWorldFactory;
import com.springProject.springProject.services.HelloWorldImpl;
import com.springProject.springProject.services.HelloWorldService;
import com.springProject.springProject.services.HelloWorldSpanishImpl;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class HelloConfig {
    @Bean
    public HelloWorldFactory helloWorldFactory(){
        return new HelloWorldFactory();
    }

    @Bean
    @Profile("english")
    public HelloWorldService helloWorldImpl(HelloWorldFactory factory){
        return factory.createHelloWorldService("en");
    }
    @Bean
    @Profile("spanish")
    public HelloWorldService helloWorldSpanishImpl(HelloWorldFactory factory){
        return factory.createHelloWorldService("es");
    }
    @Bean
    public HelloWorldService helloWorldServiceRussian(HelloWorldFactory factory){
        return factory.createHelloWorldService("ru");
    }
    @Bean
    public HelloWorldService helloWorldServiceChinnese(HelloWorldFactory factory){
        return factory.createHelloWorldService("ch");
    }
}
