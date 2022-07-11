package com.Pantaloons.pomclass;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Pantaloons.Genericutils.WebDriverUtility;

public class OccationPage extends WebDriverUtility {
	
	WebDriver driver;
	public OccationPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='WOMEN']")
	private WebElement WomenBanner;
	
	@FindBy(xpath="//div[text()='Work Wear']")
	private WebElement WOLink;
	
	@FindBy(xpath="//span[text()='Work Wear']")
	private WebElement WAssertion;
	
	@FindBy(xpath="//div[@class='PlpWeb_normal-content__fKEc-']")
	private List<WebElement> WomenProductName;
	
	@FindBy(xpath = "//span[text()='MEN']")
	private WebElement MenBanner;
	
	@FindBy(xpath="//div[text()='Work Wear']")
	private WebElement MOLink;
	
	@FindBy(xpath="//span[text()='Work Wear']")
	private WebElement MAssertion;
	
	@FindBy(xpath = "//span[text()='KIDS']")
	private WebElement KidBanner;
	
	@FindBy(xpath="//div[text()='Casual']")
	private WebElement KOLink;
	
	@FindBy(xpath="//span[text()='Casual']")
	private WebElement KAssertion;
	
	
	
	@FindBy(xpath="//span[text()='HOME DECOR']")
	private WebElement HomeDecorBanner;
	
	@FindBy(xpath="//div[text()='Casual']")
	private WebElement HDOLink;
	

	@FindBy(xpath="//span[text()='Casual']")
	private WebElement HDAssertion;
	
	
	
	public WebElement getWAssertion() {
		return WAssertion;
	}

	public WebElement getMAssertion() {
		return MAssertion;
	}

	public WebElement getKAssertion() {
		return KAssertion;
	}

	public WebElement getHDAssertion() {
		return HDAssertion;
	}

	public WebElement getWomenBanner() {
		return WomenBanner;
	}

	public WebElement getWOLink() {
		return WOLink;
	}

	public List<WebElement> getWomenProductName() {
		return WomenProductName;
	}

	public WebElement getMenBanner() {
		return MenBanner;
	}

	public WebElement getMOLink() {
		return MOLink;
	}

	

	public WebElement getKidBanner() {
		return KidBanner;
	}

	public WebElement getKOLink() {
		return KOLink;
	}

	

	public WebElement getHomeDecorBanner() {
		return HomeDecorBanner;
	}

	public WebElement getHDOLink() {
		return HDOLink;
	}

//	public List<WebElement> getHomeDecoreProductName() {
//		return HomeDecoreProductName;
//	}
	
	public void hoverOnWomen() throws InterruptedException
	{
		mouseHover(driver,WomenBanner);
		String actual = WOLink.getText();
		WOLink.click();
		String expected = WAssertion.getText();
		Assert.assertEquals(actual, expected);
		int size = WomenProductName.size();
		System.out.println("Size Of Women Product in a page :"+size);
		for(WebElement product:WomenProductName) {
			String productsname = product.getText();
			System.out.println("Name Of All The Product In Women Page :"+productsname);
			
		}
	}
	
	public void hoverOnMen() throws InterruptedException
	{
		mouseHover(driver,MenBanner);
		String actual = MOLink.getText();
		MOLink.click();
		String expected = MAssertion.getText();
		Assert.assertEquals(actual, expected);
			
		}
	
	
	public void hoverOnKid() throws InterruptedException
	{
		mouseHover(driver,KidBanner);
		String actual = KOLink.getText();
		KOLink.click();
		String expected = KAssertion.getText();
		Assert.assertEquals(actual, expected);
			
		}
	
	
	public void hoverOnHomeDecore() throws InterruptedException
	{
		mouseHover(driver,HomeDecorBanner);
		String actual = HDOLink.getText();
		HDOLink.click();
		String expected = HDAssertion.getText();
		Assert.assertEquals(actual, expected);
		
		
	}
}
