package ManialObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePopup {
	public WebDriver drivero;

	public HomePopup(WebDriver drivero) {
		this.drivero=drivero;
		PageFactory.initElements(drivero,this);
	}
	
	@FindBy (xpath=("//img[@alt='Mobiles']"))
	public WebElement Mobile;
	
	@FindBy(xpath = "//button[contains(text(),'✕')]")	
	public WebElement Popup;
	
	public void clcikingProcess() {
		Popup.click();
		Mobile.click();
		
	}
}
