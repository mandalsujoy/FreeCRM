package com.automation.utilities;

import java.io.File;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReportManager {
	
	static ExtentReports report;
	
	
	public static ExtentReports getReport(){
		
		String name=System.getProperty("user.dir")+"\\target\\"+TestUtils.getCurrent()+".html";
		report=new ExtentReports(name,true,DisplayOrder.OLDEST_FIRST);
		report.loadConfig(new File(System.getProperty("user.dir")+
				"\\src\\test\\resources\\extentconfig\\ReportsConfig.xml"));
		return report;
	}

}
