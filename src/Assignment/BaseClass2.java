package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass2 {
	static WebDriver driver;
	public static void  preCondition()
	  {   
		 driver=new ChromeDriver();
          driver.manage().window().maximize();
	  }
	public static void  postCondition() 
	  {
		  driver.close();
	  }

}
