package com.qa.testNg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class anotation {
  @Test
  public void testone() {
	  //testing if i got pushed my code
	  System.out.println("test one got executed");
  }
  @Test
  public void testone() {
	  System.out.println("test one got executed");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("test one got System.out.println(\"test one got executed\");");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("test one got afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("test one got afterMethod");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("test one got afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("test one got beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("test one got afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("test one got beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("test one got afterSuite());
  }

}
