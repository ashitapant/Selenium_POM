package com.eprostar.qa.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.eprostar.qa.base.TestBase;

public class HomePage extends TestBase {
	WebDriverWait wait; 
	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement  pageTitle;
	
	//@FindBy(xpath  = "//button[@id='SystemAdmin_S1']")
	@FindBy(xpath  = "//button[@id='BrokingModule_S1']")
    WebElement btnBrokingModule;
	
	@FindBy(xpath  = "//li[@id='id_MC210013']//a[contains(text(),'Divisional Grouping')]")
    WebElement lnkDirectRIAdmin;
	
	@FindBy(xpath  = "//a[@id='id_MC210000']")
    WebElement lnkUserSetupChild;
	
	@FindBy(xpath  = "//li[@id='id_MC210001']//a[contains(text(),'Team')]")
	WebElement lnkTeam;
	
	public HomePage()
	{
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	public String validateHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public String vallidateHomePageTitle()
	{
		wait = new WebDriverWait(driver,20);
	    wait.until(ExpectedConditions.visibilityOf(pageTitle));
		String homeText= pageTitle.getText();
		return homeText;
				
	}
	
	public void openBrokingModule()
	{
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(btnBrokingModule));
		btnBrokingModule.click();
		
		/*wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(lnkUserSetup));
		
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(lnkTeam));*/
	
		//lnkUserSetupChild.click();
		/*lnkUserSetup.click();
		lnkTeam.click();*/
		
	}
	
	public void openDirectRIAdminModule()
	{		
		openBrokingModule();
		
		wait = new WebDriverWait(driver,90);
		wait.until(ExpectedConditions.visibilityOf(lnkDirectRIAdmin));
		Actions action = new Actions(driver);
		 
        action.moveToElement(lnkDirectRIAdmin).build().perform();
		lnkDirectRIAdmin.click();
		/*wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(lnkUserSetup));
		
		wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(lnkTeam));*/
	
		//lnkUserSetupChild.click();
		/*lnkUserSetup.click();
		lnkTeam.click();*/
		
	}

}
