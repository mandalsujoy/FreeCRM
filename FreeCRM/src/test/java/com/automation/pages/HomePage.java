package com.automation.pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automation.base.BaseClass;

public class HomePage extends BaseClass{
	
	@FindBy(xpath="(//a[text()='Upgrade your account'])[2]/../preceding-sibling::td")
	WebElement user;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logout;
	
	@FindBy(xpath="(//a[text()='Upgrade your account'])[2]")
	WebElement upgrade;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	
	public String showUser(){
		String username=null;
		driver.switchTo().frame("mainpanel");
		username=user.getText().trim().substring(5).trim();
		driver.switchTo().defaultContent();
		return username;
	}
	
	public boolean checkLogoPresent(){
		
		try {
			driver.switchTo().frame("mainpanel");
			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).isDisplayed();
			driver.switchTo().defaultContent();
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public boolean checkUpgrade(){
		boolean status=false;
		String basewindow=driver.getWindowHandle();
		driver.switchTo().frame("mainpanel");
		upgrade.click();
		Set<String> windows=driver.getWindowHandles();
		for(String w:windows){
			if(!w.equals(basewindow)){
				driver.switchTo().window(w);
				try {
					driver.findElement(By.xpath("//*[text()='CRMPRO : Upgrade to Pro Account']")).isDisplayed();
					status=true;
				} catch (Exception e) {
					status=false;
				}
				driver.close();
				driver.switchTo().window(basewindow);
			}
			
		}
		//driver.switchTo().defaultContent();
		return status;
	}
	
	public void gotoLogout(){
		driver.switchTo().frame("mainpanel");
		logout.click();
		driver.quit();
	}

}
