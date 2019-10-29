package Practice_Sel_Set1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lingo {

	
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			WebElement SearchTextBox = driver.findElementByName("q");
			SearchTextBox.sendKeys("Lingoloop");
			
	   System.out.println(driver.getCurrentUrl());
		}

	}



