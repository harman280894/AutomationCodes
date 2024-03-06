package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException
	{
		String given_url="https://www.facebook.com/";
          WebDriver driver= new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://www.facebook.com/");
          
         String current_url=driver.getCurrentUrl();
         if(given_url.equalsIgnoreCase(current_url))
         {
        	 System.out.println("I am in facebook login page");
        	 Thread.sleep(2000);
        	 driver.findElement(By.id("email")).sendKeys("harmanpreetsingh435@gmail.com");
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Neverforget1984");
        	 Thread.sleep(2000);
        	 driver.findElement(By.xpath("//button[@value='1']")).click();
         }
         else
        	 System.out.println("I am not in facebook login page");
          
	}

}
