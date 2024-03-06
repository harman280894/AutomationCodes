
package Task_TestCases;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;

public class Tc_Sign_Up_007 extends Tc_Sign_Up_005 implements ShopperStack 
{
	public void colour_SignIn() throws InterruptedException
	{
		create_account();;
		WebElement name = driver.findElement(By.xpath("//div[@class='signup_formCard__LwNTE']/section/a"));
		Color initial_color = Color.fromString(name.getCssValue("background-color"));
		Actions act=new Actions(driver);
		//act.moveToElement(name).build().perform();
		
		Color change_color= Color.fromString(name.getCssValue("background-color"));
		if(initial_color != change_color)
		{
			System.out.println("color is changed from blue to yellow");
		}
		else
			System.out.println("color is not changed from blue to yellow");
	}
}
