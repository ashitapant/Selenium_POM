package com.eprostar.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eprostar.qa.base.TestBase;

public class LoginPage extends TestBase{
	//page factory and Object Repostry(OR)
	@FindBy(name="txtUserName")
	WebElement UserName;
	
	@FindBy(name="txtPassword")
	WebElement Password;
	
	@FindBy(id="imgLogin")
    WebElement loginBtn;
	
	@FindBy(xpath="//img[contains(@src,'logo')]")
	WebElement imgLogo;
	
	//Initialization
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//Action
	public String validatLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean VallidateLoginPageLogo()
	{
		return imgLogo.isDisplayed();
	}
	
	public UserInfoPage login(String strUsername,String strPassword)
	{
		UserName.sendKeys(strUsername);
		Password.sendKeys(strPassword);
		loginBtn.click();
		
		return new UserInfoPage();
	}
}
