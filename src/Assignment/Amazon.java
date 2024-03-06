package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=6249405596056877540&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9181926&hvtargid=kwd-10573980&hydadcr=14453_2316415");
	
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Redmi 13 pro");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}

}
