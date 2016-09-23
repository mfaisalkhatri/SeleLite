package com.guru99.Pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;


public class NewCustomerPage {

	private WebDriver driver;
	
	
	
	//By NewCustLink = By.xpath("html/body/div[2]/div/ul/li[2]/a");
	//By NewCustLink = By.cssSelector("a[href = 'addcustomerpage.php']");
	//By NewCustLink = By.linkText("New Customer");
	
	By NewCust = By.cssSelector("a[href='addcustomerpage.php']");
	By CustName = By.name("name");
	By CustRadioGenM = By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]");
	By CustRadioGenF = By.xpath("html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]");
	By CustDob = By.name ("dob");
	By CustAddress = By.name("addr");
	By CustCity = By.name("city");
	By CustState = By.name("state");
	By CustPin = By.name("pinno");
	By CustMobNo = By.name("telephoneno");
	By CustEmail = By.name("emailid");
	By CustPass = By.name("password");
	By Subbtn = By.name("sub");
	By Resetbtn = By.name("res");
	
	
	By CustId = By.xpath (".//*[@id='customer']/tbody/tr[4]/td[2]");
	By CName = By.xpath(".//*[@id='customer']/tbody/tr[5]/td[2]");
	By CGend = By.xpath(".//*[@id='customer']/tbody/tr[6]/td[2]");
	By CBirthDate = By.xpath(".//*[@id='customer']/tbody/tr[7]/td[2]");
	By CAddress = By.xpath(".//*[@id='customer']/tbody/tr[8]/td[2]");
	By CCity = By.xpath(".//*[@id='customer']/tbody/tr[9]/td[2]");
	By CState = By.xpath(".//*[@id='customer']/tbody/tr[10]/td[2]");
	By CPin = By.xpath(".//*[@id='customer']/tbody/tr[11]/td[2]");
	By CMobNo = By.xpath(".//*[@id='customer']/tbody/tr[12]/td[2]");
	By CEmail = By.xpath(".//*[@id='customer']/tbody/tr[13]/td[2]");
	//By Contlink = By.xpath(".//*[@id='customer']/tbody/tr[14]/td[2]");
	By ContLink = By.cssSelector("a[href='Managerhomepage.php']");	
	
	public NewCustomerPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		//parent = driver.findElement(By.tagName("body"));
	}
	
	public void CustClick() {
		
		driver.findElement(NewCust).click();
		//System.out.println(link);
	}
	
	public void AddCustomer () {
		
		driver.findElement(CustName).sendKeys("Ricky Rich");
		driver.findElement(CustRadioGenM).click();
		driver.findElement(CustDob).sendKeys("18/05/1991");
		driver.findElement(CustAddress).sendKeys("Tanwar Complex near Petrol Pump Thane");
		driver.findElement(CustCity).sendKeys("Mumbai");
		driver.findElement(CustState).sendKeys("Maharashtra");
		driver.findElement(CustPin).sendKeys("400003");
		driver.findElement(CustMobNo).sendKeys("9820454578");
		driver.findElement(CustEmail).sendKeys("ricky1@gmail.com");
		driver.findElement(CustPass).sendKeys("Pass123");
		
	}
	
	public void Submit () {
		driver.findElement(Subbtn).click();		
	}
	
	public void Reset () {
		driver.findElement(Resetbtn).click();
	}
	public void AfterAdd () {
		String CId = driver.findElement(CustId).getText();
		String CuName = driver.findElement(CName).getText();
		String CuGender = driver.findElement(CGend).getText();
		String CuBirthDate = driver.findElement(CBirthDate).getText();
		String CuAddr = driver.findElement(CAddress).getText();
		String CuCity = driver.findElement(CCity).getText();
		String CuState = driver.findElement(CState).getText();
		String CuPin = driver.findElement(CPin).getText();
		String CuMobNo = driver.findElement(CMobNo).getText();
		String CuEmail = driver.findElement(CEmail).getText();
		
	System.out.println("Customer Id is: " +CId);
	System.out.println("Customer Name is: "+ CuName);
	System.out.println("Customer Gender is: " +CuGender);
	System.out.println("Customer Birth Date is: " +CuBirthDate);
	System.out.println("Customer Address is: " +CuAddr);
	System.out.println("Customer City is: " +CuCity);
	System.out.println("Customer State is: " +CuState);
	System.out.println("Customer Pin No. is: " +CuPin);
	System.out.println("Customer Mobile No. is: " +CuMobNo);
	System.out.println("Customer Email is: " +CuEmail);
	
	driver.findElement(ContLink).click();
	
}

}
