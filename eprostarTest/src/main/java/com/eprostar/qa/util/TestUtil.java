package com.eprostar.qa.util;

import com.eprostar.qa.base.TestBase;

public class TestUtil extends TestBase{

	public static long page_load_timeout=30;
	public  static long imp_time_out=20;
	
	public void switchToFrame()
	{
		driver.switchTo().frame("name of frame");
	}
}
