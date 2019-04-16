package com.automation.listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.automation.base.BaseClass;
import com.relevantcodes.extentreports.LogStatus;

public class CustomListener extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
		
		System.out.println(result.getName()+" started!!");
		test=report.startTest(result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		
		test.log(LogStatus.PASS, result.getName()+" Passed!!");
		report.endTest(test);
		report.flush();
	}

	public void onTestFailure(ITestResult result) {
		
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		
		
	}

}
