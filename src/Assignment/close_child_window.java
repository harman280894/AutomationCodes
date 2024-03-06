package Assignment;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class close_child_window {

	public static void main(String[] args) throws InterruptedException
	{
        WebDriver driver=new ChromeDriver();
        Actions act=new Actions(driver);
        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com/");
        Thread.sleep(2000); 
        
        String parent = driver.getWindowHandle();
       List<WebElement> options = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
       for (WebElement web : options)
       {
     	  act.keyDown(Keys.CONTROL).moveToElement(web).click().build().perform();
     	  Thread.sleep(1000);
     		  
       }
       Set<String> childBrowser = driver.getWindowHandles();
		  childBrowser.remove(parent);
          Thread.sleep(2000);
          
       for (String str : childBrowser)
       {
 		  driver.switchTo().window(str);
 		  driver.close();
 		  Thread.sleep(1000);
		}
	}

}
