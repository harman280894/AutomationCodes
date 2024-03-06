package Iframe;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetTitle4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("file:///C:/Users/Compaq/Downloads/MultipleWindow.html");
        Thread.sleep(1000);
        Actions act= new Actions(driver);
        WebElement open = driver.findElement(By.xpath("//input[@type='button']"));
        act.click(open).build().perform();
        Thread.sleep(8000);	
       
        Set<String> childwindow = driver.getWindowHandles();
        int i=1;
        System.out.println("____________TITLES____________________");
          for (String st : childwindow) 
          {
        	driver.switchTo().window(st);
		    Thread.sleep(2000);
		     String title = driver.getTitle();
		    
		     System.out.println(i++ +"=  "+title);
		     Thread.sleep(2000);
	}
	}

}
