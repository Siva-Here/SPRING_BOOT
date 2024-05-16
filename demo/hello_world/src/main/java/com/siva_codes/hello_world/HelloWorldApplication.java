package com.siva_codes.hello_world;

import javax.swing.GroupLayout;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context= SpringApplication.run(HelloWorldApplication.class, args);
		System.out.println("Hello WOorld... I am siva learning springboot");

		Alien a = context.getBean(Alien.class);

		a.show();


		// Alien a1 = context.getBean(Alien.class);

		// a1.show();

	}

} 
