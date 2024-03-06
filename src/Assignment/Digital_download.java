package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Basic.BaseClass1;

public class Digital_download extends BaseClass1 {

	public static void main(String[] args) throws InterruptedException {
       
		String given_url="https://demowebshop.tricentis.com/";
        preCondition1();
        driver.navigate().to("https://demowebshop.tricentis.com/");
        String current_url=driver.getCurrentUrl();
        if(given_url.equalsIgnoreCase(current_url))
        {
        	System.out.println("You are in DWS page");
        	WebElement digit_download = driver.findElement(By.xpath("//a[@href='/digital-downloads']"));
        	if(digit_download.isDisplayed())
        	{
        		System.out.println("Digital download button is displayed");
        		digit_download.click();
        		String given_title="Demo Web Shop. Digital downloads";
        		String current_title = driver.getTitle();
        		if(given_title.equalsIgnoreCase(current_title))
        		{
        			System.out.println("You are in Digital_Downloads page");
        			WebElement order_by = driver.findElement(By.name("products-orderby"));
        			Select sort= new Select(order_by);
        			List<WebElement> sort_by = sort.getOptions();
        			System.out.println(sort_by);
        			Thread.sleep(2000);
        			int i=0;
        			for (WebElement web : sort_by) 
        			{
        				order_by = driver.findElement(By.name("products-orderby"));
        				sort= new Select(order_by);
        				sort.selectByIndex(i++);
						
						Thread.sleep(3000);
					}
        			
	}

}
}
        }
	}