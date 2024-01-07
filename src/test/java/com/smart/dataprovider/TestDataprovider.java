package com.smart.dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestDataprovider {
	@Test(dataProvider="getData")

	public void testoranghrm(String userName,String password) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		driver.close();
		
	}
	@DataProvider(name="getData")
	public Object[] []suplydata() {
		return new Object[][] 
		{
			{"Admin","admin123"},
			{"username1","password1"},
			{"username2","password2"}
		};
		
		
		
	}

}
