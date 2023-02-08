package com.ds.testLayer;

import org.testng.annotations.Test;

import com.ds.pageLayer.LoginPage;
import com.ds.pageLayer.SignUpPage;
import com.ts.testBase.TestBase;

public class SignUpPageTest extends TestBase{
	
	@Test
	
	public void verifysignUpCorrectCrd()
	{
		
		login_obj.clickONSignUpLink();
		sign_obj.enterFirstName("David");
		sign_obj.enterLastName("Warner");
		sign_obj.enterEmailAddress("David234@gmail.com");
		sign_obj.enterPassword("Testcase@123");
		sign_obj.clickOnCheckBox();
		sign_obj.clickOnGetStartJourny();
	}

}
