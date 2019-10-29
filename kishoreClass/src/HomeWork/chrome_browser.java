package HomeWork;

import org.openqa.selenium.chrome.ChromeDriver;

public class chrome_browser {

	public static void main(String[] args) {

		
		
      System.setProperty ("webdriver.chrome.driver","C:/selenium/chromedriver.exe");
      
      ChromeDriver driver = new ChromeDriver ();
        
		
      driver.get("https://www.google.com/");
    System.out.println(driver.getCurrentUrl());
    		System.out.println(driver.getTitle());
    		//System.out.println(driver.getPageSource());
    		System.out.println(driver.getWindowHandle());
    		
	
	}
	
	
	

}
