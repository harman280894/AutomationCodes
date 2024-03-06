package Task_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyInput;
import org.openqa.selenium.interactions.PointerInput;

import Basic.GetText;

public class Tc_Sign_Up_005 extends Tc_Sign_Up_004 implements ShopperStack
{
	public void cursor_on_signin() throws InterruptedException 
	{
		create_account();
		Thread.sleep(2000);
   WebElement Signin_button = driver.findElement(By.id("signIn"));
          if(Signin_button.isEnabled())
             {
	            System.out.println("SignIn link is Displayed");
	            Thread.sleep(2000);
	            Actions act= new Actions(driver);
	            WebElement name = driver.findElement(By.xpath("//div[@class='signup_formCard__LwNTE']/section/a"));
	            act.moveToElement(Signin_button).clickAndHold(Signin_button).perform();
	            String n = name.getText();
	            System.out.println(n);
             }
    	}
	}