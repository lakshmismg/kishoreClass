package Practice_Sel_Set1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mortgage_Cal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.mortgagecalculator.org/");
		
		
            System.out.println(driver.getCurrentUrl());
	}

}
