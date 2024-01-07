package com.smart.parallel;

import org.testng.annotations.Test;

public class TestClass3 {
	@Test
	public void testmethod8() {
		System.out.println("TestClass3>>testmethod8" +Thread.currentThread().getName());
		
	}
	@Test
	public void testmethod9() {
		System.out.println("TestClass3>>testmethod9" +Thread.currentThread().getName());
		
	}
	@Test
	public void testmethod10() {
		System.out.println("TestClass3>>testmethod10" +Thread.currentThread().getName());
		
	}
	@Test
	public void testmethod11() {
		System.out.println("TestClass3>>testmethod11" +Thread.currentThread().getName());
		
	}

}
