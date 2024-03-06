package Task_TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public  class Tc_Sign_Up_002 extends Tc_Sign_Up_001 implements ShopperStack {

@Override
public void shopperStack_login() throws InterruptedException
{
login_button();
WebElement shopper_login_page = driver.findElement(By.xpath("//div[@class='MuiFormControl-root']/../h5/strong"));
  if(shopper_login_page.isDisplayed())
  {
  System.out.println("ShopperStack login page is displayed");
  }
  else
  System.out.println("ShopperStack login page is not displayed");
}



}


