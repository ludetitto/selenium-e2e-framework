package com.testautomation.selenium.saucedemo;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LoginTest {
	@Test
	void loginNoExitoso() {
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("Username");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Password");
		
		driver.findElement(By.id("login-button")).click();
		
		driver.quit();
	}
}
