package kishoreClass1;

import java.util.Set;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Frames {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chrome\\chromedriver.exe");
		
		 ChromeDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.toolsqa.com/");
		 
		 WebElement newbrowserbutton = driver.findElementByXPath("//button[@id='button1']");
		 newbrowserbutton.click();
		 
		 String firstwindowid = driver.getWindowHandle();
		 
		 
               Set<String> allwindowids = driver.getWindowHandles();
           	String secondwindowid = null;
               
               for (String eachwindowid : allwindowids) {
            	               
				   if(!(eachwindowid.equals(firstwindowid)))
						{
							
						secondwindowid = eachwindowid;
			             }
                          
               }
           driver.switchTo().window(secondwindowid);
           driver.manage().window().maximize();
	}
}
