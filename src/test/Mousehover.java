package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class MouseHover{

	WebDriver driver;
	public String baseurl = "http://www.seleniumframework.com/Practiceform/";
	
	
	@Test
	public void MousehoverTest () throws InterruptedException {
		
		driver = new FirefoxDriver();
		driver.get(baseurl);
		/*WebElement dragMe = driver.findElement(By.id("draga"));
		WebElement dragTo = driver.findElement(By.id("dragb"));*/
		WebElement TutLink = driver.findElement(By.linkText("TUTORIALS"));
		Actions action = new Actions (driver);
		action.moveToElement(TutLink).perform();
		WebDriverWait wait= new WebDriverWait(driver,5);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(".//*[@id='main-nav']/li[2]/ul/li[1]/a/span")));
		 
		WebElement Strg =  driver.findElement(By.xpath(".//*[@id='main-nav']/li[2]/ul/li[1]/a/span"));
		action.moveToElement(Strg).click().build().perform();
		String title = driver.getTitle();
		System.out.println(title);
		
		//action.moveToElement(dragTo).perform();
	

		
		driver.quit();
	}
	
	
	}
