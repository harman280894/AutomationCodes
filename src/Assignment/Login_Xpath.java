package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Xpath {

	public static void main(String[] args) throws InterruptedException 
	{   
		//Given Title 
		       String given_title="Demo Web Shop. Login";
		//open the Browser
	           WebDriver driver= new ChromeDriver();
	    //Maximize
	           driver.manage().window().maximize();
	   // into the DWS
	           driver.get("https://demowebshop.tricentis.com/");
	   // click login    
	           driver.findElement(By.xpath("//a[@href='/login']")).click();
	   //current Title    
	           String current_title=driver.getTitle();
	      if(given_title.equalsIgnoreCase(current_title))
	        {
	           System.out.println("I am in Login Page");
	   //Email
	           driver.findElement(By.xpath("//input[@autofocus='autofocus']")).sendKeys("harmansaggu28@gmail.com");
	           Thread.sleep(2000);
	   //Password
	           driver.findElement(By.xpath("//input[@class='password']")).sendKeys("harman28");
	           Thread.sleep(2000);
	   //Click RememberMe
	           driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
	           Thread.sleep(2000);
	        }
	        else
	        {
	        	Thread.sleep(3000);
	        	driver.manage().window().minimize();
	        }
	        
	        
	        
	        
	}

}
