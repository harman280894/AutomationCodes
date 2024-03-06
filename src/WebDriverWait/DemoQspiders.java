package WebDriverWait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoQspiders {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	      driver.get("https://demoapps.qspiders.com/");
	      JavascriptExecutor js=(JavascriptExecutor) driver;
	      
	      WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	      driver.findElement(By.xpath("//button[contains(text(),'Quick Start')]")).click();
	     WebElement frames = driver.findElement(By.xpath("//section[contains(text(),'Frames')]"));
	     if(frames.isEnabled())
	     {
	    	 System.out.println("frames is enabled");
	    	 frames.click();
	    	 WebElement iframe = driver.findElement(By.xpath("//section[contains(text(),'iframes')]"));
	    	 iframe.click();
	    	 driver.findElement(By.xpath("//a[contains(text(),'Nested iframe')]")).click();
	    	 Thread.sleep(2000);
	    	 driver.switchTo().frame(0);
	    	 Thread.sleep(2000);
	    	 WebElement iframe2 = driver.findElement(By.xpath("//div[@class='form_container']/iframe"));
	    	 driver.switchTo().frame(iframe2);
	    	WebElement signup_title = driver.findElement(By.xpath("//div[@class='login-container']/h2"));
	    	if(signup_title.isDisplayed())
	    	{
	    	
	    	 WebElement email = driver.findElement(By.id("email"));
	    	 email.sendKeys("harmansaggu1994@gmail.com");
	    	 driver.findElement(By.id("password")).sendKeys("Neverfoget1984");
	    	 driver.findElement(By.id("confirm-password")).sendKeys("Neverfoget1984");
	    	//driver.findElement(By.id("submitButton")).click();
	    	}
	    	else
	    		System.out.println("you are not in 2nd Frame");
	     }
	     else
	    	 System.out.println("frames is not enabled");
	    	 
	}

}
