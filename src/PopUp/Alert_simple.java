package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Alert_simple {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
        Actions act=new Actions(driver);
        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(1000);
        act.keyDown(Keys.TAB).keyUp(Keys.TAB).click().build().perform();
	}

}
