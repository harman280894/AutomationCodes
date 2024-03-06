package WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShpperStackLogin {

	public static void main(String[] args) 
	{
	   WebDriver driver = new ChromeDriver();
      WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
      driver.manage().window().maximize();
      driver.get("https://www.shoppersstack.com/");
     WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("loginBtn")));
     loginButton.click();
	}

}
