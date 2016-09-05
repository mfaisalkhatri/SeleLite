package test;

import java.awt.Desktop.Action;
import java.time.zone.ZoneOffsetTransitionRule.TimeDefinition;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Mousehover {
	
	public WebDriver driver;
	public String baseurl = "http://www.store.demoqa.com/";
	
			@BeforeSuite
			public void initial () {
			driver = new FirefoxDriver ();
			
	}
	
	@Test
	public void hovertest() {
			driver.get(baseurl);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			Actions action = new Actions(driver);	
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			WebElement form = driver.findElement(By.cssSelector("#menu-item-33>a"));
			
			action.moveToElement (form).build().perform();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement menu = driver.findElement(By.linkText("iPads"));
			action.click(menu).build().perform();
			
			
			System.out.println("CLicked Successful");
	
	}

			@AfterSuite
			public void closetest() {
				driver.quit();
}
}
