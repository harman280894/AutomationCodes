package Task_TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tc_Sign_Up_009 extends Tc_Sign_Up_008 implements ShopperStack
{
	public void first_name_mandatory() throws InterruptedException
	{
		String s[]= {"","preet singh","","9582794694","harmanpreetsingh435@gmail.com","Harman@28","Harman@28"};
		first_name_enabled();
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//form[@class='signup_signupForm__BDlN5']/div/div"));
		int i=0;
		for (WebElement web : options)
		{
			
		}
	}

}
