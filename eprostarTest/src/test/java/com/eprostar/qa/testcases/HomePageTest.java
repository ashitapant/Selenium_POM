package com.eprostar.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.eprostar.qa.base.TestBase;
import com.eprostar.qa.pages.HomePage;
import com.eprostar.qa.pages.LoginPage;
import com.eprostar.qa.pages.TeamPage;
import com.eprostar.qa.pages.UserInfoPage;

public class HomePageTest extends TestBase{
	LoginPage objLoginPage;
	UserInfoPage objUserInfoPage;
	HomePage objHomePage;
	TeamPage objTeamPage;
	public HomePageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void SetUp()
	{
		initialization();
		objLoginPage=new LoginPage();
	    objUserInfoPage=objLoginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	    objHomePage = objUserInfoPage.loginUserinfo();
	}
	
	@Test
	public void HomePgaeTitleTest()
	{
		String title=objHomePage.validateHomePageTitle();
		Assert.assertEquals(title, "ACCLAIM");
	}
	
	@Test
	public void VallidateHomeTitleTest()
	{
		String Title=objHomePage.vallidateHomePageTitle();
		//Assert.assertEquals(Title, "Home");
		Assert.assertTrue(Title.contains("Home"));
	}
	
	@Test
	public void brokingModuleOpenTest()
	{
		objHomePage.openBrokingModule();
	}
	
	@Test
	public void DirectRIAdminOpenTest()
	{
		objHomePage.openDirectRIAdminModule();
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
	
	
}
