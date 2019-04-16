package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;

public class ContactPage extends BaseClass{
	
	@FindBy(xpath="//a[text()='Contacts']")
	WebElement contact;
	
	@FindBy(xpath="//a[text()='New Contact']")
	WebElement newContact;
	
	@FindBy(xpath="//*[@id='btn_cs_search']/..")
	WebElement search;
	
	@FindBy(xpath="//*[text()='Contact Information']")
	WebElement contactInformationLabel;
	
	@FindBy(id="contactForm")
	WebElement contactForm;

	public ContactPage(){
		PageFactory.initElements(driver, this);
	}
	
	public String gotoContact(){
		
		driver.switchTo().frame("mainpanel");
		contact.click();
		String advanceSearch=search.getText().trim();
		driver.switchTo().defaultContent();
		return advanceSearch;
	}
	
	public boolean gotoNewContact() {
		
		boolean status=true;
		driver.switchTo().frame("mainpanel");
		Actions act=new Actions(driver);
		act.moveToElement(contact).moveToElement(newContact).click().build().perform();
		try {
			contactInformationLabel.isDisplayed();
			status=true;
		} catch (Exception e) {
			status=false;
		}
		
		driver.switchTo().defaultContent();
		return status;
	}

}
