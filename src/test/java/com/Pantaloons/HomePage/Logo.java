package com.Pantaloons.HomePage;

import org.testng.annotations.Test;

import com.Pantaloons.Genericutils.BaseClass;
import com.Pantaloons.pomclass.LogoPage;

public class Logo extends BaseClass{

	@Test
	public void logo()
	{
		LogoPage lp= new LogoPage(driver);
		lp.clickOnElement();
		lp.clickOnLogo();
	}
}
