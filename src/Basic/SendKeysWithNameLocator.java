package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysWithNameLocator
{
	public static void main(String[] args) {
		 // Open the Browser
		   WebDriver driver=new ChromeDriver();
		   // Maximize"
		   driver.manage().window().maximize();
		   //Enter into DWS
		   driver.navigate().to("https://demowebshop.tricentis.com/");
//		   driver.findElement(By.id("small-searchterms")).sendKeys("small-searchterms");
//		   driver.findElement(By.linkText("Register")).click();
//		   driver.findElement(By.id("gender-male")).click();
//		   driver.findElement(By.id("FirstName")).sendKeys("Harman");
//		   driver.findElement(By.name("LastName")).sendKeys("Preet Singh");
//		   driver.findElement(By.id("Email")).sendKeys("harmansaggu1999@gmail.com");
//		   driver.findElement(By.name("Password")).sendKeys("123456");
//		   driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
//		   driver.findElement(By.id("register-button")).click();
		   
		   driver.findElement(By.partialLinkText("Shopping")).click();
	}

}
