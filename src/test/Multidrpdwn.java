package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Multidrpdwn extends Settings{
	
	@Test
	public void mltdrp () {
		driver.get(baseurl);
		WebElement mlt = driver.findElement(By.cssSelector("#selenium_commands"));
		Select slt = new Select (mlt);
		/*boolean mval =  slt.isMultiple();
		System.out.println(mval);*/
		
		slt.selectByVisibleText("Browser Commands");
		slt.selectByVisibleText("Wait Commands");
		slt.deselectByVisibleText("Browser Commands");
		slt.selectByIndex(4);
	}
	
	
}
