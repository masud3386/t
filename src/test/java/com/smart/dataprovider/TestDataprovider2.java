package com.smart.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataprovider2 {
	@DataProvider(name="getData")
	public String[] []suplydata() {
		return new String[][] 
		{
			{"username1","password1"},
			{"username2","password2"},
			{"username3","password3"}
		};
		
		
		
	}
	@Test(dataProvider = "getData")
	public void loninTest(String username,String password) {
		System.out.println(username + "logged in to the application wigh" +password);
		
	}

}
