package com.smart.InvoCationCount;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestInvocaton {
	@Test(invocationCount = 6,threadPoolSize = 2)
	public void testmethod1() throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.randomuser.me/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//li[@data-label='name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("user_value")).getText();
		driver.close();
		
		
	}

}
