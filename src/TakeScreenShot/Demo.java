package TakeScreenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Demo {

	public static void main(String[] args) throws IOException 
	{
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        TakesScreenshot ts= (TakesScreenshot) driver;
        File from=ts.getScreenshotAs(OutputType.FILE);
        File to=new File("E:\\Selenium\\TakeScreenshot\\dws.png");
        FileHandler.copy(from, to);
	}

}
