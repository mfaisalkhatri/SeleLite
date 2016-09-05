package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Settings {
	public WebDriver driver;
	public String baseurl = "http://sdfj.co.in";
	
			@BeforeSuite
			public void initial () {
			driver = new FirefoxDriver ();
			driver.manage().window().maximize();
						
	}
			@AfterSuite
			public void dquit () {
				driver.quit();
			}
}

