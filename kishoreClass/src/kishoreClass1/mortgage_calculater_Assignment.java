package kishoreClass1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class mortgage_calculater_Assignment {
	
		
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chrome\\chromedriver.exe");
	    ChromeDriver driver = new ChromeDriver();
	    driver.get("https://www.mortgagecalculator.org/");
	    driver.manage().window().maximize();
	    System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			System.out.println(driver.getClass());
			
			WebElement homevalueTextBox  = driver.findElementById("homeval");
			
			homevalueTextBox.sendKeys("50000");
			
    WebElement downpaymentTextBox = driver.findElementById("downpayment" );
			          downpaymentTextBox.sendKeys("25000");
          
  /*WebElement loanamount  = driver.findElementById("loanAmt");
                  loanamount.clear();
			          loanamount.sendKeys("25000");*/
			
    WebElement InterestRate = driver.findElementById("intrstsrate");  
                         InterestRate.clear();    
			              InterestRate.sendKeys("2.0");
              
    WebElement LoanTerm = driver.findElementById("loanterm");
                          LoanTerm.clear();
  			              LoanTerm.sendKeys("30");
              
    WebElement startyear = driver.findElementById("start_year");

    startyear.sendKeys("2019");
    
    WebElement startmonthdropdown = driver.findElementByXPath("//select[@name='param[start_month]']");
        
    
    
    //obj.selectByIndex(0);
              
    WebElement pptax = driver.findElementById("pptytax");
                pptax.clear();
  			pptax.sendKeys("2900");
	 WebElement pmi = driver.findElementById("pmi");
	    pmi.clear();
		pmi.sendKeys("0.7");
		
		WebElement hoi = driver.findElementById("hoi");
	    hoi.clear();
		hoi.sendKeys("3000");
		WebElement hoa = driver.findElementById("hoa");
	    hoa.clear();
		hoa.sendKeys("1500");
		
		//select[@name='param[refiorbuy]']
		
		WebElement refi = driver.findElementByXPath("//select[@name='param[refiorbuy]']");
        
	    Select obj3 = new Select(refi);
	    
	    obj3.selectByIndex(1);
	              
WebElement loantype = driver.findElementByXPath("//select[@name='param[milserve]']");
        
	    Select obj1 = new Select(loantype);
	    
	    obj1.selectByIndex(0);	
	    
WebElement creditrating = driver.findElementByXPath("//select[@name='param[credit_rating]']");
        
	    Select obj2 = new Select(creditrating);
	    
	    obj1.selectByIndex(1);
		
		
		
		WebElement caluculate = driver.findElementByName("cal");
		caluculate.click();
		
		Thread.sleep(10000);  //Static Wait
		
		WebElement emiAMountLabel = driver.findElementByXPath("//h3[text()='$2,084.07']");
		
	 boolean result= emiAMountLabel.isDisplayed();   //true/false
	 if(result==false)
	 {
		System.out.println("EMI Amount is displayed as 2084.07 as expected"); 
	 }
	 else
	 {
		 System.out.println("EMI Amount is not displayed as expected.");
	 }
	 
	 driver.close();
		

}
}
