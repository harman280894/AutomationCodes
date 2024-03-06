package Task_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tc_Sign_Up_003 extends Tc_Sign_Up_002 implements ShopperStack {
	public void create_account() throws InterruptedException
	{
		shopperStack_login();
		Thread.sleep(2000);
		WebElement CreateAccount = driver.findElement(By.xpath("//span[contains(text(),'Create')]"));
		WebElement shopper_login = driver.findElement(By.id("vertical-tab-0"));
		Thread.sleep(2000);
		if(shopper_login.isEnabled())
		{
	        if(CreateAccount.isEnabled())
	      {
		   System.out.println("Create Account Button is Enabled");
		   CreateAccount.click();
		   Thread.sleep(2000);
		   WebElement sign_up = driver.findElement(By.xpath("//a[contains(text(),'signup')]"));
	       if(sign_up.isDisplayed())
	       {
	    	System.out.println("Signup icon is Displayed");   
	       }
	       else
	    	   System.out.println("Signup icon is not Displayed"); 
	   }
	   else
	   System.out.println("Create Account Button is not Enabled");
	    }
		else
			System.out.println("shopper login button is not selected");
	}

}




