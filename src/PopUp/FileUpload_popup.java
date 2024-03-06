package PopUp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_popup {

	public static void main(String[] args) throws InterruptedException 
	{
		  WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://www.ilovepdf.com/pdf_to_word");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Compaq\\Documents\\Manual Testing QSpider-1.pdf");
	}

}
