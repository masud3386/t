package com.smart.parallel;

import org.testng.annotations.Test;

public class TestClass2 {
	@Test
	public void testmethod5() {
		System.out.println("TestClass2>>testmethod5" +Thread.currentThread().getName());
		
	}
	@Test
	public void testmethod6() {
		System.out.println("TestClass2>>testmethod6" +Thread.currentThread().getName());
		
	}
	@Test
	public void testmethod7() {
		System.out.println("TestClass2>>testmethod7" +Thread.currentThread().getName());
		
	}
	

}
