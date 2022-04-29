package com.zee.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ComZeeDemoApplication {

	private final static Logger LOG = LoggerFactory.getLogger(ComZeeDemoApplication.class);

	public static void main(String[] args) {
		LOG.info("Start");
		SpringApplication.run(ComZeeDemoApplication.class, args);
		LOG.info("End");

	}

}
