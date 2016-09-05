package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class dropdownbox extends Settings{

	@Test
	public void dropdowntest () throws InterruptedException {
		driver.get(baseurl);
		WebElement drpdwn = driver.findElement(By.cssSelector("#continents"));
		drpdwn.click();
		Select drpdwnbx = new Select (drpdwn);
		drpdwnbx.selectByVisibleText("Australia");
		drpdwnbx.selectByIndex(5);
		Thread.sleep(2000);
		
		
	}
	
}
