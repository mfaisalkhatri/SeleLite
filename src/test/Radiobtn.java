package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Radiobtn extends Settings {

	@Test
	public void RadioTest () {
		driver.get(baseurl);
		
		WebElement rad1 = driver.findElement(By.cssSelector("#sex-0"));
		if (!rad1.isSelected()) {
			rad1.click();
		}
		boolean radval = rad1.isSelected();
		if (radval == true) {
			System.out.println("Male is Selected");
		}
		else {
		System.out.println("Male is not selected");
	}
		WebElement rad2 = driver.findElement(By.cssSelector("#sex-1"));
		if (!rad2.isSelected()) {
			rad2.click();
		}
		boolean radval1 = rad1.isSelected();
		if (radval1 == true) {
			System.out.println("Female is Selected");
		}
		else {
		System.out.println("Female is not selected");
	}
}
}
