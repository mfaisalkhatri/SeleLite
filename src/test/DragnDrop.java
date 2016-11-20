package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;



public class DragnDrop {

	WebDriver driver;
	public String baseurl = "http://jqueryui.com/droppable/";
	
	@Test
	public void DragTe4st (){ 
		driver = new FirefoxDriver();
		driver.get(baseurl);
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector(".demo-frame")));

		WebElement draga = driver.findElement(By.id("draggable"));
		WebElement dropb = driver.findElement(By.id("droppable"));
		
		Actions action = new Actions(driver);
		action.dragAndDrop(draga, dropb).perform();
		
		
		System.out.println("Drag and Drop done!!");
		driver.quit();
		
	}
	
}
