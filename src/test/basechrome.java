package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class basechrome {
	String baseurl = "http://www.store.demoqa.com";
	String title;
@Test	
	public void chrometest () {
		String exepath = "F:\\Driver\\Chrome\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",exepath);
		WebDriver driver = new ChromeDriver();
		driver.get(baseurl);
		driver.manage().window().maximize();
		title = driver.getTitle();
		System.out.println(driver.getTitle());
		Assert.assertTrue(title.contains("ONLINE STORE | Toolsqa Dummy Test site"));
		driver.close();
	}	
}
	
