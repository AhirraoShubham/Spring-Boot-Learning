package com.shubham.learnspringcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// This is just for testing the another package access.
//@SpringBootApplication(
//		scanBasePackages = {
//				"com.shubham.learnspringcore",
//				"com.shubham.util"
//		}
//)

@SpringBootApplication
public class LearnspringcoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnspringcoreApplication.class, args);
	}

}
