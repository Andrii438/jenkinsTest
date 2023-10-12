package com.example.demo;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class DemoApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);
	@Test
	void contextLoads() {
		logger.debug("Hi it's a successful test");
		assertTrue(true);
	}

	@Test
	public void successfulTest(){
		logger.info("Hi it's a successful test on jenkins");
		assertTrue(true);
	}
}
