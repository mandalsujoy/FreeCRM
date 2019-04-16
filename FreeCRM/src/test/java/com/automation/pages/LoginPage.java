package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;

public class LoginPage extends BaseClass{

	@FindBy(name="username")
	public WebElement username;
	
	@FindBy(name="password")
	public WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	public WebElement login;
	
		
	public LoginPage(){
		
		PageFactory.initElements(driver, this);
	}
	
	public void gotoLogin() {
		username.sendKeys("youandi");
		password.sendKeys("youandi");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		login.click();
		
	}
	
	public void gotoLogout(){
		
	}
	
}
