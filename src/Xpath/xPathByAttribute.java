package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPathByAttribute {

	public static void main(String[] args) {
      String givenTitle="Demo Web Shop. Shopping Cart";
		WebDriver driver= new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://demowebshop.tricentis.com/");
	       driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();
	       driver.findElement(By.partialLinkText("Shopping")).click();
	       String currentTitle=driver.getTitle();
	       if(givenTitle.equalsIgnoreCase(currentTitle))
	       {
	    	   System.out.println("i m in shopping cart");
	    	   
	       }
	       else
	    	   System.out.println("i m not in shopping cart");
	       
	       
	}

}
