package com.guru99.DataProvider;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.guru99.Pages.LoginPage;

/**
 * @author DELL
 * This Class with verify login of Guru99 site using Data Provider.
 */
public class VerifyLoginWithDataprovider {
	
	LoginPage login = new LoginPage();
	
	@Test (dataProvider= "Guru99Login")
	public void VerifyLogin(String usrname, String pwd) throws IOException {
	
	login.LoadSite();
	login.loginSite(usrname, pwd);
	login.CaseResult();
	//login.ScreenShot();
	
	}
	
	@DataProvider(name="Guru99Login")
	public Object[][] passdata() {
		Object[][] data = new Object[6][2];
		data[0][0] = "admin";
		data[0][1] = "pass123";
		
		data[1][0] = " ";
		data[1][1] = "suqyvag";
		
		data[2][0] = "mngr47682";
		data[2][1] = "suqyvag";
		
		data[3][0] = "mngr47682";
		data[3][1] = " ";
		
		data[4][0] = "mngr47682";
		data[4][1] = "pass123";
		
		data[5][0] = "mngr47752";
		data[5][1] = "suqyvag";
		
		return data;
	}

	@AfterMethod
	public void clsite() {
		login.ClSite();	
	}

}
