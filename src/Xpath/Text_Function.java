package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_Function {
	public static void main(String[] args) {
		
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.facebook.com/");
	WebElement given_button=driver.findElement(By.xpath("//a[text()='Create new account']"));
	
	if(given_button.isDisplayed())
	{
		
	}
	
	}
	
}
