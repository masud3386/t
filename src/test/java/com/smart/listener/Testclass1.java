package com.smart.listener;

import org.testng.annotations.Test;
//@Listeners(ItestImplementationClass.class)

public class Testclass1 {
	@Test(priority=1)
	public void testmethod1() {
		System.out.println("I am inside of testmethod1");
		
	}


@Test(priority=2)
public void testmethod2() {
	System.out.println("I am inside of testmethod2");
	
}
@Test(priority=3,timeOut=1000)
public void testmethod3() throws Exception {
	Thread.sleep(2000);
	System.out.println("I am inside of testmethod3");
	
}
@Test(priority=4,dependsOnMethods = "testmethod3")
public void testmethod4() {
	System.out.println("I am inside of testmethod4");
	
}
@Test(priority=5)
public void testmethod5() {
	System.out.println("I am inside of testmethod5");
	
}
@Test(priority=6)
public void testmethod6() {
	System.out.println("I am inside of testmethod6");
	
}
@Test(priority=7)
public void testmethod7() {
	System.out.println("I am inside of testmethod7");
	
}
}
