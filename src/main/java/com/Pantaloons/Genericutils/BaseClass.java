package com.Pantaloons.Genericutils;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass implements IPathConstant {
	
	public WebDriver driver;
	public FileUtility property = new FileUtility();
	public WebDriverUtility wb = new WebDriverUtility();
	Photo photo=new Photo();

	@BeforeMethod
	public void openapp() throws Throwable
	{
		 System.setProperty(key, value);
	      driver= new ChromeDriver();
		 driver.get(property.getPropertyKeyValue("url"));
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		// p.getIgnoreBtn().click();
	}
	
	@AfterMethod
	public void closeApp() throws IOException
	{
		
		driver.quit();
		}
	}

//(//div[contains(@id,'swiper-wrapper')])[2]/div