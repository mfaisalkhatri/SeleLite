package test;

import java.security.KeyStore.Entry.Attribute;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.runners.ParentRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class chkbox extends Settings{

	@Test
	public void chktest () {
		 driver.get(baseurl);
		 driver.manage().window().maximize();
		 WebElement chkb = driver.findElement(By.linkText("Checkboxes"));
		 Actions action = new Actions(driver);
		 
		 action.click(chkb).build().perform();
		 String handle = driver.getWindowHandle();
		 driver.switchTo().window(handle);
		 
		 WebElement form = driver.findElement(By.id("checkboxes"));
		 List <WebElement> chks = form.findElements(By.cssSelector("input"));
		 for (WebElement chk: chks) {
			 String txt = chk.getText();
			 System.out.println(txt);
			 //if(!chk.isSelected()) 
				 chk.click();
			 
		 }
		 

		 //WebElement chk2 = driver.findElement(By.cssSelector("input")); 
		 //WebElement chkb = driver.findElement(By.cssSelector("input"));
		 /*List<WebElement> chk1 = driver.findElements(By.id("checkboxes"));
		 for (WebElement el: chk1) {
			 
			 if (el.isSelected()) {
				 el.click();
			 }
			 
		 
		  }*/	 
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 System.out.println("Click successful");
		 
		 
	}
	
	
}
