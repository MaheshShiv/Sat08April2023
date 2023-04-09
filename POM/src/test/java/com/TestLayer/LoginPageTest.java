package com.TestLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;


public class LoginPageTest extends BaseClass{
	
	@BeforeTest
	public void setup() throws Throwable {
		
		init("chromebrowser");
		navigateUrl("url");
	}
	
	@Test
	public void loginfunctionality() {
		
		LoginPage lp = new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickOnElement();
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
	}

}
