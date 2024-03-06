package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {

	public static void main(String[] args) throws InterruptedException 
	{
		String givenUrl="https://www.redbus.in/";
		ChromeOptions ch_options = new ChromeOptions();
	      ch_options.addArguments("--disable-notifications");
		 WebDriver driver=new ChromeDriver(ch_options); 
	        Thread.sleep(3000);
	        driver.manage().window().maximize();
	        driver.navigate().to("https://www.redbus.in/");
	        Thread.sleep(2000);
	        String currentUrl= driver.getCurrentUrl();
	        if(givenUrl.equalsIgnoreCase(currentUrl))
	        {
	        	System.out.println("you are in Redbus page");
	        	Thread.sleep(1000);
	        	WebElement from = driver.findElement(By.xpath("//div[@class='sc-ifAKCX gLwVlD']/div/input"));
	            Thread.sleep(1000);
	        	from.sendKeys("Delhi");
	        Thread.sleep(1000);
	        WebElement s = driver.findElement(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']"));
	        	s.click();
	         WebElement to = driver.findElement(By.id("dest"));
	        	to.sendKeys("lucknow");
	        	WebElement clickTo = driver.findElement(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']/li"));
	        	clickTo.click();
	        	
	        	
	        }
	        else
	        	System.out.println("you are not in Redbus page");
	        
	}

}
