package kishoreClass1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtours_demo_uat {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("http://newtours.demoaut.com/mercuryregister.php");
	    driver.manage().window().maximize();
	   
	    
	    WebElement register = driver.findElementByLinkText("REGISTER");
		register.click();
		
		Thread.sleep(10000);
		
		WebElement fn = driver.findElementByName("firstName");
		
		fn.sendKeys("sanju");
		
WebElement ln = driver.findElementByName("lastName");
		
		ln.sendKeys("kat");
WebElement phone = driver.findElementByName("phone");
		
		phone.sendKeys("412-223-2645");
		
WebElement email = driver.findElementByName("userName");
		
		email.sendKeys("abc@gmail.com");
		
		
WebElement Addrs =  driver.findElementByName("address1");
		
		Addrs.sendKeys("2429 cambridge ct");
		
WebElement Addrs2 = driver.findElementByName("address2");
		
		Addrs2.sendKeys("main road");
WebElement city = driver.findElementByName("city");
		
		city.sendKeys("Cranberry Township");
		
WebElement state = driver.findElementByName("state");
		
		state.sendKeys("PA");
		
WebElement zip = driver.findElementByName("postalCode");
		
		zip.sendKeys("12345");
		
WebElement UserName =  driver.findElementById("email");
		
      UserName.sendKeys("abc@gmail.com");
      
      WebElement pwd = driver.findElementByName("password");
		
     pwd.sendKeys("bamboo");   
     
     WebElement confirmPassword = driver.findElementByName("confirmPassword");
		
     confirmPassword.sendKeys("bamboo");
     
     WebElement submit = driver.findElementByName("register");
     submit.click();
     
     Thread.sleep(2000);
     
     WebElement UserNameLable = driver.findElementByXPath("//b[text()=' Note: Your user name is abc@gmail.com.']");
		
	 boolean result= UserNameLable.isDisplayed();   //true/false
	 if(result)
	 {
		System.out.println("Username displayed as expected"); 
	 }
	 else
	 {
		 System.out.println("Username not displayed as expected.");
	 }
	 
	 //driver.close();
     
      
		
		
		
		
		
		
		
	}

}
