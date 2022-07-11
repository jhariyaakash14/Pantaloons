package com.Pantaloons.HomePage;

import org.testng.annotations.Test;

import com.Pantaloons.Genericutils.BaseClass;
import com.Pantaloons.pomclass.HomePage;

public class Banner extends BaseClass {

	
	@Test
	public void homePageMethod() throws InterruptedException
	{
	HomePage homepage= new HomePage(driver);
	homepage.clickOnWomenBanner();
	homepage.clickOnMenBanner();
	homepage.clickOnKidBanner();
	homepage.clickOnHomeDecorBanner();
	homepage.clickOnAccessoriesBanner();
	homepage.clickOnBrandBanner();
	
	}
}
