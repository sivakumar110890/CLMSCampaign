package testSuite;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import commonFunctions.commonFuntion;
import pageObject.LoginPageObject;

public class LoginTestCase extends commonFuntion {

	static Logger log = Logger.getLogger(LoginTestCase.class);

	@Test
	public void LoginTest()
	{
		PageFactory.initElements(driver,LoginPageObject.class );
		LoginPageObject.Username.sendKeys(prop.getProperty("username"));
		LoginPageObject.Password.sendKeys(prop.getProperty("password"));
		LoginPageObject.SubmitButton.click();
		log.info("Clicked the Login Button");
		String ActualPageTitle=driver.getTitle();
		log.info("Page Title is : "+ActualPageTitle);
		
		String ExpectedPageTitle= prop.getProperty("DashboardLoginPageTitle");
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(ActualPageTitle, ExpectedPageTitle);
		log.info("Login test case is successful");
	}


}
