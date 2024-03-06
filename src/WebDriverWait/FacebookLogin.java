package WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FacebookLogin {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://www.facebook.com/");
        WebElement create_button = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        if(create_button.isDisplayed())
        {
        	System.out.println("Create account button is displayed");
            create_button.click();
            //Providing Explicit wait
           // WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']")));
            driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Harman");
            
        }
        else
        	System.out.println("Create account button is not displayed");
        
	}

}
