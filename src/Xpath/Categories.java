package Xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Categories {

	public static void main(String[] args) throws InterruptedException {
      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.navigate().to("https://demowebshop.tricentis.com/");
      List<WebElement> categories = driver.findElements(By.xpath("(//ul[@class='list'])[1]/li/a"));
      for (WebElement category : categories) {
    	  category.click();
    	  Thread.sleep(2000);
    	  driver.navigate().back();
    	  
		
	}
	}

}
