package Presentation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select_class {

	public static void main(String[] args)
	{
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
         driver.navigate().to("https://www.myntra.com/");
         Actions act=new Actions(driver);
         WebElement profile = driver.findElement(By.xpath("//span[contains(text(),'Profile')]"));
         WebElement login = driver.findElement(By.className("desktop-linkButton"));
         act.moveToElement(profile).click(login).build().perform();
         
	}

}
