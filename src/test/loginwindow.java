package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class loginwindow {
	public WebDriver driver;
	public String baseurl = "http://store.demoqa.com/products-page/your-account/";
	
			@BeforeSuite
			public void initial () {
			driver = new FirefoxDriver ();
						
	}
	
	@Test
	public void hovertest() {
			Actions action = new Actions(driver);
			driver.get(baseurl);
			driver.manage().window().maximize();
			WebElement form = driver.findElement(By.cssSelector(".myaccount"));
			WebElement usrid = form.findElement(By.cssSelector("#log"));
			usrid.sendKeys("tomsmith");
			WebElement pwd = form.findElement(By.cssSelector("#pwd"));
			pwd.sendKeys("admin");
			WebElement lgnbtn = form.findElement(By.cssSelector("#login"));
			action.click(lgnbtn).build().perform();;
		
			System.out.println("Form Submitted");
	}
	
	@AfterSuite
	public void closetest() {
		driver.quit();
}
	
}
