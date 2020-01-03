package Analyzer;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener{

	public void onTestStart(ITestResult result) {
		System.out.println("Test Started");
		//add
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Success");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed");
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Test Percentage");
		
	}

	public void onStart(ITestContext context) {
		System.out.println();
		
	}

	public void onFinish(ITestContext context) {
		System.out.println();
		
	}

}
