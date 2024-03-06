package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DrawBackOfCssSelector {

	public static void main(String[] args)
	{
       WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://demowebshop.tricentis.com/");
       driver.findElement(By.xpath("/html/body/div[4]/div/div/div[2]/div/ul/li[1]/a")).click();
       
	}

}
