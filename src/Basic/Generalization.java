package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Generalization
{
    static WebDriver driver;
     
  public static void chrome()
  {
	 driver= new ChromeDriver();
  }
  public static void edge()
  {
	 driver= new EdgeDriver();
  }
  public static void fire()
  {
	 driver= new FirefoxDriver();
  }
  
	public static void main(String[] args) 
	{
       chrome();
       driver.manage().window().maximize();
       driver.navigate().to("https://demowebshop.tricentis.com/");
       driver.close();
	}

}
