package com.smart.group2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public class OrangeHRMTest {
		 WebDriver driver;
		@Parameters("browserName")
		@BeforeTest(alwaysRun = true)
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
		
		@AfterTest(alwaysRun=true)
		public void teardown() {
			driver.quit();
			
		}

}
}
