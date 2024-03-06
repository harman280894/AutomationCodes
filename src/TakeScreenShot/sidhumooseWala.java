package TakeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class sidhumooseWala {

	public static void main(String[] args) throws IOException {
		WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	      driver.get("https://twitter.com/isidhumoosewala?lang=en");
	      WebElement profile = driver.findElement(By.xpath("//div[@data-testid='UserAvatar-Container-iSidhuMooseWala']"));
	      File from = profile.getScreenshotAs(OutputType.FILE);
	      File to = new File("E:\\Selenium\\TakeScreenshot\\sidhumoosewala.png");
	      FileHandler.copy(from, to);
	}

}
