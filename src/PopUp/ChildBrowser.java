package PopUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demowebshop.tricentis.com/");
        Actions act=new Actions(driver);
        act.keyDown(Keys.PAGE_DOWN).keyDown(Keys.PAGE_DOWN).build().perform();
        Thread.sleep(1000);
        driver.findElement(By.linkText("Facebook")).click();
        Thread.sleep(3000);
        String parent = driver.getWindowHandle();
        Set<String> Ecommerce_page = driver.getWindowHandles();
        Ecommerce_page.remove(parent);
        Thread.sleep(5000);
        for (String str : Ecommerce_page)
        {
        	 Thread.sleep(5000);
			driver.switchTo().window(str);
			 Thread.sleep(2000);
			driver.findElement(By.id(":rb:")).sendKeys("Harman");
		}
	}

}
