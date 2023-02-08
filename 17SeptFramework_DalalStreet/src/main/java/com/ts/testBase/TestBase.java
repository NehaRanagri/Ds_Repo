package com.ts.testBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.ds.pageLayer.DashboardPage;
import com.ds.pageLayer.ExchangePage;
import com.ds.pageLayer.ExchangePage_sell;
import com.ds.pageLayer.LoginPage;
import com.ds.pageLayer.SignUpPage;
import com.ds.pageLayer.TranactionPage;
import com.ds.utilities.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public static WebDriver driver;
	public static LoginPage login_obj ;
	public static DashboardPage dash_obj ;
	public static ExchangePage exchange_obj ;
	public static TranactionPage tran_obj ;
	public static UtilClass util_obj ;
	public static SignUpPage sign_obj ;
	public static ExchangePage_sell exchange_obj_sell1;;

	
	@BeforeMethod
	public void setup()
	{
		
    String br = "CHROME";
		
		if(br.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(br.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else if(br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else
		{
			System.out.println("Please provide correct browser name");
		}
		
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
		//------object creation------
		 login_obj = new LoginPage(driver);
		 dash_obj = new DashboardPage(driver);
		 exchange_obj = new ExchangePage(driver);
		 tran_obj = new TranactionPage(driver);
		 util_obj = new UtilClass();
		 sign_obj = new SignUpPage(driver);
		 exchange_obj_sell1 = new ExchangePage_sell(driver);
		//-----------login step----
			login_obj.enterEmailAddress("David234@gmail.com");
			login_obj.enterPassword("Testcase@123");
			login_obj.clickOnLoginButton();
	}
     
	
	@AfterMethod
	public void tearDown()
	{
	//	driver.quit();
	}
}
