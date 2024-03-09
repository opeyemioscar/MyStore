package com.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;

public class BaseClass {

	public WebDriver driver;
	
	public void gotologin() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.navigate().to("https:.//google.com");
	}
	
}
