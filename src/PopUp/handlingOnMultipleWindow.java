package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingOnMultipleWindow {

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demowebshop.tricentis.com/");
	        String dws="https://demowebshop.tricentis.com/";
	        String facebook="https://www.facebook.com/nopCommerce";
	        String twitter="https://twitter.com/nopCommerce";
	        
	        Actions act=new Actions(driver);
	        act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).build().perform();
	        Thread.sleep(1000);
	        driver.findElement(By.linkText("Facebook")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.linkText("Twitter")).click();
	        Thread.sleep(2000);
	       
	        Set<String> Ecommerce_page = driver.getWindowHandles();
	        for (String str : Ecommerce_page) 
	        {
				driver.switchTo().window(str);
			String current_url = driver.getCurrentUrl();
			if(dws.equalsIgnoreCase(current_url))
			{
				Thread.sleep(3000);
				driver.findElement(By.id("small-searchterms")).sendKeys("harman");
			}
			else if(facebook.equalsIgnoreCase(current_url))
			{
				Thread.sleep(3000);
				driver.findElement(By.id(":rb:")).sendKeys("preet");
				
			}
			else
			{
				Thread.sleep(3000);
				driver.findElement(By.linkText("Create account")).click();
			}
				
			}
	        
	}

}
