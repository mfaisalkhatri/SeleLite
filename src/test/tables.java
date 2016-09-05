package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class tables extends Settings{
	@Test (enabled = false)
	public void tabltest() {
		driver.get (baseurl);
		WebElement frow = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/th"));
		String frotxt = frow.getText();
		System.out.println(frotxt);
		
		WebElement dtl = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[1]/td[6]/a"));
		String dtltxt = dtl.getText();
		dtl.click();
		
		System.out.println("Clicked on "+dtltxt );
	}
		@Test
		public void colvaltest () {
			
		driver.get(baseurl);
		int i,j;
		for ( i=1; i <=4;i++ ) {
			String sval = null;
			 sval = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr[" + i+ "]/th")).getText();
			if (sval.equalsIgnoreCase("CLOCK TOWER HOTEL")) {
				for (j =1; j<=5; j++) {
					String colvalue = driver.findElement(By.xpath(".//*[@id='content']/table/tbody/tr["+i +"]/td["+ j +"]")).getText();
					System.out.println(colvalue);
				}
			}
		}	
		}
		
	}

