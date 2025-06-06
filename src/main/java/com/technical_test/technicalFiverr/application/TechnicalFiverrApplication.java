package com.technical_test.technicalFiverr.application;

import com.technical_test.technicalFiverr.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechnicalFiverrApplication {

	@Autowired
	UserRepository userRepository;


	public static void main(String[] args) {
		SpringApplication.run(TechnicalFiverrApplication.class, args);
	}

}
