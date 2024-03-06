package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Basic.BaseClass1;

public class Digital_downloads2 extends BaseClass1 {

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
    			WebElement display = driver.findElement(By.xpath("//span[contains(text(),'Display')]"));
    			if(display.isDisplayed())
    			{
    				System.out.println("display drop down is displayed");
    				WebElement pagesize = driver.findElement(By.id("products-pagesize"));
    			    Select page= new Select(pagesize);
    			    List<WebElement> list = page.getOptions();
    			    Thread.sleep(2000);
    			    int i=0;
    			    for (WebElement web : list) {
    			    	pagesize = driver.findElement(By.id("products-pagesize"));
    			    	page= new Select(pagesize);
    			    	page.selectByIndex(i++);
    			    	Thread.sleep(2000);
					}
    			    
    			}
    			else
    				System.out.println("display drop down is not displayed");
    				WebElement view = driver.findElement(By.xpath("//span[contains(text(),'View as')]"));
    				if(view.isDisplayed())
    				{
    					System.out.println("View_as drop down is displayed");
    					
    					WebElement viewmode = driver.findElement(By.id("products-viewmode"));
        			    Select viewm=new Select(viewmode);
        			    List<WebElement> vlist = viewm.getOptions();
        			    Thread.sleep(2000);
        			    int j=0;
        			    for (WebElement webv : vlist) {
        			    	viewmode = driver.findElement(By.id("products-viewmode"));
        			    	viewm= new Select(viewmode);
        			    	viewm.selectByIndex(j++);
        			    	Thread.sleep(2000);
    					}
        			    
        			}
        			else
        				System.out.println("View_as drop down is not displayed");

	         }

}
}
    	}
    }