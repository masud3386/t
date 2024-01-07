package com.smart.group;

import org.testng.annotations.Test;

public class PriceLineTest {
	
	@Test(groups = {"regression"})
	public void createAccount() {
		System.out.println("Account created");
		
	}
	@Test(groups = {"regression"})
	public void login() {
		System.out.println("login was succefully");
		
	}
	@Test(groups = {"smoke","regression"})
	public void searchfilgit() {
		System.out.println("flight was identified");
		
	}
	@Test(groups = {"smoke"})
	public void checkout() {
		System.out.println("checkout was done");
		
	}
	@Test(groups = {"regression","sanity"})
	public void logout() {
		System.out.println("logout succefully");
		
	}

}
