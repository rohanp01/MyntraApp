package MyntraTC;

import org.testng.annotations.Test;

import POM.MyntraHomePage;

public class VerifyMenBtn extends TestBaseClass {
	
	@Test
	public void verifyMenBtnFun() {
		
		MyntraHomePage h= new MyntraHomePage(driver);
		h.clickOnMenBtn();
	}

}
