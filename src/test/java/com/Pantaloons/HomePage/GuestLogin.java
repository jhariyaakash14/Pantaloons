package com.Pantaloons.HomePage;

import org.testng.annotations.Test;

import com.Pantaloons.Genericutils.BaseClass;
import com.Pantaloons.pomclass.CartPage;
import com.Pantaloons.pomclass.LoginPage;
import com.Pantaloons.pomclass.WishListPage;

public class GuestLogin extends BaseClass{

	@Test
	public void guestLogin() throws InterruptedException
	{
		LoginPage LP= new LoginPage(driver);
		LP.myAccount();
		
		WishListPage wp=new WishListPage(driver);
		wp.wishlistIconClick();
		
		CartPage cp=new CartPage(driver);
		cp.clickCartIcon();
	}
}
