package com.Pantaloons.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Pantaloons.Genericutils.WebDriverUtility;

public class NewArrivalsPage extends WebDriverUtility{

	WebDriver driver;
	public NewArrivalsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[text()='WOMEN']")
	private WebElement WomenBanner;
	
	@FindBy(xpath = "//div[text()='Tees & tops']")
	private WebElement TTLink;
	
	@FindBy(xpath = "//span[@title='Tees & Tops']")
	private WebElement teesAndTopsLink;
	
	@FindBy(xpath = "//span[text()='MEN']")
	private WebElement MenBanner;
	
	@FindBy(xpath = "//div[text()='Sleepwear']/..//div[@class='image-text']")
	private WebElement SWLink;
	
	@FindBy(xpath = "//span[@title='Sleepwear']")
	private WebElement sleepwearLink;
	
	@FindBy(xpath = "//span[text()='KIDS']")
	private WebElement KidBanner;
	
	@FindBy(xpath = "//div[text()='Dresses']")
	private WebElement dressesLink;
	
	
	public WebElement getWomenBanner() {
		return WomenBanner;
	}

	public WebElement getTTLink() {
		return TTLink;
	}

	public WebElement getTeesAndTopsLink() {
		return teesAndTopsLink;
	}

	public WebElement getMenBanner() {
		return MenBanner;
	}

	public WebElement getSWLink() {
		return SWLink;
	}

	public WebElement getSleepwearLink() {
		return sleepwearLink;
	}

	public WebElement getKidBanner() {
		return KidBanner;
	}

	public WebElement getDressesLink() {
		return dressesLink;
	}
	
	public void hoverOnWomen()
	{
		mouseHover(driver,WomenBanner);
		String actual = TTLink.getText();
		TTLink.click();
		String expected = teesAndTopsLink.getText();
		if(actual.equalsIgnoreCase(expected));
		{
			System.out.println("Pass");
		}
	}
	
	public void hoverOnMen()
	{
		mouseHover(driver,MenBanner);
		String actual = "Sleepwear";
		SWLink.click();
		String expected = sleepwearLink.getText();
		Assert.assertEquals(actual, expected);
	}
	
	public void hoverOnKids() {
		mouseHover(driver, KidBanner);
		String actual = dressesLink.getText();
		dressesLink.click();
		String expected = "Dresses";
		Assert.assertEquals(actual, expected);
	}
	
	
}
