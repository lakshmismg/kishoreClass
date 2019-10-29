package kishoreClass1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;


public class LearnFrames {
	 
	public static void main(String[] args) {
			
	
		
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe"); 
			ChromeDriver driver = new ChromeDriver(); //launching Chrome Driver
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //waits
		    driver.get("http://demo.guru99.com/test/guru99home/");  //launching guru99 page with frames
		    driver.manage().window().maximize(); //maximising screen
		    
		    
	}
	
	
}
	
	

