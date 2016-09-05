package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class PracticeForm {
	WebDriver driver = new FirefoxDriver();
	//String baseurl = "http://www.seleniumframework.com/Practiceform/";
	String baseurl = "http://toolsqa.com/automation-practice-form/";
	
	@Test
	public void Practicetest () throws InterruptedException {
		driver.get(baseurl);
		driver.wait();
		driver.manage().window().maximize();
		//Thread.sleep(5);
		//driver.findElement(By.cssSelector(".wpb_wrapper>p>button")).click();
		
		driver.findElement(By.cssSelector(".control-group>input")).sendKeys("This is a Test by Faisal");
		
		//Thread.sleep(5);
		driver.close();
		
		//driver.close();
	}
	
}
