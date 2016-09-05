package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Actionseries extends Settings {

	@Test
	public void radiobtn() {
		
		driver.get(baseurl);
		
		WebElement txtusername = driver.findElement(By.id("email"));
		Actions builder = new Actions(driver);
		Action seriesofActions = builder
				.moveToElement(txtusername)
				.click()
				.keyDown(txtusername,Keys.SHIFT)
				.sendKeys("hello")
				.keyUp(txtusername,Keys.SHIFT)
				.doubleClick(txtusername)
				.contextClick()
				.build();
		seriesofActions.perform();
		
		
		System.out.println("Done");
		
		
		
		
}
}