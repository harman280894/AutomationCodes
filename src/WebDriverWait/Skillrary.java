package WebDriverWait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skillrary {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     
	      driver.get("https://www.skillrary.com/#");
	      String parent = driver.getWindowHandle();
	      driver.findElement(By.xpath("//span[contains(text(),'GEARS')]")).click();
	      driver.findElement(By.xpath("//a[contains(text(),' SkillRary Demo APP')]")).click();
	      Set<String> s = driver.getWindowHandles();
	      s.remove(parent);
	      for (String str : s) {
	    	  driver.switchTo().window(str);
	    	  Thread.sleep(3000);
	    	 WebElement box = driver.findElement(By.xpath("//input[@class='form-control']"));
	    	 JavascriptExecutor js= (JavascriptExecutor) driver;
	    	 
	    	 js.executeScript("arguments[0].value='harman';",box);
		}
	     
	}

}
