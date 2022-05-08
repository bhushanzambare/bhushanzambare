package KeyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utilities.SeleniumUtility;

public class KeyboardOp3 {

	public static void main(String[] args) {
	
		SeleniumUtility s1=new SeleniumUtility();
		WebDriver driver=s1.setUp("chrome","http://demo.automationtesting.in/Register.html");
		//identify first name input field
		WebElement username = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		//type first name as admin and use ctrl+a
		username.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"));
		//in first name field usectrl+c
		username.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		//in last name field use ctrl+v
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));

	}

}
