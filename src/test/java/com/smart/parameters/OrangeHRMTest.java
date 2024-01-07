package com.smart.parameters;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMTest {
	WebDriver driver;
	@Parameters("browserName")
	@BeforeMethod
	public void initilizeBrowsr(@Optional("chrome")String browserName) {
		switch(browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver();
			driver = new EdgeDriver();
			break;
			default:
				System.out.println("this browser is not supported");
		}
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void teardown() {
		driver.quit();
		
	}
	
	
	@Test
	@Parameters({"url","uname","pas"})
	public void launchapplication(String url,String uname,String pas) {
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(uname);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pas);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
	}
	@Test
	public void validatelogin() {
	
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).getText();
	}
	@Test
	public void navigatetomyinfor() {
		driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
		
	}
	@Test
	public void myinfo() {
		driver.findElement(By.xpath("//h6[normalize-space()='Personal Details']")).isDisplayed();
		
	}
	

}
