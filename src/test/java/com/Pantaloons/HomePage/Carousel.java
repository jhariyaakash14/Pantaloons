package com.Pantaloons.HomePage;

import org.testng.annotations.Test;

import com.Pantaloons.Genericutils.BaseClass;
import com.Pantaloons.pomclass.CarouselPage;

public class Carousel extends BaseClass {

	@Test
	public void carousel() throws InterruptedException
	{
		CarouselPage cp= new CarouselPage(driver);
		cp.tapOnSlider();
	}
	
}
