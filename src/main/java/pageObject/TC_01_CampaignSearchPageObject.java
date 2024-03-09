package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TC_01_CampaignSearchPageObject {

	@FindBy(xpath="//ul[@id=\"sidebarMenu\"]/li/a[contains(text(),'Configuration Manager')]")
	public static WebElement ConfigurationManagerButton;

	@FindBy(xpath="//a[contains(text(),'Customer Contact')]")
	public static WebElement CustomerContactButton;

	@FindBy(xpath="//a[@code=\"campaign/search\"][contains(text(),'Campaigns')]")
	public static WebElement CampaignsButtonFromSideBar;

	@FindBy(id="Search_Campaigns_search1_val")
	public static WebElement InputFieldCampaignName_1;

	@FindBy(id="Search_Campaigns_search2_val")
	public static WebElement InputFieldCampaignName_2;

	@FindBy(id="search1")
	public static WebElement SelectCampaignCode_1;

	@FindBy(id="search2")
	public static WebElement SelectCampaignCode_2;

	@FindBy(id="status")
	public static WebElement SelectStatus;

	@FindBy(xpath="//button[contains(text(),'Search')]")
	public static WebElement SearchButtonClick;

	@FindBy(xpath="//div[@class=\"yui-dt-col-_0 yui-dt-col-0 yui-dt-liner yui-dt-sortable yui-dt-resizeable\"]")
	public static WebElement CampaignCodeFromSearchResults;



}
