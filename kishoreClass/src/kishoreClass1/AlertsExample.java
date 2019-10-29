package kishoreClass1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/selenium/chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/test/delete_customer.php");
	    driver.manage().window().maximize();
	    WebElement customerIdTextbox = driver.findElementByName("cusid");
	    customerIdTextbox.sendKeys("12345");
	    
	    WebElement submitButton = driver.findElementByName("submit");
	    submitButton.click();
	    
	    Thread.sleep(2000);
	   Alert alert1 = driver.switchTo().alert();
	   alert1.dismiss();
	   /*
	   alert1.accept();
	   
	   Alert alert2 = driver.switchTo().alert();
	   alert2.accept(); */
	   
	    
	    
	    
	    
	    
	}

}
