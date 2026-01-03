package com.testautomation.selenium;

import org.springframework.boot.SpringApplication;

public class TestSeleniumE2ePortfolioApplication {

	public static void main(String[] args) {
		SpringApplication.from(SeleniumE2ePortfolioApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
