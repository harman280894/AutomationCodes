package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Basic.BaseClass1;

public class Facebook_Dropdown extends BaseClass1 {

	public static void main(String[] args) throws InterruptedException {
	   preCondition1();
	   String given_url="https://www.facebook.com/";
	   
       driver.get("https://www.facebook.com/");
       String current_url=driver.getCurrentUrl();
       if(given_url.equalsIgnoreCase(current_url))
       {
    	   WebElement create_account = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
    	   if(create_account.isEnabled())
    	   {
    		   create_account.click();
    		   Thread.sleep(4000);
    		   WebElement signup = driver.findElement(By.linkText("Sign Up"));
    		   if(signup.isDisplayed())
    		   {
    		   driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("Harman");
    		   Thread.sleep(2000);
    		   driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("Preet Singh");
    		   Thread.sleep(2000);
    		   driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9582794694");
    		   Thread.sleep(2000);
    		   driver.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys("Neverforget@1994");
    		   Thread.sleep(2000);
    		   WebElement birthday = driver.findElement(By.id("day"));
    		   Select day= new Select(birthday);
    		   day.selectByVisibleText("28");
    		   Thread.sleep(2000);
    		   WebElement birthday_month = driver.findElement(By.id("month"));
    		   Select month= new Select(birthday_month);
    		   month.selectByVisibleText("Aug");
    		   Thread.sleep(2000);
    		   WebElement birthday_year = driver.findElement(By.id("year"));
    		   Select year= new Select(birthday_year);
    		   year.selectByVisibleText("1995");
    		   Thread.sleep(2000);
    		   WebElement radio_botton = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
    		  radio_botton.click();
    		  if(radio_botton.isEnabled())
    		  {
    			  System.out.println("male radio button is enabled");
    			  WebElement signup_button = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
    			  if(signup_button.isEnabled())
    			  {
    				 signup_button.click();
    			  }
    			  else
    				  System.out.println("signup button is not enabled");
    		  }
    		  else
    			  System.out.println("male radio button is not enabled");
    		   
    		   }
    		   else
    			   System.out.println("Signup page is not Displayed");
    		   
    		 }
    	   else
    		   System.out.println("create account is not enabled");
       }
      
	}

}
