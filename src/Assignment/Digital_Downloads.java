package Assignment;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Digital_Downloads extends BaseClass2{
	public static void main(String[] args) throws InterruptedException 
	{
		String given_url="https://demowebshop.tricentis.com/";
        preCondition();
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
        			List<WebElement> add_Cart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
        			for (WebElement addCart : add_Cart)
        			{
						addCart.click();
						Thread.sleep(3000);
        			}
						driver.findElement(By.xpath("//span[@class='cart-label']")).click();
						WebElement shopping_cart = driver.findElement(By.partialLinkText("Shopping"));
						if(shopping_cart.isDisplayed())
						{
							System.out.println("Shopping cart is displaying");
							WebElement cart_quantity = driver.findElement(By.xpath("//span[@class='cart-qty']"));
							System.out.println(cart_quantity.getText());
							//List<WebElement> numOfProduct = driver.findElements(By.xpath("//td[@class='product']"));
							 
							List<WebElement> unit_price= driver.findElements(By.xpath("//span[@class='product-unit-price']"));
							Thread.sleep(2000);
			
		
				             List<Double> p=new ArrayList<>();
						for (WebElement price : unit_price)
								{
									Thread.sleep(2000);
									String Price_txt =price.getText();								    
									Double d_price=Double.parseDouble(Price_txt);
									p.add(d_price);
							
								}
						double highestPrice=Double.MIN_VALUE;
						for(double price : p)
						{
							if(price> highestPrice)
							{
								highestPrice=price;
							}
						}
		
			            System.out.println("Highest Price in all product : "+highestPrice);
//			            highestPrice=driver.findElement(By.xpath(""));
			            
			            
							
						}
						else
							System.out.println("Shopping cart is not displaying");
							
					}
        		}
        		else
        			System.out.println("You are not in Digital_Downloads page");
        		
        	}
        	else
        		System.out.println("Digital download button is not displayed");
        	
        }
        
        
        
	}


