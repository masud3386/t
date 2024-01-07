package com.smart.dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	WebDriver driver;
	@Test(dataProvider = "searchdata")
	public void testGoogle(String search) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.name("q")).sendKeys(search,Keys.ENTER);
		driver.close();
		
		
	}
	
	
	@DataProvider(parallel=true)
	public String [] searchdata() {
		return new String [] {
			"Prosmart",
			"Automation",
			"Holiday",
			"vacation place",
		};
	}
	

}
