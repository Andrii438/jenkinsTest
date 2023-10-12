package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		Logger logger = LoggerFactory.getLogger(DemoApplication.class);
		logger.info("Hi it's a successful test on jenkins");
		SpringApplication.run(DemoApplication.class, args);
	}

}
