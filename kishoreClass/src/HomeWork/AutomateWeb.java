package HomeWork;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateWeb {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/selenium/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("http://www.newtours.demoaut.com/");
	    driver.manage().window().maximize();
	    System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			System.out.println(driver.getClass());
			
			WebElement UserNameTextBox = driver.findElementByName("userName");
			UserNameTextBox.sendKeys("abc@gmail.com");
			WebElement PassWordTextBox = driver.findElementByName("password");
			
			PassWordTextBox.sendKeys("bamboo");
			WebElement signin = driver.findElementByName("login");
			
			signin.click();
			Thread.sleep(2000);
			
			
			
			
			
			
			
			
			
			
			
			
			
	}

}
