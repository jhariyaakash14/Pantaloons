package com.Pantaloons.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='My Account']")
	private WebElement myAccountLink;
	
	@FindBy(xpath="//h1[text()='Login/Register']")
	private WebElement loginPage;
	
	public WebElement getMyAccountLink() {
		return myAccountLink;
	}

	public WebElement getLoginPage() {
		return loginPage;
	}
	
	public void myAccount() throws InterruptedException
	{
		myAccountLink.click();
		String actual = loginPage.getText();
		String Expected="Login/Register";
		Assert.assertEquals(actual, Expected);
	//	Thread.sleep(2000);
	}
}
