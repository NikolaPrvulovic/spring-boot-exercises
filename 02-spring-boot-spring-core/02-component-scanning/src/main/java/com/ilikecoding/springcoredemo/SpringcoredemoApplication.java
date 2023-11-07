package com.ilikecoding.springcoredemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
		// scans for components in the specified packages outside the main app package
//		scanBasePackages={
//				"com.ilikecoding.springcoredemo",
//				"com.ilikecoding.util"
//		}
)

public class SpringcoredemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcoredemoApplication.class, args);
	}

}
