package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium 
{
   public static void main(String[] args)
   {
	   String given_url="https://demowebshop.tricentis.com/";
	   // Open the Browser
	   WebDriver driver=new ChromeDriver();
	   // Maximize
	   driver.manage().window().maximize();
	   //Enter into DWS
	   driver.navigate().to("https://demowebshop.tricentis.com/");
	   String current_url=driver.getCurrentUrl();
	   if(given_url.equalsIgnoreCase(current_url))
	   {
		   System.out.println("i am in dws page");
		   WebElement element= driver.findElement(By.className("ico-register"));
		   element.click();
		   
	   }
	   else
		   System.out.println("I am not in Dws page");
	
}
}
