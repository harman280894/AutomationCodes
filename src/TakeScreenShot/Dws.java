package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Dws {

	public static void main(String[] args) throws IOException 
	{
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
       driver.navigate().to("https://demowebshop.tricentis.com/");
       driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
       TakesScreenshot ts= (TakesScreenshot) driver;
       File from = ts.getScreenshotAs(OutputType.FILE);
       File to= new File("E:\\Selenium\\TakeScreenshot\\dwsDigital.png");
       FileHandler.copy(from, to);
    		   
	}

}
