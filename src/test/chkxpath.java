package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class chkxpath extends Settings {
	
	@Test
	public void chktest () {
		driver.get(baseurl);
		driver.manage().window().maximize();
		WebElement chkb = driver.findElement(By.linkText("Checkboxes"));
		 Actions action = new Actions(driver);
		 
		 action.click(chkb).build().perform();
		 String handle = driver.getWindowHandle();
		 driver.switchTo().window(handle);
		 
		 WebElement chk1 = driver.findElement(By.xpath(".//*[@id='checkboxes']/input[1]"));
		 chk1.click();
		 boolean chval1 = driver.findElement(By.xpath(".//*[@id='checkboxes']/input[1]")).isSelected();
		 System.out.println(chval1);
		 WebElement chk2 = driver.findElement(By.xpath(".//*[@id='checkboxes']/input[2]"));
		 chk2.click();
		 boolean chval2 = driver.findElement(By.xpath(".//*[@id='checkboxes']/input[2]")).isSelected();
		 System.out.println(chval2);
		 
		 
		
	}

}
