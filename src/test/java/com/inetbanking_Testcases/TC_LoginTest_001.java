package com.inetbanking_Testcases;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking_Pageobjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {
	@Test
	public void Logintest(){
		driver.get(baseurl);
		LoginPage lp=new LoginPage(driver);
		lp.setusername(username);
		lp.setPassword(password);
		lp.clicksubmit();
		if(driver.getTitle().equals("https://demo.guru99.com/v3/manager/Managerhomepage.php"))
		{
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
	}
	
	

}
