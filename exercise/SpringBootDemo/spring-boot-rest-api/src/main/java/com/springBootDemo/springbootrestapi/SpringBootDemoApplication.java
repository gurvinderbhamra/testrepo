package com.springBootDemo.springbootrestapi;

import com.springBootDemo.springbootrestapi.entity.Database;
import com.springBootDemo.springbootrestapi.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDemoApplication {

	Logger logger = LoggerFactory.getLogger(SpringBootDemoApplication.class);

	@Bean
	public User user(){
		User user = new User();
		user.setUsername("Suresh");
		user.setPassword("mypassword");
		return user;
	}

	@Bean
	public Database database(){
		Database database = new Database();
		return database;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

}
