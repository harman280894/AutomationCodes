package Task_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tc_Sign_Up_006 extends Tc_Sign_Up_003 implements ShopperStack

{
	public void Click_Signin() throws InterruptedException 
	{
      create_account();
      WebElement signin_button = driver.findElement(By.id("signIn"));
      if(signin_button.isEnabled())
      {
    	  System.out.println("Signin link is enabled");
    	  signin_button.click();
    	  Thread.sleep(2000);
      }
      else
      System.out.println("Signin link is not enabled");
	}
  }

