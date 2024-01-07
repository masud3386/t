package com.smart.group;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public class OrangeHRMTest {
		 WebDriver driver;
		
		@BeforeMethod
		public void initilizeBrowsr(String browserName) {
			WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			driver.manage().window().maximize();
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

}
}
