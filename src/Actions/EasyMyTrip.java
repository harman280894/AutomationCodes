package Actions;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EasyMyTrip {

	public static void main(String[] args) throws InterruptedException, AWTException {
		Robot r = new Robot();
		WebDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to("https://www.easemytrip.com/?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gclid=EAIaIQobChMIi63Rk922hAMVihSDAx25bwDWEAAYASAAEgJvv_D_BwE");
	    Thread.sleep(5000);
        
	    
	   
	  
	
	}
	

}
