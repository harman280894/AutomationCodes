package Iframe;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class maximizeAllChild {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Compaq/Downloads/MultipleWindow.html");
        Thread.sleep(1000);
        Actions act= new Actions(driver);
        WebElement open = driver.findElement(By.xpath("//input[@type='button']"));
        String parent=driver.getWindowHandle();
        act.click(open).build().perform();
        Thread.sleep(8000);	
      
        Set<String> childwindow = driver.getWindowHandles();
        childwindow.remove(parent);
          for (String st : childwindow) 
          {
        	driver.switchTo().window(st);
		       Thread.sleep(3000);
		    	driver.manage().window().maximize();
		    	Thread.sleep(3000);
		    
	   }
	}

}
