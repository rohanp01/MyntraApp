package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraHomePage {
	WebDriver driver;
	
	@FindBy(xpath = "//a[@class='desktop-main'][normalize-space()='Men']")private WebElement Men;
	
	
	public MyntraHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void clickOnMenBtn() {
		Men.click();
	}

}
