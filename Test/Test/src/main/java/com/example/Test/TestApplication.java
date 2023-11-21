// src/main/java/com/example/test/TestApplication.java
package com.example.Test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class TestApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestApplication.class, args);
	}

	@Bean
	CommandLineRunner run(MessageService messageService) {
		return args -> {
			try {
				messageService.decodeMessages().forEach(System.out::println);
			} catch (IOException e) {
				e.printStackTrace();
			}
		};
	}
}
