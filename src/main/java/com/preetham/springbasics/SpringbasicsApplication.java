package com.preetham.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbasicsApplication {

	public static void main(String[] args) {
		//We are getting the object created by spring fo the Dev class from the IOC container and then we are using it.
		ApplicationContext context=SpringApplication.run(SpringbasicsApplication.class, args);
		Dev dev=context.getBean(Dev.class);
		dev.code();

	}

}
