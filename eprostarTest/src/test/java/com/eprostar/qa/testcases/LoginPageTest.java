package com.eprostar.qa.testcases;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.eprostar.qa.base.TestBase;
import com.eprostar.qa.pages.LoginPage;
import com.eprostar.qa.pages.UserInfoPage;

public class LoginPageTest extends TestBase{

	LoginPage objLoginPage;
	UserInfoPage objUserInfoPage;
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	    objLoginPage=new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title=objLoginPage.validatLoginPageTitle();
		Assert.assertEquals(title, "ACCLAIM");
	}
	
	@Test(priority=2)
	public void loginLogoImgTest()
	{
		boolean flag=objLoginPage.VallidateLoginPageLogo();
		Assert.assertTrue(flag);
	}
	
	@Test(priority=3)
	public void loginTest()
	{
		objUserInfoPage=objLoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
}
