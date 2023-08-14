package MyntraTC;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class Listeners extends TestBaseClass implements ITestListener    {
	
	@Override  
	public void onTestFailure(ITestResult result) {
		 String name = result.getMethod().getMethodName();
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./ScreenShots/"+name+".png");
		try {
			FileUtils.copyFile(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	System.out.println("Failure of test cases and its details are : "+result.getName());  
	} 

}
