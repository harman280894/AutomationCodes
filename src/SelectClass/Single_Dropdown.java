package SelectClass;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Basic.BaseClass1;

public class Single_Dropdown extends BaseClass1
{

	public static void main(String[] args) throws InterruptedException
	{
             preCondition1();
             driver.get("file:///C:/Users/Compaq/Documents/demo_c3b71f6f-781b-4aa9-911c-0ebdcd2d0e79.html");
            WebElement single_level = driver.findElement(By.id("standard_cars"));
            Select sel= new Select(single_level);
      //getOptions methods     
            List<WebElement> option = sel.getOptions();
            Thread.sleep(2000);
            
 // By using For loop          
            for (int i = 0; i < option.size(); i++) {
                 if(sel.isMultiple())
                 {
                	 option.get(i).click(); 
                 }
                 else
                	 System.out.println("it is not multiple");;
				}
//           for (WebElement web : option)
//           {
//			web.click();
//			Thread.sleep(2000);
//		  }
             
          
           
// select By value
//           sel.selectByValue("toy");
//           Thread.sleep(2000);
// selectByVisibleText
//            sel.selectByVisibleText("Ford");
//            Thread.sleep(2000);
// selectByIndex
//            sel.selectByIndex(2);
//            Thread.sleep(2000);

           	}

}
