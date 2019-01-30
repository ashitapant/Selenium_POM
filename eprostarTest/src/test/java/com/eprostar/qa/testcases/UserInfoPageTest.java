package com.eprostar.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.eprostar.qa.base.TestBase;
import com.eprostar.qa.pages.LoginPage;
import com.eprostar.qa.pages.UserInfoPage;

public class UserInfoPageTest extends TestBase {
	
	LoginPage objLoginPage;
	UserInfoPage objUserInfoPage;
	
	public UserInfoPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	    objLoginPage=new LoginPage();
	    objUserInfoPage=objLoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@Test
	public void userInfoLoginTest()
	{
		objUserInfoPage.loginUserinfo();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
