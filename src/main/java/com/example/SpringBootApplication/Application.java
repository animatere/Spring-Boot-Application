package com.example.SpringBootApplication;

import com.example.SpringBootApplication.Api.UserController;
import com.example.SpringBootApplication.Model.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);


//		SpringApplication.run(Application.class, args);
//
//		ConfigurableApplicationContext configurableApplicationContext =
//				SpringApplication.run(SpringBootApplication.class, args);
//		IUserService userService =
//				configurableApplicationContext.getBean(IUserService.class);
//		userService.findAll();
	}


	@Bean
	CommandLineRunner runner(UserController userController) {

//		return args -> {
//			userController.save(new User("test", "test", "test@outlook.de"));
///		};

		return args -> {
			List<User> users = (List<User>) userController.findAll();
			for (User user : users) {
				System.out.println("Name: " + user.getName() + "\nVorname: " + user.getVorname());
			}
		};

	}
}
