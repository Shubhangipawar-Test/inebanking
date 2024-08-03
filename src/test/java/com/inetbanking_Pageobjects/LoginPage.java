package com.inetbanking_Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
		WebDriver ldriver;
		public LoginPage(WebDriver rdriver)
		{
		    ldriver = rdriver;
		    PageFactory.initElements(rdriver, this);
		}

		
@FindBy(name="uid")
WebElement txtUserName;

@FindBy(name="password")
WebElement txtPassword;

@FindBy(name="btnLogin")
WebElement txtbtnLogin;


		


//Action method

public void setusername(String username)
{
	txtUserName.sendKeys(username);
}
public void setPassword(String password)
{
	txtPassword.sendKeys(password);
}
public void clicksubmit() {
	txtbtnLogin.click();
}
}


