package Robot_class;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fill_data {

	public static void main(String[] args) throws Exception {
		 WebDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://the-internet.herokuapp.com/basic_auth");
	        Thread.sleep(2000);
	       Robot rbt = new Robot();
	       rbt.keyPress(KeyEvent.VK_A);
	       rbt.keyPress(KeyEvent.VK_D);
	       rbt.keyPress(KeyEvent.VK_M);
	       rbt.keyPress(KeyEvent.VK_I);
	       rbt.keyPress(KeyEvent.VK_N);
	       rbt.keyPress(KeyEvent.VK_TAB);
	       Thread.sleep(2000);
	       rbt.keyPress(KeyEvent.VK_A);
	       rbt.keyPress(KeyEvent.VK_D);
	       rbt.keyPress(KeyEvent.VK_M);
	       rbt.keyPress(KeyEvent.VK_I);
	       rbt.keyPress(KeyEvent.VK_N);
	       Thread.sleep(2000);
	       rbt.keyPress(KeyEvent.VK_ENTER);
	       rbt.keyRelease(KeyEvent.VK_TAB);
	       rbt.keyRelease(KeyEvent.VK_ENTER);
	       
	       
	}
	
	

}
