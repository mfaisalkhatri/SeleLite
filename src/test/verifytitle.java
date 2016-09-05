package test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class verifytitle {
	String baseurl = "http://www.google.co.in";
	WebDriver driver = new FirefoxDriver();
	
	

	@Test
	public void titletest () {
		driver.get(baseurl);
		String title = driver.getTitle();	
	 Assert.assertTrue(title.contains("Google03"),"Title does not match");
	 //Assert.assertEquals("Google", title);
	 //Assert.assertEquals("Google11",title, "Incorrect- Title does not match with expected");
		
	 driver.close();
	 
	 
	}
	
	}
