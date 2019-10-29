package rShee;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class chromeBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty ("webdriver.chrome.driver","C://selenium//chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://google.com");
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			//driver.get("http://Yahoo.com");
			//driver.findElement(By.id("uh-search-box")).sendKeys("this is my first code");
			//WebElement element = driver.findElement(By.name("q"));
	        //element.sendKeys("nathan katari");
	        //element.submit();
			//driver.navigate().back();
			//driver.navigate().forward();
		    driver.findElement(By.linkText("Gmail")).click();
		    driver.findElement(By.linkText("Sign in")).click();
		    //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	        //Maximize window
	        driver.manage().window().maximize();
		    driver.findElement(By.id("Email")).sendKeys("xyz@gmail.com");
		    //driver.findElement(ByClassName("email")).sendKeys("lakshmikalluru7@gmail.com"); 
		    //driver.findElement(By.id("email")).sendKeys("lakshmikalluru7@gmail.com");
		    //driver.findElement(By.linkText("Next")).click();
		    //driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click(); 
		    //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    //driver.findElement(By.linkText("Forgot Password")).click();
			
			
			
			//System.out.println(driver.getPageSource());

	}

}
