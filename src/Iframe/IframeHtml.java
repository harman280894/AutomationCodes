package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHtml {

	public static void main(String[] args) throws InterruptedException
	{
		 WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("file:///C:/Users/Compaq/Downloads/iframe.html");
	        Thread.sleep(2000);
	        
	        WebElement google_button = driver.findElement(By.xpath("//a[contains(text(),'Google')]"));
	        if(google_button.isEnabled())
	        {
	        	System.out.println("Goggle Button is enabled");
	        	Thread.sleep(1000);
	        	google_button.click();
	        	
	        }
	        else
	        	System.out.println("Goggle Button is not enabled");
	}

}
