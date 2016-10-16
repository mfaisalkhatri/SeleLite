package com.Guru99.Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepositPage {

	public WebDriver driver;
	private String accn,amtt,descc;
	
	
	public void Deposit (String acno, String amt, String desc) throws IOException{
	
		By Depst = By.cssSelector("a[href='DepositInput.php']");
		By dtitle = By.cssSelector(".heading3");
		By accno = By.name("accountno");
		By amount = By.name("ammount");
		By description = By.name ("desc");
		By submit = By.name("AccSubmit");
		By reset = By.name("res");
		
		this.accn = acno;
		this.amtt = amt;
		this.descc = desc;
		
		driver.findElement(Depst).click();
		String detitle = driver.findElement(dtitle).getText();
		driver.findElement(accno).clear();
		driver.findElement(accno).sendKeys(accn);;
		driver.findElement(amount).clear();
		driver.findElement(amount).sendKeys(amtt);
		driver.findElement(description).sendKeys(descc);
		driver.findElement(submit).click();	
		
		System.out.println(detitle);
	}
	
	public void AfterDeposit () {
	By tranid = By.xpath(".//*[@id='deposit']/tbody/tr[6]/td[1]");	
	By actno = By.xpath(".//*[@id='deposit']/tbody/tr[7]/td[1]");
	By amtcr = By.xpath(".//*[@id='deposit']/tbody/tr[12]/td[1]");
	By trantype = By.xpath(".//*[@id='deposit']/tbody/tr[16]/td[1]");
	By desc = By.xpath(".//*[@id='deposit']/tbody/tr[20]/td[1]");
	By crbal = By.xpath(".//*[@id='deposit']/tbody/tr[23]/td[1]");
	
	By tranidval = By.xpath(".//*[@id='deposit']/tbody/tr[6]/td[2]");
	By actnoval = By.xpath(".//*[@id='deposit']/tbody/tr[7]/td[2]");
	By amtcrval = By.xpath(".//*[@id='deposit']/tbody/tr[12]/td[2]");
	By trantypeval = By.xpath(".//*[@id='deposit']/tbody/tr[16]/td[2]");
	By descval = By.xpath(".//*[@id='deposit']/tbody/tr[20]/td[2]");
	By crbalval = By.xpath(".//*[@id='deposit']/tbody/tr[23]/td[2]");
	
	 String stranid = driver.findElement(tranid).getText();
	 String sactno = driver.findElement(actno).getText();
	 String samtcr = driver.findElement(amtcr).getText();
	 String stranttype = driver.findElement(trantype).getText();
	 String sdesc = driver.findElement(desc).getText();
	 String scrbal = driver.findElement(crbal).getText();
	 
	 String stranidval = driver.findElement(tranidval).getText();
	 String sactnoval = driver.findElement(actnoval).getText();
	 String samtcrval = driver.findElement(amtcrval).getText();
	 String strantypeval = driver.findElement(trantypeval).getText();
	 String sdescval = driver.findElement(descval).getText();
	 String scrbalval = driver.findElement(crbalval).getText();
	 
	 System.out.println(stranid + "\t"+ ":"+ stranidval);
	 System.out.println(sactno + "\t"+ ":"+ sactnoval);
	 System.out.println(samtcr + "\t"+ ":"+ samtcrval);
	 System.out.println(stranttype + "\t"+ ":"+ strantypeval);
	 System.out.println(sdesc + "\t"+ ":"+ sdescval);
	 System.out.println(scrbal + "\t" +":"+ scrbalval);
	 
	}

	public DepositPage (WebDriver driver) {
		this.driver = driver;
	}
	
}
