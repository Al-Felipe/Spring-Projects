package com.example.BDRestAPI.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages = {"com.example"})
@EnableMongoRepositories("com.example.BDRestAPI.repository")
public class BdRestApiApplication {

	public static void main(String[] args) {

		SpringApplication.run(BdRestApiApplication.class, args);
	}

}
