package com.automation.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.automation.utilities.ExtentReportManager;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class BaseClass {
	
	public static WebDriver driver;
	public static ExtentReports report=ExtentReportManager.getReport();;
	public static ExtentTest test;
	
		
	public static void initialization(){
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
				+"\\src\\test\\resources\\executables\\chromedriver.exe");
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("disable-infobar");
		driver=new ChromeDriver(option);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://classic.crmpro.com/index.html");
//		WebElement username=driver.findElement(By.name("username"));
//		username.sendKeys("youandi");
//		WebElement password=driver.findElement(By.name("password"));
//		password.sendKeys("youandi");
//		WebElement login=driver.findElement(By.xpath("//input[@value='Login']"));
//		login.click();
		
		
		
	}

}
