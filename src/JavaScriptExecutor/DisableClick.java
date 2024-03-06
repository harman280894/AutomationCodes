package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DisableClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	      WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(30));
	      driver.get("https://www.oracle.com/in/java/technologies/downloads/");
	      Thread.sleep(2000);
	      JavascriptExecutor js=(JavascriptExecutor) driver;
	      WebElement window = driver.findElement(By.xpath("//a[contains(text(),'jdk-8u401-linux-x64.rpm')]"));
	      js.executeScript("arguments[0].scrollIntoView(true);",window);
	      Thread.sleep(2000);
	     String get = window.getText();
	     System.out.println(get);
	     window.click();
	     // wait.until(ExpectedConditions.elementToBeClickable(window)).click();
	}

	}


