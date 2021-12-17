package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "com.demo")
public class MySpringJpademoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MySpringJpademoApplication.class, args);
		
	}

}
