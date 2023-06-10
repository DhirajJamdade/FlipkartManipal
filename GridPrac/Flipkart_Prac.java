package GridPrac;


	import java.net.MalformedURLException;
	import java.net.URL;
	import java.util.concurrent.TimeUnit;
	import org.openqa.selenium.Platform;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.remote.DesiredCapabilities;
	import org.openqa.selenium.remote.RemoteWebDriver;
    import org.testng.annotations.AfterMethod;
    import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Parameters;

	public class Flipkart_Prac {
		WebDriver driver;
	    String nodeURL;
	    
	    
	    @Parameters({"Port"})
	    @BeforeMethod()
	    public void setUp(String Port) throws MalformedURLException
	    {           
	        if(Port.equalsIgnoreCase("5555"))
	        {
	            nodeURL = "http://192.168.1.103:4444";
	            System.out.println("Chrome Browser Initiated");
	            DesiredCapabilities capabilities = DesiredCapabilities.chrome();            
	            capabilities.setBrowserName("chrome");
	            capabilities.setPlatform(Platform.WINDOWS);
	            
	            driver = new RemoteWebDriver(new URL("http://192.168.1.103:4444"),capabilities);
	            
	            driver.get("https://www.flipkart.com/");
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        }
	        
	        else
	            if(Port.equalsIgnoreCase("6666"))
	            {
	                nodeURL = "http://192.168.1.103:4444";
	                System.out.println("Edge Browser Initiated");
	                DesiredCapabilities capabilities1 = DesiredCapabilities.edge();
	                capabilities1.setBrowserName("MicrosoftEdge");
	                capabilities1.setPlatform(Platform.WINDOWS);
	                
	                driver = new RemoteWebDriver(new URL("http://192.168.1.103:4444"),capabilities1);   
	                
	                driver.get("https://www.flipkart.com/");
	                driver.manage().window().maximize();
	                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	            }
	       
	    } 
	   /* @AfterMethod
	    public void tearDowns() {
              	driver.quit();
	            System.out.println("Browser Closed");

	            	    }*/
	  }
	
		
