package com.automation.roughs;

import java.util.Date;

public class RoughClass1 {

	public static void main(String[] args) throws Exception {

//		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")
//				+"\\src\\test\\resources\\executables\\chromedriver.exe");
//		WebDriver driver=new ChromeDriver();
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.get("https://classic.crmpro.com/index.html");
//		driver.findElement(By.name("username")).sendKeys("youandi");
//		driver.findElement(By.name("password")).sendKeys("youandi");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@value='Login']")).click();
//		Thread.sleep(3000);
////		driver.switchTo().frame("mainpanel");
////		String txt=driver.findElement
////				(By.xpath("(//a[text()='Upgrade your account'])[2]/../preceding-sibling::td"))
////				.getText();
////		System.out.println(txt.trim().substring(5).trim());
//		
//		try {
//			
//			driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).isDisplayed();
//			System.out.println("found");
//		} catch (Exception e) {
//			System.out.println("not found");
//		}
//		driver.close();
		
		Date date=new Date();
		System.out.println(date);
		String current=date.toString().replace(":", "_").replace(" ", "_");
		System.out.println(current);
		
	}

}
