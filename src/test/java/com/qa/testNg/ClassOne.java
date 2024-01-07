package com.qa.testNg;

import static org.testng.Assert.*;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassOne {
	@Test
	public void googleTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("prosmart",Keys.ENTER);
		String actualTitle =driver.getTitle();
		String expectedTitle = "prosmart - Google Search";
		
		assertEquals(actualTitle, expectedTitle ,"Title mitchmatch");
		
		driver.quit();
		
	}
	
	@Test
	public void facebookTest() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("masud3386@yahoo.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("masud");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String actualtitle =driver.getTitle();
		String expectedtitle="facebook - login";
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualtitle, expectedtitle, "title did not match");
		driver.quit();
		soft.assertAll();
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
