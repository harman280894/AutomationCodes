package Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		 WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.navigate().to("https://demowebshop.tricentis.com/");
	      WebElement text = driver.findElement(By.xpath("//h2[contains(text(),'Welcome to our store')]"));
	      
	      System.out.println(text.getText());
	      
	}

}
