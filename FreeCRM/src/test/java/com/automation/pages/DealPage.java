package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;

public class DealPage extends BaseClass{
	
	@FindBy(xpath="//a[text()='Deals']")
	WebElement deal;
	
	@FindBy(xpath="//a[text()='New Deal']")
	WebElement newDeal;
	
	@FindBy(xpath="//td[contains(text(),'Deals')]")
	WebElement dealLabel;
	
	@FindBy(id="prospectForm")
	WebElement dealForm;
	
	public DealPage(){
		PageFactory.initElements(driver, this);
	}
	
	public boolean gotoDeal(){
		boolean status=false;
		driver.switchTo().frame("mainpanel");
		deal.click();
		try {
			dealLabel.isDisplayed();
			status=true;
		} catch (Exception e) {
			status=false;
		}
		driver.switchTo().defaultContent();
		return status;
	}
	
	public boolean gotoNewDeal(){
		boolean status=false;
		driver.switchTo().frame("mainpanel");
		Actions act=new Actions(driver);
		act.moveToElement(deal).moveToElement(newDeal).click().build().perform();
		try {
			dealForm.isEnabled();
			status=true;
		} catch (Exception e) {
			status=false;
		}
		driver.switchTo().defaultContent();
		return status;
	}

}
