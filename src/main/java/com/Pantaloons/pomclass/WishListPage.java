package com.Pantaloons.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Pantaloons.Genericutils.WebDriverUtility;

public class WishListPage extends WebDriverUtility{
	
	WebDriver driver;
	public WishListPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[@title='Wishlist']")
	private WebElement wishlistIcon;
	
	@FindBy(xpath="//h1[text()='Login/Register to wishlist']")
	private WebElement loginText;
	
	public WebElement getWishlistIcon() {
		return wishlistIcon;
	}

	public WebElement getLoginText() {
		return loginText;
	}
	
	public void wishlistIconClick() throws InterruptedException
	{
		wishlistIcon.click();
		String actual = loginText.getText();
		String expected="Login/Register to wishlist";
		Assert.assertEquals(actual, expected);
	//	Thread.sleep(2000);
	}

}
