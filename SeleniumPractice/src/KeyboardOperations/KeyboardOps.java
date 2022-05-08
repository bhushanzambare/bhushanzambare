package KeyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import utilities.SeleniumUtility;

public class KeyboardOps {

	public static void main(String[] args) {
		
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome","https://www.flipkart.com/");
		//using Escape of Keyboard to avoid login popup
		driver.findElement(By.cssSelector("Body")).sendKeys(Keys.ESCAPE);

	}

}
