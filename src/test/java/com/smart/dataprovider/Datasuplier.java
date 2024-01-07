package com.smart.dataprovider;

import org.testng.annotations.DataProvider;

public class Datasuplier {
	
	@DataProvider(name="getdata")
	public String []getdata() {
		return new String[]
		{"masud","samim","sakib"};
		
		
	}

}
