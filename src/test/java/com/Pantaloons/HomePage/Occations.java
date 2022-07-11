package com.Pantaloons.HomePage;

import org.testng.annotations.Test;

import com.Pantaloons.Genericutils.BaseClass;
import com.Pantaloons.pomclass.OccationPage;

public class Occations extends BaseClass{

	@Test
	public void occations() throws InterruptedException {
		
		OccationPage OP= new OccationPage(driver);
		OP.hoverOnWomen();
		OP.hoverOnMen();
		OP.hoverOnKid();
		OP.hoverOnHomeDecore();
	}

}