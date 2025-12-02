package com.test_spring_boot.test_spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
<<<<<<< HEAD
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
=======
>>>>>>> 586d52d7054a6bcc5d89fbc67f1e533f79699f65
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class TestSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringBootApplication.class, args);
	}

	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
<<<<<<< HEAD

	@Bean
	public JavaMailSender javaMailSender() {
		return new JavaMailSenderImpl();
	}
=======
>>>>>>> 586d52d7054a6bcc5d89fbc67f1e533f79699f65
}
