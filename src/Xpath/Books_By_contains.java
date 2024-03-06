package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Books_By_contains {

	public static void main(String[] args) throws InterruptedException 
	{
		String given_title="Demo Web Shop";
      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.navigate().to("https://demowebshop.tricentis.com/");
      String current_title=driver.getTitle();
      if(given_title.equalsIgnoreCase(current_title))
      {
    	  System.out.println("I am in DWS");
    	  WebElement books=driver.findElement(By.xpath("//a[contains(text(),'Books')]"));
    	  Thread.sleep(3000);
    	  if(books.isDisplayed())
    	  {
    		  books.click();
    		  Thread.sleep(3000);
    		  String given_url="https://demowebshop.tricentis.com/books";
    		  String current_url=driver.getCurrentUrl();
    		  if(given_url.equals(current_url))
    		  {
    			  System.out.println("you are in book page");
    			  driver.navigate().back();
    			  Thread.sleep(3000);
    			  WebElement home_page=driver.findElement(By.id("newsletter-subscribe-button"));
    			  if(home_page.isDisplayed())
    			  {
    				  
    				  driver.close();
    			  }
    		  }
    	  }
      }
      
	}

}
