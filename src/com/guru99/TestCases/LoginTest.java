package com.Guru99.Testcases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.Guru99.Pages.*;


public class LoginTest{
	public WebDriver driver;
	public String baseurl = "http://demo.guru99.com/v4/";
	
	@BeforeMethod(alwaysRun = true)
	public void Startup () {
		driver= new FirefoxDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
	}

	@AfterMethod(alwaysRun = true)
	public void teardown () {
		driver.quit();
	}
	
	@Test (enabled = false) 
	public void Test1 () throws IOException {
		
		BaseClass bs = new BaseClass (driver);
		bs.loginSite("mngr51777", "gurEdEr");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		String title = driver.getTitle();
		
		System.out.println(title);
		Assert.assertEquals("Guru99 Bank Manager HomePage", title);
		
	}

	@Test (enabled = false)
	public void Test2 () throws IOException {
		
		BaseClass bclass = new BaseClass (driver);
		bclass.loginSite("mngr51777", "gurEdEr");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		System.out.println("*****Depositing Money Begins*****");
		DepositPage dp = new DepositPage(driver);
		dp.Deposit("18592", "15000", "Auto Entry by system");
		
		System.out.println("****Money Deposited Successfully*****");
		
		dp.AfterDeposit();
	}
	
	@Test (enabled = true) 
	public void Test3 () throws IOException{
		
		BaseClass bclass = new BaseClass (driver);
		bclass.loginSite("mngr51777", "gurEdEr");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		System.out.println("*****Withdrawal of Money Started*****");
		WithdrawalPage wp = new WithdrawalPage(driver);
		wp.Withdraw("18592", "5000", "Auto Withdraw by System");
		
		System.out.println("*****Withdrawal Successful*****");
		
		wp.AfterWithdraw();
	}
	
	




}
