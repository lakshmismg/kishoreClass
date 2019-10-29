package naveenCodeTestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpCode {
WebDriver driver;
@Test
	public void popUpCode()
	{
		System.setProperty("WebDriver.chrome.driver", "\"C:\\\\Selenium\\\\chrome\\\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	     System.out.println(driver.getTitle());
	     WebElement gmailButton = driver.findElement(By.xpath("//a[text()='Gmail']"));
	     gmailButton.click();
	     
	
		
	}
	
	
	
}
