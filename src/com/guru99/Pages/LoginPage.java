
package com.guru99.Pages;

import java.io.File;
import java.io.IOException;
import java.security.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.sun.jna.platform.win32.Sspi.TimeStamp;



/**
 * @author DELL
 * This Class initializes the Firefox driver and loads Guru99 Site.
 * Also, it finds locators in the site. 
 */
public class LoginPage {
	FirefoxProfile fprofile = new FirefoxProfile();
	public WebDriver driver;
	public String baseurl = "http://demo.guru99.com/v4/";
	
	By username = By.cssSelector("input[type = \"text\"]");
	By pwd = By.name("password");
	By lgnbtn = By.name("btnLogin");
	
	public void loginSite(String usr, String pass) {
		driver.findElement(username).sendKeys(usr);
		driver.findElement(pwd).sendKeys(pass);
		driver.findElement(lgnbtn).click();
	}
	
	public void VerifyTitle() {
		String title = driver.getTitle();
		Assert.assertEquals(title, "Guru99 Bank Manager HomePage", "Title Mismatch");
	}
	public void CaseResult() throws IOException {
		String title= driver.getTitle();
		Assert.assertEquals(title, "Guru99 Bank Manager HomePage", "Login Failed");
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("F:\\Screenshot\\Guru99\\Screenshot"+timestamp()+"jpg"));	
		System.out.println("Page Login Successful!! - Title Verified");
		
	}
	
	public String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}
	
	/*public void ScreenShot() throws IOException {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("F:\\Screenshot\\ScreenShot.jpg"));
	}*/
	
/*public void typeusrname () {
	driver.findElement(username).sendKeys("mngr47682");
	
}

public void typepwd() {
	driver.findElement(pwd).sendKeys("suqyvag");
}

public void clickln () {
	driver.findElement(lgnbtn).click();
}*/
	
	@BeforeSuite
	public void LoadSite() {
	driver = new FirefoxDriver (fprofile);
	driver.get(baseurl);
	driver.manage().window().maximize();
	
	}
@AfterSuite
public void ClSite() {
	driver.quit();
}
}

