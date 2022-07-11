package com.Pantaloons.pomclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecommendationPage {

	WebDriver driver;
	public RecommendationPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//img[@alt='Teal Graphic Crew Neck T-Shirt']")
	private WebElement productImg;
	
	@FindBy(xpath="//div[text()='Teal Graphic Crew Neck T-Shirt']")
	private WebElement productText;
}
