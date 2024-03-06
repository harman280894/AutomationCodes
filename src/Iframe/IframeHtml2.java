package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHtml2 {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("file:///C:/Users/Compaq/Downloads/iframe.html");
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        WebElement SearchBox = driver.findElement(By.id("small-searchterms"));
        WebElement searchButton = driver.findElement(By.xpath("//input[@type='submit']"));
        SearchBox.sendKeys("mobile");
        Thread.sleep(1000);
        searchButton.click();
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(2000);
//        driver.switchTo().frame("FR1");
//        SearchBox.sendKeys("laptop");
//        Thread.sleep(1000);
//        searchButton.click();
//        Thread.sleep(3000);
//        driver.navigate().back();
//        Thread.sleep(2000);
        
        
	}

}
