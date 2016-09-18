package com.guru99.TestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.guru99.Pages.LoginPage;
import com.guru99.Pages.NewCustomerPage;

public class NewCustomer {

	public WebDriver driver;
	@Test 
	public void NewCust () throws Exception {
		LoginPage login = new LoginPage();
		NewCustomerPage NCust = new NewCustomerPage();
		
		login.LoadSite();
		login.loginSite("mngr47682","suqyvag");
		try {
		String windhandle = driver.getWindowHandle();
		
		driver.switchTo().window(windhandle);
			//System.out.println();
		NCust.CustClick();
		NCust.AddCustomer();
		NCust.Submit();
		NCust.AfterAdd();
		
		login.ClSite();

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
				
	}
}
