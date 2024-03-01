package com.example.tabelafipe.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class TabelafipeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TabelafipeApplication.class, args);
	}

}
