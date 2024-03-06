package Alert_Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Simple_Alert {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
        
        driver.manage().window().maximize();
        driver.navigate().to("https://demowebshop.tricentis.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        Thread.sleep(2000);
         driver.switchTo().alert().accept();
        
        System.out.println("My Script is Successfully Working...........");
	}

}
