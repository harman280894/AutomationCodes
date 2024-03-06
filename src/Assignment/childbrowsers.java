package Assignment;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class childbrowsers {

	public static void main(String[] args) throws InterruptedException 
	{      
		String title="Demo Web Shop. Digital downloads";
           WebDriver driver=new ChromeDriver();
           Actions act=new Actions(driver);
           driver.manage().window().maximize();
           driver.navigate().to("https://demowebshop.tricentis.com/");
           
           String given_url="https://demowebshop.tricentis.com/digital-downloads";
           Thread.sleep(2000);
    
          List<WebElement> options = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
          for (WebElement web : options)
          {
        	  act.keyDown(Keys.CONTROL).moveToElement(web).click().build().perform();
        	  Thread.sleep(1000);
        		  
          }
          Set<String> childBrowser = driver.getWindowHandles();
		 
          for (String str : childBrowser) {
    		  driver.switchTo().window(str);
    		 String current_url = driver.getCurrentUrl();
    		  driver.navigate().to(given_url);
    		 String c_title = driver.getTitle();
    		  Thread.sleep(2000);
    		  System.out.println(c_title);
    		  if(title.equalsIgnoreCase(c_title))
    		  {
    			  Thread.sleep(2000);
    			  List<WebElement> add_to_cart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
    		       for (WebElement add : add_to_cart )
    		      {
					add.click();
					Thread.sleep(2000);
				  }
			  }
    		  driver.findElement(By.partialLinkText("Shopping")).click();
    		  Thread.sleep(2000);
    		 break;
    		  }  
		}
	}


