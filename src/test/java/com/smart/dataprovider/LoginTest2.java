package com.smart.dataprovider;

import org.testng.annotations.Test;

public class LoginTest2 {
	@Test(dataProvider = "logindata",dataProviderClass = ExcelDataSuplier.class)
	public void testLogin(String name,String pass) {
		System.out.println(name + "loged in to the application with " + pass);
		
	}

}
