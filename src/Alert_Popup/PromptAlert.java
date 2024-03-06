package Alert_Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.automationtesting.in/Alerts.html");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Alert with Textbox")).click();
        driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
        Thread.sleep(2000);
        Alert alt = driver.switchTo().alert();
        alt.sendKeys("Harman");
        alt.accept();
	}

}
