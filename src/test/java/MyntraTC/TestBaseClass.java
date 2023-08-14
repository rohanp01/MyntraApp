package MyntraTC;

import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBaseClass {
	public static WebDriver driver;
	public static Logger log= org.apache.logging.log4j.LogManager.getLogger(TestBaseClass.class);
	
	@BeforeMethod
	public void startPage() {
		
		
		
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		log.info("chrome launched");
		driver.manage().window().maximize();
		log.info("window maximise");
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		log.info("applied wait");
		
	}
	
	
	@AfterMethod
	public void endPage() {
		driver.close();
		
	}

}
