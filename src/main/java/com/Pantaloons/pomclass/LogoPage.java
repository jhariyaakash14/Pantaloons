package com.Pantaloons.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Pantaloons.Genericutils.WebDriverUtility;

public class LogoPage extends WebDriverUtility{

	public static String actual;
	public static String expected;
	WebDriver driver;
	public LogoPage(WebDriver driver){
	
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@class='swiper-slide swiper-slide-duplicate swiper-slide-active']")
	private WebElement slider;
	
	@FindBy(xpath="//a[@title='Pantaloons']")
	private WebElement logoLink;
	
	public WebElement getSlider() {
		return slider;
	}

	public WebElement getLogoLink() {
		return logoLink;
	}

	public void clickOnElement()
	{
		slider.click();
	}
	
	public void clickOnLogo()
	{
		logoLink.click();
		waitUntilPageLoad(driver);
	}
	
	
	
	
}
