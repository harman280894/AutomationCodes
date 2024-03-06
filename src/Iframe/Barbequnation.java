package Iframe;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Barbequnation {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("file:///C:/Users/Compaq/Downloads/MultipleWindow.html");
        Thread.sleep(1000);
        Actions act= new Actions(driver);
        WebElement open = driver.findElement(By.xpath("//input[@type='button']"));
        String parent=driver.getWindowHandle();
        act.click(open).build().perform();
        Thread.sleep(8000);	
       String given_url="https://www.barbequenation.com/";
        Set<String> childwindow = driver.getWindowHandles();
        childwindow.remove(parent);
          for (String st : childwindow) 
          {
        	driver.switchTo().window(st);
		    String current_url = driver.getCurrentUrl();
		    if(given_url.equalsIgnoreCase(current_url))
		    {
		    	Thread.sleep(2000);
		    	Robot rbt = new Robot();
		    	rbt.keyPress(KeyEvent.VK_TAB);
		    	Thread.sleep(1000);
		    	rbt.keyPress(KeyEvent.VK_ENTER);
		    	Thread.sleep(1000);
		    	rbt.keyRelease(KeyEvent.VK_TAB);
		    	rbt.keyRelease(KeyEvent.VK_ENTER);
		    	Thread.sleep(1000);
		    	driver.close();
		    	Thread.sleep(2000);
		    }
		    else
		    {
		    	Thread.sleep(3000);
		    	driver.manage().window().maximize();
		    	Thread.sleep(1000);
		    }
	}
	}

}
