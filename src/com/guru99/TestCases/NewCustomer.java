package com.guru99.TestCases;

//import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.guru99.Pages.LoginPage;
import com.guru99.Pages.NewCustomerPage;

public class NewCustomer {

	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeSuite(alwaysRun = true)
	public void BeforeLogin (){
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,10);
	}
	
	@Test 
	public void NewCust () throws Exception {
		LoginPage login = new LoginPage(driver);
		NewCustomerPage NCust = new NewCustomerPage(driver);
		
		driver.get(login.baseurl);
		//login.LoadSite();
		login.loginSite("mngr47682","suqyvag");
		try {
		//String windhandle = driver.getWindowHandle();
		
		//driver.switchTo().window(windhandle);
			//System.out.println();
		//Thread.sleep(9000);
		/*WebElement newc= driver.findElement(By.cssSelector("a[href='addcustomerpage.php']"));
		newc.click();*/
		NCust.CustClick();
		NCust.AddCustomer();
		Thread.sleep(5000);
		NCust.Submit();
		NCust.AfterAdd();
		
		//login.ClSite();

		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
				
	}
	
	@AfterSuite(alwaysRun = true)
	public void Teardown() {
		driver.quit();
	}
}
