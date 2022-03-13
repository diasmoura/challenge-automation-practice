package com.challenge.automation.pratice.core;

import java.time.Duration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {
	
	private static WebDriver driver;

	public Driver() {

	}

	public static WebDriver getDriver() {

		
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "/src/main/resources/chromedriver.exe");

		if (driver == null) {
			driver = new ChromeDriver();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.manage().window().maximize();
		}

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		return driver;

	}

	public static void encerraDriver() {
    	if(driver!=null) {
			driver.quit();
			driver=null;
		}
    	
    }

}
