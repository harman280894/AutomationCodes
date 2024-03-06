package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class All_option {

	public static void main(String[] args) throws InterruptedException {
   
		 WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.navigate().to("https://demowebshop.tricentis.com/");
	      
	     List<WebElement> options = driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));
	     for (WebElement web : options) 
	     {
		   web.click();
		   Thread.sleep(2000);
		   driver.navigate().back();
		   }
	}

}
