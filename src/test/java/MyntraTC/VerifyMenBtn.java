package MyntraTC;

import java.io.IOException;

import org.testng.annotations.Test;

import POM.MyntraHomePage;

public class VerifyMenBtn extends  TestBaseClass  {
	
	@Test
	public void verifyMenBtnFun() throws IOException {
		
		MyntraHomePage h= new MyntraHomePage(driver);
		h.clickOnMenBtn();
		
		
		log.info("Man button clicked");
	}

}
