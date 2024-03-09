package testSuite;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunctions.commonFuntion;
import pageObject.TC_02_CampaignAddPageObject;


public class TC_02_CampaignAddTestCase extends commonFuntion{

	static Logger log=Logger.getLogger(TC_02_CampaignAddTestCase.class);
	public void CampaignAdd() {
		PageFactory.initElements(driver, TC_02_CampaignAddPageObject.class);
		log.info("============== Campaign Add Test Case is Begin ==============");
		TC_02_CampaignAddPageObject.AddButtonClick.click();
		log.info("Add button is clicked");
		TC_02_CampaignAddPageObject.CampaignIdAddInput.sendKeys(prop.getProperty("CampaignIdAdd"));
		log.info("Campaign ID added : "+prop.getProperty("CampaignIdAdd"));
		TC_02_CampaignAddPageObject.CampaignNameInput.sendKeys(prop.getProperty("CampaignNameAdd"));
		log.info("Campaign name Added : "+prop.getProperty("CampaignNameAdd"));

		Select CampaignNameSelect = new Select (TC_02_CampaignAddPageObject.CampaignObjectiveSelect);
		CampaignNameSelect.selectByVisibleText("public Campaign Group");


		Select CampaignTypeSelect= new Select (TC_02_CampaignAddPageObject.CampaignTypeSelect);
		CampaignTypeSelect.selectByVisibleText("Cross sell - Product");


		Select CampaignOwnerSelect= new Select (TC_02_CampaignAddPageObject.CampaignOwnerSelect);
		CampaignOwnerSelect.selectByVisibleText("Marketing - Sales");


		TC_02_CampaignAddPageObject.OkButtonClick.click();
		log.info("============== Campaign Add Test Case is completed ==============");


	}
	@Test
	public void CampaignAddTest() {
		CampaignAdd();

	}



}
