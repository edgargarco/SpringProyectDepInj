package com.springProject.springProject;

import com.springProject.springProject.controllers.GretingController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/spring/spring-config.xml")
public class SpringProjectApplication {

	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(SpringProjectApplication.class, args);
		GretingController gretingController = (GretingController) applicationContext.getBean("gretingController");
		gretingController.sayHello();


	}

}
