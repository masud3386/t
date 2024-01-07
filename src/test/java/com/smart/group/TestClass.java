package com.smart.group;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {
	WebDriver driver;
	@Test(testName ="GoogleTest",groups= {"smoke"})
	public void testGoogle() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.name("q")).sendKeys("prosmart",Keys.ENTER);
		driver.close();
		
		
	}
	
	@Test(testName ="facebooktest", groups={"regression"})
	public void testfacebook() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("~!@#*&",Keys.ENTER);
        SoftAssert soft = new SoftAssert();
         String expectedTitle = "Log into Facebook";
		String errorMessage = "The email or mobile number you entered isn’t connected to an account. Find your account and log in.";
		String expectedColor = "1px solid rgb(240, 40, 73)";

		String actualTitle = driver.getTitle();
		String actualUrl = driver.getCurrentUrl();
		String actualErrorMessage = driver.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		String actualColor = driver.findElement(By.xpath("//input[@id='email']")).getCssValue("border");

		soft.assertEquals( actualTitle, expectedTitle, "Title mismatch!");

		soft.assertTrue(actualUrl.contains("https://www.facebook.com/login/?"));
		soft.assertEquals( actualErrorMessage, errorMessage, "Message mismatch!");
		soft.assertEquals( actualColor, expectedColor, "Color mismatch!");

		soft.assertAll();
		driver.close();
	}
	
	@Test(testName ="orangetest", groups={"sanity"})
	public void testoranghrm() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.close();
		
	}
	

}
