package com.ds.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExchangePage_sell {
	
	
	public ExchangePage_sell(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//-------------- obj repo -----------------
	@FindBy(xpath = "//a[contains(text(),'Sell')]")
	private WebElement sell_bttn1;
	
	@FindBy(xpath="//input[@id='quantity']")
	private WebElement quantity_txtbox;
	
	@FindBy(xpath = "//button[contains(text(),'Sell')]")
	private WebElement sell_bttn2;
	
	@FindBy(xpath="//div[contains(text(),'Order Created')]")
	private WebElement status_smg;
	
	@FindBy(xpath ="(//label[@class='btn btn-outline-secondary'])[8]")
	private WebElement CustmeLimit_bttn;

	@FindBy(xpath ="(//label[text()='Intraday'])[2]")
	private WebElement intrday_button;
	
	public void clickOnSellButton1()
	{
		sell_bttn1.click();
	}
	
	public void clickOnSellButton2()
	{
		sell_bttn2.click();
	}
	
	public void enterQuanity(String count)
	{
		quantity_txtbox.click();
		quantity_txtbox.sendKeys(count);
	}
	public String getOrderStatus()
	{
		String msg = status_smg.getText();
		return msg;
	}
	public void ClickOnCustmeLimitButton()
	{
		CustmeLimit_bttn.click();
	}
	
	public void clickOnIntradayButton()
	{
		intrday_button.click();
	}


}



