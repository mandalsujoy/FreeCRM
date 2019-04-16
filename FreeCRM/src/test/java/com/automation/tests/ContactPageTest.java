package com.automation.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.automation.base.BaseClass;
import com.automation.pages.ContactPage;
import com.automation.pages.HomePage;
import com.automation.pages.LoginPage;

public class ContactPageTest extends BaseClass{
	
	
	LoginPage login;
	HomePage home;
	ContactPage contact;
	
	@BeforeMethod
	public void startTest(){
		initialization();
		login=new LoginPage();
		home=new HomePage();
		contact=new ContactPage();
		login.gotoLogin();
	}
		
	@AfterMethod
	public void stopTest(){
		home.gotoLogout();
	}
	
	@Test(priority=1)
	public void contactPageTest(){
		Assert.assertEquals(contact.gotoContact(), "Advanced Search (click to expand)");
	}
	
	@Test(priority=2)
	public void newContactPageTest(){
		contact.gotoNewContact();
	}
	

}
