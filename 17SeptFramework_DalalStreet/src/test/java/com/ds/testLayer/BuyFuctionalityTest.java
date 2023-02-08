package com.ds.testLayer;

import org.testng.annotations.Test;

import com.ds.pageLayer.DashboardPage;
import com.ds.pageLayer.ExchangePage;
import com.ds.pageLayer.LoginPage;
import com.ts.testBase.TestBase;
import org.testng.Assert;

public class BuyFuctionalityTest extends TestBase{
	
	@Test
	
	public void verifyBuyFunctionalityWithLongTermAndMarket() throws InterruptedException
	{
		String expected_result = "Order Created successfully";
	
		
		Thread.sleep(5000);
		//------------------------------------------------
		dash_obj.enterCompanyName("Wipro");
		dash_obj.clickOnOption();
		Thread.sleep(3000);
		exchange_obj.clickOnBuyButton1();
		exchange_obj.enterQuanity("2");
		exchange_obj.clickOnBuyButton2();
		Thread.sleep(3000);
		//-------------
		String actaul_result = exchange_obj.getOrderStatus();
		Assert.assertEquals(actaul_result, expected_result);
		
	}
    @Test
	public void verifyBuyFunctionalityWithLongTermAndCustmeLimit() throws InterruptedException
	{
		String expected_result = "Order Created successfully";
	
	
		Thread.sleep(5000);
		//------------------------------------------------
		dash_obj.enterCompanyName("Wipro");
		dash_obj.clickOnOption();
		Thread.sleep(3000);
		exchange_obj.clickOnBuyButton1();
		exchange_obj.enterQuanity("2");
		exchange_obj.clickOnBuyButton2();
		exchange_obj.ClickOnCustmeLimitButton();
		Thread.sleep(3000);
		//-----
		String actaul_result = exchange_obj.getOrderStatus();
		Assert.assertEquals(actaul_result, expected_result);
		
	}
    @Test
	public void verifyBuyFunctionalityWithIntradayAndMarket() throws InterruptedException
	{
		String expected_result = "Order Created Successfully";
	
		
		Thread.sleep(5000);
		//------------------------------------------------
		dash_obj.enterCompanyName("Wipro");
		dash_obj.clickOnOption();
		Thread.sleep(3000);
		exchange_obj.clickOnBuyButton1();
		
		exchange_obj.enterQuanity("2");
		exchange_obj.clickOnBuyButton2();
		Thread.sleep(3000);
		
		//-----------
		String actaul_result = exchange_obj.getOrderStatus();
		Assert.assertEquals(actaul_result, expected_result);
		
	}
  @Test
 public void verifyBuyFunctionalityWithIntradayAndCustmeLimit()throws InterruptedException
{
	String expected_result = "Order Created successfully";
	
	
	Thread.sleep(5000);
	//------------------------------------------------
	dash_obj.enterCompanyName("Wipro");
	dash_obj.clickOnOption();
	Thread.sleep(3000);
	exchange_obj.clickOnBuyButton1();
    exchange_obj.clickOnIntrdayButton();
	exchange_obj.ClickOnCustmeLimitButton();
	exchange_obj.clickOnBuyButton1();
	exchange_obj.enterQuanity("2");
	exchange_obj.clickOnBuyButton2();
	
	Thread.sleep(3000);
	//-------
	String actaul_result = exchange_obj.getOrderStatus();
	Assert.assertEquals(actaul_result, expected_result);
	
}

}
