package Task_TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class PreDefined_Methods 
{
	static WebDriver driver;

    public static void  preConditions1()
    {
   //open the Chrome Browser
   System.out.println("It is executing program in Chrome Browser");
    driver= new ChromeDriver();
    driver.manage().window().maximize();
    }
    public static void  preConditions2()
    {
   //open the edge Browser
   System.out.println("It is executing program in Edge Browser");
    driver= new EdgeDriver();
    driver.manage().window().maximize();
    }
    public static void  preConditions3()
    {
   //open the IE Browser
   System.out.println("It is executing program in IE Browser");
    driver= new InternetExplorerDriver();
    driver.manage().window().maximize();
    }
    public static void postConditions()
    {
   driver.close();
    }
}
