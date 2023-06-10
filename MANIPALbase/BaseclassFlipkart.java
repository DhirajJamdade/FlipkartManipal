package MANIPALbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

@Test
public class BaseclassFlipkart {
	public WebDriver getDriver() {
		System.setProperty("webdriver.chrome.driver","C:\\AXIS TRAINING\\GridPractice\\chromedriver.exe");

	    WebDriver drivero = new ChromeDriver(); 
		drivero.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    drivero.get("https://www.flipkart.com/");
		return drivero;
	}
}


