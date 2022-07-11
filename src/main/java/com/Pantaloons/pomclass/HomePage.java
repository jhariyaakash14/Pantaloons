package com.Pantaloons.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Pantaloons.Genericutils.WebDriverUtility;

public class HomePage extends WebDriverUtility{

	@FindBy(xpath="//span[text()='WOMEN']")
	private WebElement WomenBanner;
	
	@FindBy(xpath="//a[@title='Western Wear']/span[contains(@class,' lazy-load-image-background blur')]")
	private WebElement WProductLink;
	
	@FindBy(xpath="//a[@title='Dark Blue Jeans']")
	private WebElement WomanProduct;

	@FindBy(xpath="//span[text()='MEN']")
	private WebElement MenBanner;

	@FindBy(xpath="//span[text()='KIDS']")
	private WebElement KidBanner;

	@FindBy(xpath="//span[text()='HOME DECOR']")
	private WebElement HomeDecorBanner;

	@FindBy(xpath="//span[text()='ACCESSORIES']")
	private WebElement accessoriesBanner;

	@FindBy(xpath="//span[text()='BRANDS']")
	private WebElement brandBanner;

	@FindBy(linkText="ETHNIC WEAR")
	private WebElement assertion;

	@FindBy(linkText="Sweaters & Sweatshirts")
	private WebElement expText;

	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getExpText() {
		return expText;
	}

	public WebElement getAssertion() {
		return assertion;
	}

	public WebElement getWomenBanner() {
		return WomenBanner;
	}

	public WebElement getMenBanner() {
		return MenBanner;
	}

	public WebElement getKidBanner() {
		return KidBanner;
	}

	public WebElement getHomeDecorBanner() {
		return HomeDecorBanner;
	}

	public WebElement getAccessoriesBanner() {
		return accessoriesBanner;
	}

	public WebElement getBrandBanner() {
		return brandBanner;
	}



	public void clickOnWomenBanner() throws InterruptedException
	{
		WomenBanner.click();
		String actual = assertion.getText();
		String expected = "ETHNIC WEAR";
		Assert.assertEquals(actual, expected);
		
	}

	public void clickOnMenBanner() throws InterruptedException
	{
		MenBanner.click();
		String actual = assertion.getText();
		String expected = "ETHNIC WEAR";
		Assert.assertEquals(actual, expected);
	//	Thread.sleep(3000);
		
	}
	public void clickOnKidBanner() throws InterruptedException
	{
		KidBanner.click();
		String actual = expText.getText();
		String expected = "Sweaters & Sweatshirts";
		Assert.assertEquals(actual, expected);
	//	Thread.sleep(3000);
	}
	public void clickOnHomeDecorBanner() throws InterruptedException
	{
		HomeDecorBanner.click();
	//	Thread.sleep(3000);
	}
	public void clickOnAccessoriesBanner() throws InterruptedException
	{
		accessoriesBanner.click();
	//	Thread.sleep(3000);
	}
	public void clickOnBrandBanner() throws InterruptedException
	{
		brandBanner.click();
	//	Thread.sleep(3000);
	}

	

}
