package Practice_Sel_Set1;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.youtube.com/");
		 driver.manage().window().maximize();
		 
		 Thread.sleep(2000);
		 WebElement searchbar = driver.findElementById("search");
		 searchbar.sendKeys("Cyanchicken1");
		 WebElement searchbutton = driver.findElementById("search-icon-legacy");
		 searchbutton.click();
		 Thread.sleep(1000);
		 WebElement vedio = driver.findElementByXPath("//span[text()='Cyanchicken 1']");
		 vedio.click();
		 
		 
		 
		 
		
		 
		 
		 
	}

}
