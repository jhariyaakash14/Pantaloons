package com.Pantaloons.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Pantaloons.Genericutils.WebDriverUtility;

public class CartPage extends WebDriverUtility{

	WebDriver driver;
	public CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Cart']")
	private WebElement CartIcon;
	
	@FindBy(xpath="//span[text()='My bag']")
	private WebElement MyBagText;
	
	public WebElement getCartIcon() {
		return CartIcon;
	}

	public WebElement getMyBagText() {
		return MyBagText;
	}
	
	public void clickCartIcon() throws InterruptedException
	{
		CartIcon.click();
		String actual = MyBagText.getText();
		String expected= "My bag";
		Assert.assertEquals(actual, expected);
	//	Thread.sleep(2000);
	}
}
