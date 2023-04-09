package iListeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleListener implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Test case is started" + result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case is successful" +result.getMethod().getMethodName());
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test case is failed"+result.getMethod().getMethodName());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case is skipped"+result.getMethod().getMethodName());
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Test suite is started"+context.getSuite().getName());
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test suite is finished" +context.getSuite().getName());
		
	}
	
	
	
	

}
