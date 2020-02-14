package com.crm.qa.util;

import com.crm.qa.base.TestBase;

public class TestUtil extends TestBase {

	
	
	public static final long PAGE_LOAD_TIMEOUT = 100;
	public static final long IMPLICIT_WAIT = 100;

	

	public void switchToFrame() {
		// TODO Auto-generated method stub
		driver.switchTo().frame("intercom-frame");
	}

}
