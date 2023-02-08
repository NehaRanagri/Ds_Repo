package com.ds.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ds.pageLayer.DashboardPage;
import com.ds.pageLayer.ExchangePage;
import com.ds.pageLayer.ExchangePage_sell;
import com.ds.pageLayer.LoginPage;
import com.ts.testBase.TestBase;

public class SellFunctionalityTest extends TestBase{
	
	@Test
	public void verifySellFunctionalityWithLongTermAndMarket() throws InterruptedException
	{
		String expected_result = "Order Created successfully";
	
		
		Thread.sleep(5000);
		//------------------------------------------------
		dash_obj.enterCompanyName("Wipro");
		dash_obj.clickOnOption();
		Thread.sleep(3000);
		//-----------
		exchange_obj_sell1.clickOnSellButton1();
		exchange_obj_sell1.enterQuanity("2");
		exchange_obj_sell1.clickOnSellButton2();
		Thread.sleep(3000);
		//-------------
		String actaul_result = exchange_obj.getOrderStatus();
		Assert.assertEquals(actaul_result, expected_result);
		
	}
	
	@Test
	public void verifySellFunctionalityWithLongTermAndCustomeLimit() throws InterruptedException
	{
		String expected_result = "Order Created successfully";
	
		
		Thread.sleep(5000);
		//------------------------------------------------
		dash_obj.enterCompanyName("Wipro");
		dash_obj.clickOnOption();
		Thread.sleep(3000);
		exchange_obj_sell1.clickOnSellButton1();
		exchange_obj_sell1.ClickOnCustmeLimitButton();
		exchange_obj_sell1.enterQuanity("2");
		exchange_obj_sell1.clickOnSellButton2();
		Thread.sleep(3000);
		//-------------
		String actaul_result = exchange_obj.getOrderStatus();
		Assert.assertEquals(actaul_result, expected_result);
		
	}
	@Test 
	public void verifySellFunctionalityWithIntrdayAndMarket() throws InterruptedException
	{
		String expected_result = "Order Created successfully";
	
		
		Thread.sleep(5000);
		//------------------------------------------------
		dash_obj.enterCompanyName("Wipro");
		dash_obj.clickOnOption();
		Thread.sleep(3000);
		exchange_obj_sell1.clickOnSellButton1();
		exchange_obj_sell1.clickOnIntradayButton();
		exchange_obj_sell1.enterQuanity("2");
		exchange_obj_sell1.clickOnSellButton2();
		Thread.sleep(3000);
		//-------------
		String actaul_result = exchange_obj.getOrderStatus();
		Assert.assertEquals(actaul_result, expected_result);
		
	}
	
	public void verifySellFunctionalityWithIntrdayAndCustmeLimit() throws InterruptedException
	{
		String expected_result = "Order Created successfully";
		
	
		Thread.sleep(5000);
		//------------------------------------------------
		dash_obj.enterCompanyName("Wipro");
		dash_obj.clickOnOption();
		Thread.sleep(3000);
		exchange_obj_sell1.clickOnSellButton1();
		exchange_obj_sell1.clickOnIntradayButton();
		exchange_obj_sell1.ClickOnCustmeLimitButton();
		exchange_obj_sell1.enterQuanity("2");
		exchange_obj_sell1.clickOnSellButton2();
		Thread.sleep(3000);
		//-------------
		String actaul_result = exchange_obj.getOrderStatus();
		Assert.assertEquals(actaul_result, expected_result);
		
	}
	
}
