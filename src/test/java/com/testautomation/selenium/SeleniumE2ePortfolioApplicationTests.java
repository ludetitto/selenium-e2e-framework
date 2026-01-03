package com.testautomation.selenium;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

@Import(TestcontainersConfiguration.class)
@SpringBootTest
class SeleniumE2ePortfolioApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
	void abrirYCerrarNavegador() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://selenium.dev/");
		driver.close();
	}

}
