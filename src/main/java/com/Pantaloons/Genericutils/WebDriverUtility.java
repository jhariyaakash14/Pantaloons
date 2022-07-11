package com.Pantaloons.Genericutils;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {

	public void waitUntilPageLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public void selectOption(WebElement element, String option)
	{
		Select s =new Select(element);
		s.selectByVisibleText(option);
	}
	
	public void mouseHover(WebDriver driver, WebElement element)
	{
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
	}
	
	public void slider(WebDriver driver, int X, int Y)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+X+","+Y+")");
		
	}
	
	public void moveToElement(WebDriver driver,WebElement element, int X, int Y) {
		
		Actions a=new Actions(driver);
		a.moveToElement(element, X, Y).build().perform();
	}
	
	public void wait(WebDriver driver, long time, WebElement element)
	{
		WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(time));
		wait.until(ExpectedConditions.or(ExpectedConditions.elementToBeClickable(element)));
	}
	
}
