package com.ds.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.ts.testBase.TestBase;

public class UtilClass extends TestBase {
	
	public UtilClass()
	{
		PageFactory.initElements(driver, this);
	}

	//get url 
	public String getWebPageUrl()
	{
		
		String url = driver.getCurrentUrl();
		return url;
	}

	public static void takeSS(String filename) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\Rahul\\eclipse-workspace\\17SeptFramework_DalalStreet\\Screenshots\\" +filename+ ".jpg" );
		FileHandler.copy(src, des);
	}

	

	
}

