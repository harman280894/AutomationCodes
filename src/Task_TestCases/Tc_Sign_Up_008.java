package Task_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tc_Sign_Up_008 extends Tc_Sign_Up_003 implements ShopperStack
{
	public void first_name_enabled() throws InterruptedException 
	{ 
		create_account();
		Thread.sleep(2000);
		WebElement text_field = driver.findElement(By.id("First Name"));
		
		if(text_field.isEnabled())
		{
			System.out.println("First name text field is Enabled");
		}
		else
			System.out.println("First name text field is not Enabled");
		
	}

}
