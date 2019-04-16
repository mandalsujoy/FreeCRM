package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.pages.DealPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;

public class DealPageTest extends BaseClass{

	LoginPage login;
	HomePage home;
	DealPage deal;
	
	@BeforeMethod
	public void startTest(){
		initialization();
		login=new LoginPage();
		home=new HomePage();
		deal=new DealPage();
		login.gotoLogin();
	}
		
	@AfterMethod
	public void stopTest(){
		home.gotoLogout();
	}
	
	@Test(priority=1)
	public void dealPageTest(){
		Assert.assertTrue(deal.gotoDeal());
	}
	
	@Test(priority=2)
	public void newDealPageTest(){
		Assert.assertTrue(deal.gotoNewDeal());
	}
}
