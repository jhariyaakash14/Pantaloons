package com.Pantaloons.HomePage;

import org.testng.annotations.Test;

import com.Pantaloons.Genericutils.BaseClass;
import com.Pantaloons.pomclass.NewArrivalsPage;

public class NewArrivals extends BaseClass {
	
	@Test
	public void newArrivals()
	{
		NewArrivalsPage newarrival=new NewArrivalsPage(driver);
		newarrival.hoverOnWomen();
		newarrival.hoverOnMen();
		newarrival.hoverOnKids();
	}

}
