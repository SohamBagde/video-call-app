package com.soham.videocallapp;

import com.soham.videocallapp.user.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import com.soham.videocallapp.user.User;

@SpringBootApplication
public class VideocallApplication {

	public static void main(String[] args) {
		SpringApplication.run(VideocallApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(UserService userService) {
		return args -> {
			userService.register(User.builder()
					.username("soham")
					.email("soham@gmail.com")
					.password("soham")
					.build());

			userService.register(User.builder()
					.username("leo")
					.email("leo@gmail.com")
					.password("leo")
					.build());

			userService.register(User.builder()
					.username("john")
					.email("john@gmail.com")
					.password("john")
					.build());

		};
	}

}