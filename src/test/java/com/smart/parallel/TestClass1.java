package com.smart.parallel;

import org.testng.annotations.Test;

public class TestClass1 {
	@Test
	public void testmethod1() {
		System.out.println("TestClass1>>testmethod1" +Thread.currentThread().getName());
		
	}
	@Test
	public void testmethod2() {
		System.out.println("TestClass1>>testmethod2" +Thread.currentThread().getName());
		
	}
	@Test
	public void testmethod3() {
		System.out.println("TestClass1>>testmethod3" +Thread.currentThread().getName());
		
	}
	@Test
	public void testmethod4() {
		System.out.println("TestClass1>>testmethod4" +Thread.currentThread().getName());
		
	}

}
