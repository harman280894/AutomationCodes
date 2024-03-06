package WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Blogspot {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
	      WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	      driver.manage().window().maximize();
	      driver.get("https://omayo.blogspot.com/");
	      Actions act = new Actions(driver);
	  
	      act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).build().perform();
	     
	  
	      WebElement button3 = wait.until(ExpectedConditions.elementToBeClickable(By.id("timerButton")));
	      button3.click();
	      Alert alt = driver.switchTo().alert();
	      alt.accept();
	      driver.findElement(By.className("dropbtn")).click();
	      WebElement facebook = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Facebook')]")));
	      facebook.click();
	}

}
