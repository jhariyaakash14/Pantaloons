package com.Pantaloons.pomclass;

import java.time.Duration;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.Pantaloons.Genericutils.WebDriverUtility;

public class CarouselPage extends WebDriverUtility{
public static String actual;
//public static String expected;
	WebDriver driver;
	public CarouselPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div[@class='swiper-button-next'])[3]")
	private WebElement slider;
	
	@FindBy(linkText="@rxtneshhhhh")
	private WebElement productLink;
	
	
	public WebElement getSlider() {
		return slider;
	}
	
	public WebElement getProductLink() {
		return productLink;
	}

	
	
	public void tapOnSlider() throws InterruptedException
	{
		
		slider.click();
		actual = productLink.getText();
		productLink.click();
		System.out.println(actual);
	}
}
