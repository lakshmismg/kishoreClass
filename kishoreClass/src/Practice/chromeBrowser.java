package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class chromeBrowser {

	public static void main(String[] args) {

     

      System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe");
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://www.google.com");
      driver.manage().window().maximize();
      System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getClass());
		
     
      
	}

}
