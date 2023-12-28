package com.actitime.generic;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListernerImplimentation extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String res = result.getName();
		Reporter.log(res + " Method has got passed!!");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String res = result.getName();
		Reporter.log(res + " Method has got Failed!!");
	TakesScreenshot	ts =(TakesScreenshot)driver;
	File temp=ts.getScreenshotAs(OutputType.FILE);
	File dest = new File(".Screenshots/"+ res + ".png");
	try {
		FileUtils.copyFile(temp, dest);
	} catch (IOException e) {
//		e.printStackTrace();
	}
	
	
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String res = result.getName();
		Reporter.log(res + " Method has got Skipped!!");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	

}
