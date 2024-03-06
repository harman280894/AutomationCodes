package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Text {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.navigate().to("https://demowebshop.tricentis.com/");
	     List<WebElement> header_Links = driver.findElements(By.xpath("//div[@class='header-links']/ul/li/a"));
	     for (WebElement link : header_Links)
	     {
			System.out.println(link.getText());

		}
	}

}