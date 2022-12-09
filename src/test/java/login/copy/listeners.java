package login.copy;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("**** Test has been started ****"+result.getName());
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("**** Test has been executed successifully ****"+result.getName());
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("**** Test has failes ****"+result.getName());
	}


	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("**** Test has been finished ****"+context.getName());
	}

	
	
			
			
		
		
}