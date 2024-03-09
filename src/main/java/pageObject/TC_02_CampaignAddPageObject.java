package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TC_02_CampaignAddPageObject {
	
	@FindBy(xpath="//button[contains(text(),'Add')]")
	public static WebElement AddButtonClick;
	
	@FindBy(xpath="//input[@cname=\"ID\"]")
	public static WebElement CampaignIdAddInput;
		
	@FindBy(xpath="//input[@cid=\"label\"]")
	public static WebElement CampaignNameInput;
	
	@FindBy(xpath="//select[@cname=\"Campaign Objective\"]")
	public static WebElement CampaignObjectiveSelect;
	
	@FindBy(xpath="//select[@cname=\"Campaign Type\"]")
	public static WebElement CampaignTypeSelect;
	
	@FindBy(xpath="//select[@cname=\"Campaign Owner\"]")
	public static WebElement CampaignOwnerSelect;
	
	@FindBy(xpath="//button[contains(text(),'OK')][@style=\"height:22px;\"]")
	public static WebElement OkButtonClick;
	
	
	
	
}
