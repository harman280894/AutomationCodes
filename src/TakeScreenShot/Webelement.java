package TakeScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("");
	}

}
