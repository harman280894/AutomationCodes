package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws InterruptedException 
	{
		  String given_title="Demo Web Shop. Register";
	//open the Browser
           WebDriver driver= new ChromeDriver();
    //Maximize
        driver.manage().window().maximize();
   // into the DWS
        driver.get("https://demowebshop.tricentis.com/");
        
        driver.findElement(By.xpath("//a[@href='/register']")).click();
          String current_title=driver.getTitle();
      if(given_title.equalsIgnoreCase(current_title))
        {
        	System.out.println("i am in Register Page");
     // Select Gender
        	driver.findElement(By.xpath("//input[@id='gender-male']")).click();
        	Thread.sleep(2000);
     // First Name
        	driver.findElement(By.xpath("//input[@class='text-box single-line']")).sendKeys("Harman");
        	Thread.sleep(2000);
     // Last Name
        	driver.findElement(By.xpath("(//input[@class='text-box single-line'])[2]")).sendKeys("Preet Singh");
        	Thread.sleep(2000);
     // Email
        	driver.findElement(By.xpath("(//input[@class='text-box single-line'])[3]")).sendKeys("harman28@gmail.com");
            Thread.sleep(2000);
     // Password
        	driver.findElement(By.xpath("(//input[@class='text-box single-line password'])[1]")).sendKeys("Harman28");
        	Thread.sleep(2000);
     // Confirm Password
        	driver.findElement(By.xpath("(//input[@class='text-box single-line password'])[2]")).sendKeys("Harman28");
        	Thread.sleep(2000);
        	
        }
        else
        {
        	Thread.sleep(3000);
        	driver.manage().window().minimize();
        }
        
        
        
           
	}

}
