package com.eprostar.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.eprostar.qa.util.TestUtil;

public class TestBase {

	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		 try
		 {
			 prop=new Properties();
			 FileInputStream ip=new FileInputStream("D:\\ashita\\javapractice\\eprostarTest\\src\\main\\java\\com\\eprostar\\qa\\config\\config.properties");
			 prop.load(ip);			 
		 }
		 catch(FileNotFoundException e)
		 {
			 e.printStackTrace();
		 }catch(IOException e)
		 {
			 e.printStackTrace();
		 }
	}
	
	public static void initialization()
	{
		String BrowserName=prop.getProperty("browser");
		if(BrowserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "D:/ashita/Practice/SeleniumEnvironment/chromedriver.exe");
			driver=new ChromeDriver();			
		}
		else if(BrowserName.equals("firefox"))
		{
			System.setProperty("webdriver.firefox.marionette", "D:/ashita/Practice/Firefox/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.page_load_timeout, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.imp_time_out, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
}
