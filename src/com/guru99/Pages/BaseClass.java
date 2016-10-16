package com.Guru99.Pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseClass {

	public WebDriver driver;
	
	
	public BaseClass(WebDriver driver) {
		this.driver = driver; 
	}
	
	public void loginSite(String usr, String pass) throws IOException {
		By username = By.cssSelector("input[type = \"text\"]");
		By pwd = By.name("password");
		By lgnbtn = By.name("btnLogin");
		//By usrmsg23 = By.cssSelector("#message23");
		//By pwdmsg18 = By.cssSelector ("message18"); 
		driver.findElement(username).sendKeys(usr);
		driver.findElement(pwd).sendKeys(pass);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(lgnbtn).click();
}
}
