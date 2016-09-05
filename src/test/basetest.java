package test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.WebDriver.*;
import org.testng.annotations.Test;



public class basetest  {

	//public  String baseurl = "http://the-internet.herokuapp.com/";
	public  String baseurl = "http://store.demoqa.com/";
	public  WebDriver driver = new FirefoxDriver();
	//String baseurl = "";
@Test
	public void test1() throws InterruptedException{
		 driver.get(baseurl);
		 driver.navigate().to(baseurl);
		 driver.manage().window().maximize();
		 Thread.sleep(5);
		 String title = driver.getTitle();
		 int titlelen = driver.getTitle().length();
		 
		 System.out.println("The Title of the page is: " +title);
		 System.out.println("The length of the title is: " +titlelen);
		 
		 String actualurl = driver.getCurrentUrl();
		 
		 if (actualurl.equals(baseurl)) {
			 System.out.println("Correct Url is Opened!");
		 }
		 else {
			 System.out.println("Incorrect Url opened!");
			 System.out.println("Correct url is " +baseurl);
			 System.out.println("Actual Url Opened is:" +actualurl);
		 }
		 //driver.manage().wait();
		 
		 //driver.findElement(By.id("topSection")).click();
		 driver.findElement(By.cssSelector(".account_icon")).click();
		 
		 driver.close();
		 
		 
		 
	}
	
	
	
}
