package Independent_Dependent;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_To_Cart {

	public static void main(String[] args) throws InterruptedException {
//given URL
		 String given_url="https://demowebshop.tricentis.com/25-virtual-gift-card";
//open The Browser
		  WebDriver driver= new ChromeDriver();
//Maximize
	      driver.manage().window().maximize();
//into DWS
	      driver.navigate().to("https://demowebshop.tricentis.com/");
	      Thread.sleep(2000);
//Store the Data in Array
	      String[]s= {"Qspiders","qspiders123@gmail.com","Harman","harman123@gmail.com"};
//click Add to cart button of Gift cart
	      driver.findElement(By.xpath("//a[@href='/25-virtual-gift-card']/../../div[3]/div[2]/input")).click();
	      Thread.sleep(5000);
//Fetch current URL
	      String current_url=driver.getCurrentUrl();
	      System.out.println(current_url);
//Verify the Current Gift cart Page
	      if(given_url.equalsIgnoreCase(current_url))
	      {
	    	  Thread.sleep(2000);
	    	  System.out.println("You are in gift card Page");
//Fill The Details Step by step
	    	  List<WebElement> text_Box = driver.findElements(By.xpath("//div[@class='giftcard']/div/input"));
//Initialize a integer value for update the array
	    	  int i=0;
	    	  for (WebElement fill_text : text_Box)
	    	  {
				fill_text.sendKeys(s[i++]);
				Thread.sleep(2000);
			  }
//fill the message in message Check-box
	    	  driver.findElement(By.id("giftcard_2_Message")).sendKeys("I am lucky one");
//check for Price
	    	  WebElement price_giftcard = driver.findElement(By.xpath("//label[@for='giftcard_2_Message']/../../../div[5]/div/span"));
	          System.out.println(price_giftcard.getText());
//check for Quantity Box
	    	  WebElement quantity = driver.findElement(By.xpath("//input[@value='1']"));
//clear the data which is already present in quantity box
	    	  quantity.clear();
//give the value
	    	  quantity.sendKeys("2");
	    	  Thread.sleep(2000);
//click the add to cart button
	    	  driver.findElement(By.id("add-to-cart-button-2")).click();
	    	  Thread.sleep(5000);
//click the shopping cart button
	    	  driver.findElement(By.linkText("Shopping cart")).click();
	    	  Thread.sleep(3000);
//verify the product name is displayed
	    	 WebElement verify_product = driver.findElement(By.xpath("//a[@class='product-name']"));

	    	  if(verify_product.isDisplayed())
	    	  {
	    		  System.out.println("your product is successfully Added");
	    	      WebElement check_box = driver.findElement(By.xpath("//input[@type='checkbox']"));
//click the select check box
	    	      check_box.click();
	    	      Thread.sleep(1000);
	    	       if(check_box.isSelected())
	    	       {
	    	    	   System.out.println("Check box is selected");
	    	    	   WebElement update_cart = driver.findElement(By.name("updatecart"));
//Verify the update cart is 
	    	    	   if(update_cart.isEnabled())
	    	    	   {
	    	    		   update_cart.click();
	    	    	   }
	    	    	   else
	    	    	   {
	    	    		   System.out.println("update cart is not Enabled");
	    	    		   driver.close();
	    	    	   }  
	    	       }
	    	       else
	    	    	   System.out.println("check box not selected");
	    	  }  
	    	  else
	    		  System.out.println("The product is not there");
	    	  Thread.sleep(2000);
	    	  
	    	  
	      }
	
	      else
	      {
	    	  System.out.println("i am not in gift card page");
	    	  driver.close();
	      }
	      
}

}
