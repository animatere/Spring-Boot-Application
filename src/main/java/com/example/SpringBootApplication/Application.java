package com.example.SpringBootApplication;

import com.example.SpringBootApplication.Api.User;
import com.example.SpringBootApplication.Api.UserController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);

	}


	@Bean
	CommandLineRunner runner(UserController userController) {

		return args -> {
			userController.save(new User("test", "test", "test@outlook.de"));
		};

	}
}
