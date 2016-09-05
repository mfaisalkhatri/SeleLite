package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BankHomePage extends BankPageLoad {
	
	private String baseurl = "http://www.demo.guru99.com/V4/index.php";
	
	
	@Test
	public void BankLogin() {
		driver.get(baseurl);
		String title = driver.getTitle();
		WebElement usrid = driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]/input"));
		WebElement pass = driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/input"));
		WebElement lgnbtn = driver.findElement(By.xpath ("html/body/form/table/tbody/tr[3]/td[2]/input[1]"));
		usrid.sendKeys("mngr47682");
		pass.sendKeys("suqyvag");
		lgnbtn.click();
		Assert.assertEquals(title, "Guru99 Bank Hme Page","Title Mismatch");
		
		
		
		
	}
	 
	
}
