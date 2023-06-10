package ManialObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePageFlipkart {


	public WebDriver drivero;

	public HomePageFlipkart(WebDriver drivero) {
		this.drivero=drivero;
		PageFactory.initElements(drivero,this);
	}
	
	@FindBy (xpath=("//div[text()='SAMSUNG']"))
	public WebElement Samsung;

	@FindBy (xpath=("//div[@title='APPLE']//div[@class='_24_Dny']"))
	public WebElement Apple;


	@FindBy (xpath=("//div[@title='realme']//div[@class='_24_Dny']"))
	public WebElement Realme;
	
	@FindBy (xpath=("//div[@class='_2id1nE']//span[contains(text(),'Clear all')]"))
	public WebElement RemoveFilter;
	
	public void Navigation2()
	{
		Samsung.click();
		Apple.click();
		Realme.click();
		RemoveFilter.click();
	}
	
	

}
