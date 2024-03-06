package Task_TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tc_Sign_Up_001 extends PreDefined_Methods implements ShopperStack  {
	 
@Override
public void login_button() throws InterruptedException  {
preConditions1();
String given_url="https://www.shoppersstack.com/";
driver.navigate().to("https://www.shoppersstack.com/");
Thread.sleep(15000);
String current_url=driver.getCurrentUrl();
if(given_url.equalsIgnoreCase(current_url))
{
System.out.println("you are in Correct page");
WebElement login_button = driver.findElement(By.id("loginBtn"));
Thread.sleep(2000);
if(login_button.isDisplayed())
{
System.out.println("Login Button is displayed");
login_button.click();
Thread.sleep(2000);
}
else
System.out.println("Login Button is not displayed");
}
else
System.out.println("you are not in Correct page");
}

@Override
public void shopperStack_login() throws InterruptedException {

}

@Override
public void create_account() throws InterruptedException {

}

@Override
public void signin_link() throws InterruptedException {
// TODO Auto-generated method stub

}

@Override
public void cursor_on_signin() throws InterruptedException {
	// TODO Auto-generated method stub
	
}

@Override
public void Click_Signin() throws InterruptedException {
	// TODO Auto-generated method stub
	
}

@Override
public void colour_SignIn() throws InterruptedException {
	// TODO Auto-generated method stub
	
}

@Override
public void first_name_mandatory() throws InterruptedException {
	// TODO Auto-generated method stub
	
}

@Override
public void first_name_enabled() throws InterruptedException {
	// TODO Auto-generated method stub
	
}

@Override
public void first_name_Asterisk() throws InterruptedException {
	// TODO Auto-generated method stub
	
}


}
