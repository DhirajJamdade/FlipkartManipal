package ManipalTestcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import MANIPALbase.BaseclassFlipkart;
import ManialObjects.HomePageFlipkart;
import ManialObjects.HomePopup;

public class FlipkartTestcases extends BaseclassFlipkart {
             
       public HomePopup obj1;
       public HomePageFlipkart obj2;

       
       WebDriver drivero;
       
       @BeforeMethod
       public void initialprocess() {
       drivero = getDriver();
      obj1 = new HomePopup(drivero);
     obj2 = new HomePageFlipkart(drivero);
       }
       
       @Test
       public void execution() {
    	   obj1.clcikingProcess();
    	   obj2.Navigation2();
       }
}
