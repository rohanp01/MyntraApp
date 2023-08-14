package MyntraTC;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {
	WebDriver driver;
	
	public void takeScreenshot(WebDriver driver) throws IOException {
		this.driver=driver;
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("./ScreenShots/abc.png");
		FileUtils.copyFile(source, dest);
	}
	
	
	
}
