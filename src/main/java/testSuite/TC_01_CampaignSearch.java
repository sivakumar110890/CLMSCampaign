package testSuite;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import commonFunctions.commonFuntion;
import junit.framework.Assert;
import pageObject.TC_01_CampaignSearchPageObject;

public class TC_01_CampaignSearch extends commonFuntion{
	static Logger log = Logger.getLogger(TC_01_CampaignSearch.class);

	public void NavigationtoCampaignSearch() throws InterruptedException {
		PageFactory.initElements(driver, TC_01_CampaignSearchPageObject.class);
		Thread.sleep(5000);
		TC_01_CampaignSearchPageObject.ConfigurationManagerButton.click();
		TC_01_CampaignSearchPageObject.CustomerContactButton.click();
		TC_01_CampaignSearchPageObject.CampaignsButtonFromSideBar.click();

		Select CampaignCode = new Select(TC_01_CampaignSearchPageObject.SelectCampaignCode_1);
		CampaignCode.selectByVisibleText("Campaign Code");
		Select CampaignName=new Select(TC_01_CampaignSearchPageObject.SelectCampaignCode_2);
		CampaignName.selectByVisibleText("Campaign Name");
		Select CampaignStatus=new Select(TC_01_CampaignSearchPageObject.SelectStatus);
		CampaignStatus.selectByVisibleText("Running");


		TC_01_CampaignSearchPageObject.InputFieldCampaignName_1.sendKeys(prop.getProperty("CampaignCode"));
		log.info("Campaign Code entered is : "+prop.getProperty("CampaignCode"));
		TC_01_CampaignSearchPageObject.InputFieldCampaignName_2.sendKeys(prop.getProperty("CampaignNameForSearch"));
		log.info("Campaign Name entered is : "+prop.getProperty("CampaignNameForSearch"));
		TC_01_CampaignSearchPageObject.SearchButtonClick.click();
		log.info("campaign search button is clicked");
		
		String ExpectedSearchResultsCamCode = prop.getProperty("CampaignCode");
		String ActualSearchResultsCamCode=TC_01_CampaignSearchPageObject.CampaignCodeFromSearchResults.getText();
	
		Assert.assertEquals(ExpectedSearchResultsCamCode,ActualSearchResultsCamCode);{
			log.info("Campaign code results are came up and test is success");
		}
	
	
	}

	@Test
	public void CampaignSearchFunction() throws InterruptedException {
		log.info("NavigationtoCampaignSearch Test case execution begin");
		NavigationtoCampaignSearch();
		log.info("NavigationtoCampaignSearch Test case execution completed");

	}
}
