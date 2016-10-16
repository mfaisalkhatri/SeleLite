package com.Guru99.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WithdrawalPage {

	public WebDriver driver;
	
	private String accn,amtt,descc;
	
	
	
	public WithdrawalPage (WebDriver driver) {
		this.driver = driver;
	}
	
	public void Withdraw (String acno, String amt, String desc) {
		
		this.accn = acno;
		this.amtt = amt;
		this.descc = desc;
		
		By Witdw = By.cssSelector("a[href='WithdrawalInput.php']");
		By wtitle = By.cssSelector(".heading3");
		By accno = By.name("accountno");
		By amount = By.name("ammount");
		By description = By.name ("desc");
		By submit = By.name("AccSubmit");
		By reset = By.name("res");
		
		driver.findElement(Witdw).click();
		String wdtitle = driver.findElement(wtitle).getText();
		driver.findElement(accno).clear();
		driver.findElement(accno).sendKeys(accn);
		driver.findElement(amount).clear();
		driver.findElement(amount).sendKeys(amtt);
		driver.findElement(description).clear();
		driver.findElement(description).sendKeys(descc);
		driver.findElement(submit).click();
		
		System.out.println(wdtitle);

	}

	public void AfterWithdraw() {
		By ftitle = By.xpath(".//*[@id='withdraw']/tbody/tr[1]/td/p");
		By wtranid = By.xpath(".//*[@id='withdraw']/tbody/tr[6]/td[1]");
		By wacno = By.xpath(".//*[@id='withdraw']/tbody/tr[7]/td[1]");
		By wamtdr = By.xpath(".//*[@id='withdraw']/tbody/tr[12]/td[1]");
		By wtrantype = By.xpath(".//*[@id='withdraw']/tbody/tr[16]/td[1]");
		By wdesc = By.xpath(".//*[@id='withdraw']/tbody/tr[20]/td[1]");
		By wcrbal = By.xpath(".//*[@id='withdraw']/tbody/tr[23]/td[1]");

		By wtranidval = By.xpath(".//*[@id='withdraw']/tbody/tr[6]/td[2]");
		By wacnoval = By.xpath(".//*[@id='withdraw']/tbody/tr[7]/td[2]");
		By wamtdrval = By.xpath(".//*[@id='withdraw']/tbody/tr[12]/td[2]");
		By wtrantypeval = By.xpath(".//*[@id='withdraw']/tbody/tr[16]/td[2]");
		By wdescval = By.xpath(".//*[@id='withdraw']/tbody/tr[20]/td[2]");
		By wcrbalval = By.xpath(".//*[@id='withdraw']/tbody/tr[23]/td[2]");

		String fwtitle = driver.findElement(ftitle).getText();
		String stranid = driver.findElement(wtranid).getText();
		String swacno = driver.findElement(wacno).getText();
		String swamtdr = driver.findElement(wamtdr).getText();
		String strantype = driver.findElement(wtrantype).getText();
		String sdesc = driver.findElement(wdesc).getText();
		String scrbal = driver.findElement(wcrbal).getText();
		
		String stranidval = driver.findElement(wtranidval).getText();
		String sacnoval = driver.findElement(wacnoval).getText();
		String swamtdrval = driver.findElement(wamtdrval).getText();
		String strantypeval = driver.findElement(wtrantypeval).getText();
		String sdescval = driver.findElement(wdescval).getText();
		String scrbalval = driver.findElement(wcrbalval).getText();
		
		System.out.println(fwtitle);
		System.out.println(stranid + "\t"+ ":"+stranidval);
		System.out.println(swacno + "\t"+ ":"+sacnoval);
		System.out.println(swamtdr + "\t"+ ":"+swamtdrval);
		System.out.println(strantype + "\t"+ ":"+strantypeval);
		System.out.println(sdesc + "\t"+ ":"+sdescval);
		System.out.println(scrbal + "\t"+ ":"+scrbalval);
		
	}
	
}
