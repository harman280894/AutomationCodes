package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Calender_PopUp {

	public static void main(String[] args) throws InterruptedException 
	{ 
		boolean value=true;
		ChromeOptions ch_options = new ChromeOptions();
	      ch_options.addArguments("--disable-notifications");
        WebDriver driver=new ChromeDriver(ch_options); 
        driver.manage().window().maximize();
        driver.navigate().to("https://www.easemytrip.com/");
        Thread.sleep(2000);
         WebElement from = driver.findElement(By.id("FromSector_show"));
         from.click();
         Thread.sleep(1000);
         WebElement f = driver.findElement(By.id("a_FromSector_show"));
        f.sendKeys("DELHI");
        Thread.sleep(1000);
        WebElement autofill = driver.findElement(By.xpath("//div[@id='fromautoFill']/ul/li"));
        autofill.click();
        Thread.sleep(2000);
     WebElement to_search = driver.findElement(By.id("a_Editbox13_show"));
        Thread.sleep(1000);
        to_search.sendKeys("Kanpur");
        Thread.sleep(1000);
         WebElement to = driver.findElement(By.xpath("//div[@id='toautoFill']/ul/li"));
         Thread.sleep(1000);
         to.click();
         Thread.sleep(2000);
          driver.findElement(By.id("fiv_2_27/02/2024")).click();
         Thread.sleep(1000);
         driver.findElement(By.id("divRtnCal")).click();
        Thread.sleep(1000);
        for(;value;)
        {
        	try
        	{
				driver.findElement(By.id("fiv_1_27/05/2024")).click();
				value=false;
				
			} 
        	
        	catch (Exception e) 
        	{
				driver.findElement(By.xpath("//img[@id='img2Nex']")).click();
			}
        }
        }

        

}
