package com.example.obspringsecuritycifrado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ObSpringSecurityCifradoApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(ObSpringSecurityCifradoApplication.class, args);
		UserRepository repository = context.getBean(UserRepository.class);

		User user = new User(null,"usuario","admin");
		repository.save(user);
	}

}
