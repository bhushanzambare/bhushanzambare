package BrowserOperationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VitigerDemo2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");

		System.out.println("current url " + driver.getCurrentUrl());

		String expectedURL = "https://demo.vtiger.com/vtigercrm/index.php";
		String actualURL = driver.getCurrentUrl();

		if (actualURL.equals(expectedURL)) {
			System.out.println("correct URL SHOW sucessfully...");
		} else {
			System.out.println("Either URL not CORRECT  or page URL got changed");
		}

		WebElement UserName = driver.findElement(By.id("username"));
		UserName.clear();
		UserName.sendKeys("admin");

		WebElement Password = driver.findElement(By.id("password"));
		Password.clear();
		Password.sendKeys("Test@123");

		WebElement Login = driver.findElement(By.className("buttonBlue"));
		Login.click();
		driver.findElement(By.id("inventoryModules")).click();
	}

}
