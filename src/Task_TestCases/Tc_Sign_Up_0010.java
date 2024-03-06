package Task_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tc_Sign_Up_0010 extends Tc_Sign_Up_003 implements ShopperStack
{
	 public void first_name_Asterisk() throws InterruptedException{
	String given_data="*";
	create_account();
	Thread.sleep(2000);
	WebElement text = driver.findElement(By.xpath("//label[@id=\"First Name-label\"]/span"));
	String current_data = text.getText();
	System.out.println(current_data);
	if(given_data.equalsIgnoreCase(current_data))
	{
		System.out.println("First name text field is mandatory");
	}
	else
		System.out.println("First name text field is not mandatory");
	 }
}
