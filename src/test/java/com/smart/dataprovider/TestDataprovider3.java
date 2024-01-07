package com.smart.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataprovider3 {
	@DataProvider(name="getdata")
	public String []getdata() {
		return new String[]
		{"masud","samim","sakib"};
		
		
	}
	@Test(dataProvider = "getdata",dataProviderClass=Datasuplier.class)
	public void loninTest(String username) {
		System.out.println(username + " "+ "logged in to the application ");
		
	}

}
