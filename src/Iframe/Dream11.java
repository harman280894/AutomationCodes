package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dream11 {

	public static void main(String[] args) throws InterruptedException
	{
		 WebDriver driver=new ChromeDriver(); 
	        driver.manage().window().maximize();
	        driver.navigate().to("https://www.dream11.com/");
	        Thread.sleep(2000);
	        Actions act=new Actions(driver);
	        act.keyDown(Keys.PAGE_DOWN).build().perform();
	        Thread.sleep(2000);
	        //By using index of the frame
	       // driver.switchTo().frame(0);
	        //driver.switchTo().frame("send-sms-iframe");
	        WebElement element = driver.findElement(By.xpath("//div[@class='send_sms_box_inner']/iframe"));
	        driver.switchTo().frame(element);
	        driver.findElement(By.id("regEmail")).sendKeys("9876543210");
	}

}
