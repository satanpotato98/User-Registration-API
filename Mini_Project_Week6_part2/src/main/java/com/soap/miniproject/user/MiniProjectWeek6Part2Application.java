package com.soap.miniproject.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class MiniProjectWeek6Part2Application {

	public static void main(String[] args) {
		SpringApplication.run(MiniProjectWeek6Part2Application.class, args);
	}

	@Bean
	public RestTemplate  getRestTemplate() {
		
		
		return new RestTemplate();
		
	}
}
	