package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pdfUploadInNaukri {

	public static void main(String[] args) throws InterruptedException {
		String given_url="https://www.naukri.com/";
		  WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.naukri.com/");
	        String current_url = driver.getCurrentUrl();
	        Thread.sleep(2000);
	        if(given_url.equalsIgnoreCase(current_url))
	        {
	        	System.out.println("You Are in Naukri.com Welcome page");
	        	WebElement register_button = driver.findElement(By.id("register_Layer"));
	        	if(register_button.isEnabled())
	        	{
	        		System.out.println("register button is enabled");
	        		Thread.sleep(1000);
	        		register_button.click();
	        		Thread.sleep(2000);
	        		driver.findElement(By.id("name")).sendKeys("Harman Preet Singh");
	        		driver.findElement(By.id("email")).sendKeys("harmansaggu28@gmail.com");
	        		driver.findElement(By.id("password")).sendKeys("Harmansaggu@28");
	        		driver.findElement(By.id("mobile")).sendKeys("9582794694");
	        		driver.findElement(By.xpath("//div[@class='radioWrap']/div")).click();
	        		Thread.sleep(2000);
	        		driver.findElement(By.xpath("//input[@class='uploadAction']")).sendKeys("D:\\harmancv.pdf");
	        		Thread.sleep(3000);
	        		driver.findElement(By.xpath("(//div[@class='formField'])[4]/a/i")).click();
	        		Thread.sleep(3000);
	        		driver.findElement(By.xpath("//button[@type='submit']")).click();
	        		Thread.sleep(2000);
	        	}
	        	else
	        	System.out.println("register button is not enabled");
	        	
	        }
	        else
	        	System.out.println("You Are not in Naukri.com Welcome page");
	        
	} 

}
