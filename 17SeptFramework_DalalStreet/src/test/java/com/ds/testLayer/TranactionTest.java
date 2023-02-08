package com.ds.testLayer;

import org.testng.annotations.Test;

import com.ds.pageLayer.DashboardPage;
import com.ds.pageLayer.LoginPage;
import com.ds.pageLayer.TranactionPage;
import com.ts.testBase.TestBase;

public class TranactionTest extends TestBase {
	
	@Test
	public void getDataFromTransactionPage() throws InterruptedException
	{
		
		Thread.sleep(5000);
		dash_obj.clickOnTranactionLink();
		tran_obj.getAllData();
	}
}
	
	
	
	

