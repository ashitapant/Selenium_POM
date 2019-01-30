package com.eprostar.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.eprostar.qa.base.TestBase;

public class UserInfoPage extends TestBase{
	
	@FindBy(id="imgOk")
	WebElement btnOk;
	
	//intialization
	public UserInfoPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	//Action
	public HomePage loginUserinfo()
	{
		btnOk.click();
		return new HomePage();
	}

}
