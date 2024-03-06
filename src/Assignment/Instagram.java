package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Basic.BaseClass1;

public class Instagram extends BaseClass1 {

	public static void main(String[] args) throws InterruptedException
	{
        preCondition1();
        driver.navigate().to("https://www.instagram.com/");
        String given_title="Instagram";
        String current_title=driver.getTitle();
        if(given_title.equalsIgnoreCase(current_title))
        {
        	Thread.sleep(5000);
        	System.out.println("You are in INSTAGRAM login page");
        	driver.findElement(By.xpath("//input[@aria-label='Phone number, username, or email']")).sendKeys("harman.saggu28");
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("//input[@aria-label='Password']")).sendKeys("Neverforget@1984");
        	Thread.sleep(2000);
        	driver.findElement(By.xpath("//div[contains(text(),'Log in')]")).click();
        	Thread.sleep(5000);
        	WebElement info_popup = driver.findElement(By.xpath("//div[contains(text(),'Save your login info?')]"));
        	if(info_popup.isDisplayed())
        	{
        		driver.findElement(By.xpath("//div[contains(text(),'Not now')]")).click();
        		Thread.sleep(10000);
        	}
        	else
        		System.out.println("info page is not displayed");
        	WebElement notification_popup = driver.findElement(By.xpath("//span[contains(text(),'Turn on Notifications')]"));
        	if(notification_popup.isDisplayed())
        	{
        		driver.findElement(By.xpath("//button[contains(text(),'Not Now')]")).click();
        		Thread.sleep(8000);
        	}
        	else
        		System.out.println("Notification page is not displayed");
        	driver.findElement(By.xpath("(//div[@class=\"x1n2onr6\"]/a/div)[8]")).click();
        	Thread.sleep(8000);
        	driver.findElement(By.xpath("(//a[contains(text(),'Edit profile')]/../../../../../ul/li)[3]/a")).click();
        	Thread.sleep(5000);
        	driver.findElement(By.xpath("((//div[@style=\"display: flex; flex-direction: column; padding-bottom: 0px; padding-top: 0px; position: relative;\"])[2]/div/div/div/div/div)[3]")).click();
        	Thread.sleep(5000);
        	driver.findElement(By.xpath("//button[contains(text(),'Unfollow')]")).click();
        	Thread.sleep(5000);
        }
        else
        	System.out.println("You are not in INSTAGRAM login page");
        
        Thread.sleep(4000);
        
	}

}
