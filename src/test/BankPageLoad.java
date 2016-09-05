package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public abstract class BankPageLoad {
	public WebDriver driver;
	
	
	@BeforeSuite
	public void PageLoad (){
		 driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		
	}
	
@AfterSuite 
public void PageClose() {
	driver.quit();
	
}
	
}
