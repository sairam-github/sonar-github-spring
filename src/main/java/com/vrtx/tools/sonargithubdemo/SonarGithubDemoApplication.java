package com.vrtx.tools.sonargithubdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SonarGithubDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(SonarGithubDemoApplication.class, args);
		System.out.println(args);
	}
}
