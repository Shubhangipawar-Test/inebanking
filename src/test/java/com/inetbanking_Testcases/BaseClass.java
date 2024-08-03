package com.inetbanking_Testcases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	public String baseurl="https://demo.guru99.com/v4/";
	public String username="mngr574516";
	public String password="uvupysa";
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		
		 driver=new ChromeDriver();
		
		driver.get(baseurl);
		
	}
	@AfterClass
	public void teardown() {
		
		driver.quit();
	}
	

}
