package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;

public class HomePageTest extends BaseClass {

	LoginPage login;
	HomePage home;
	
	@BeforeMethod
	public void startTest(){
		initialization();
		login=new LoginPage();
		home=new HomePage();
		login.gotoLogin();
	}
	
	@AfterMethod
	public void stopTest(){
		home.gotoLogout();
	}
	
	@Test(priority=1)
	public void successfullyLoginTest() {
		
		String actual=home.showUser();
		Assert.assertEquals(actual, "sujoy mandal");
				
	}
	
	@Test(priority=2)
	public void logoTest(){
		
		Assert.assertTrue(home.checkLogoPresent());
	}
	
	@Test(priority=3)
	public void upgradeTest(){
		Assert.assertTrue(home.checkUpgrade());
		
	}

}
