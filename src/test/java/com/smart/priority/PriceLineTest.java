package com.smart.priority;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PriceLineTest {
	@Ignore
	@Test(priority=1)
	public void createAccount() {
		System.out.println("Account created");
		
	}
	@Test(priority=2)
	public void login() {
		System.out.println("login was succefully");
		
	}
	@Test(priority=3)
	public void searchfilgit() {
		System.out.println("flight was identified");
		
	}
	@Test(priority=4)
	public void checkout() {
		System.out.println("checkout was done");
		
	}
	@Test(priority=2)
	public void logout() {
		System.out.println("logout succefully");
		
	}

}
