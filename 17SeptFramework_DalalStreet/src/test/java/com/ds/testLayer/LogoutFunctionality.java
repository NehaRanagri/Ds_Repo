package com.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.DashboardPage;
import com.ds.pageLayer.LoginPage;
import com.ds.utilities.UtilClass;
import com.ts.testBase.TestBase;

public class LogoutFunctionality extends TestBase {
	@Test
	public void verifyLogoutFunctionality() throws InterruptedException
	{
		String expected_result = "https://www.apps.dalalstreet.ai/logout";
		
		
		Thread.sleep(5000);
		dash_obj.clickOnProfileDropdown();
		dash_obj.clickOnPowerOff();
		
		String actual_result = util_obj.getWebPageUrl();
		Assert.assertEquals(actual_result, expected_result);
	}
}


