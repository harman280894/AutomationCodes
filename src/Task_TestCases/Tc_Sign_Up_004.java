package Task_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tc_Sign_Up_004 extends Tc_Sign_Up_003 implements ShopperStack{

public void signin_link() throws InterruptedException
{
String given_url="https://www.shoppersstack.com/user-signin";
      create_account();
      WebElement signin_button = driver.findElement(By.id("signIn"));
      if(signin_button.isDisplayed())
      {
        System.out.println("SignIn button is Displayed");
        Thread.sleep(1000);
         signin_button.click();
         Thread.sleep(2000);
    String current_url = driver.getCurrentUrl();
    if(given_url.equalsIgnoreCase(current_url))
    {
    System.out.println("you are in signIn link shopperStack login pAGE");
    }
    else
    System.out.println("you are not in signIn link shopperStack login pAGE");
      }
      else
     System.out.println("SignIn button is not  Displayed");  
}

}