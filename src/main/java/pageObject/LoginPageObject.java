package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObject {
	
	@FindBy(id="uid")
	public static WebElement Username;
	
	@FindBy(id="pwd")
	public static WebElement Password;
	
	@FindBy(id="submit")
	public static WebElement SubmitButton;

}
