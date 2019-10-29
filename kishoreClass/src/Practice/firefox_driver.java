package Practice;

import org.openqa.selenium.firefox.GeckoDriverInfo;

public class firefox_driver {

	public static void main(String[] args) {

System.setProperty("webdriver.gecko.driver","C:/selenium/geckodriver.exe");
		GeckoDriverInfo driver = new GeckoDriverInfo();
		//driver.get("https://www.google.com");
	      
	      //System.out.println(driver.getCurrentUrl());
			//System.out.println(driver.getTitle());
			//System.out.println(driver.getClass());


	}

}
