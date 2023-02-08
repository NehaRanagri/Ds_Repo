package com.ds.pageLayer;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignUpPage {
	
	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='formrow-firstname-Input']")
	private WebElement firstName_txtbox;
	
	@FindBy(xpath = "//input[@id='formrow-lastname-Input']")
	private WebElement lastName_txtbox;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email_txtbox;
	
	@FindBy(xpath ="//input[@name='password']")
	private WebElement password_txtbox;
	
	@FindBy(xpath = "//input[@id='customControlInline']")
	private WebElement termandcondition_chechbox;
	
	@FindBy(xpath = "//button[@class='btn btn-success btn-block']")
	private WebElement getStartjourny_bttn;
	
	public void enterFirstName(String firstname)
	{
		firstName_txtbox.sendKeys(firstname);
	}
	public void enterLastName(String lastname)
	{
		lastName_txtbox.sendKeys(lastname);
	}
	public void enterEmailAddress(String email)
	{
		email_txtbox.sendKeys(email);
	}
	public void enterPassword(String password)
	{
		password_txtbox.sendKeys(password);
	}
	public void clickOnCheckBox()
	{
		termandcondition_chechbox.click();
	}
	public void clickOnGetStartJourny()
	{
		getStartjourny_bttn.click();
	}

}
