package com.qa.testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassTwo {
	WebDriver driver;
	@Test
	public void launchapplication() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	
	@Test
	public void logintpapplication() {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
	}
	
	@Test
	public void validatesigin() {
		String actual= driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).getText();
		String expected = "Paul Collings";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actual, expected, "invalid credentials");
		driver.quit();
		soft.assertAll();
	}
	
	
	
	
	
	
	
	
	
	

}
