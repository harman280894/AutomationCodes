package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.service.DriverFinder;

public class SingleClick {

	public static void main(String[] args) throws InterruptedException {
      
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
	    WebElement right_click = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
	    Actions act=new Actions(driver);
		act.contextClick(right_click).build().perform();
	    WebElement paste = driver.findElement(By.xpath("//span[contains(text(),'Paste')]"));
	    paste.click();
		try {
			System.out.println("pop up is not there");
		} catch (UnhandledAlertException e) 
		{
			System.out.println("pop up is there");
		}

	}

}
