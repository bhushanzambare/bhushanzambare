package BrowserOperationAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoactitime {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("current url "+driver.getCurrentUrl());
		
		String expectedURL = "https://demo.actitime.com/login.do";
		String actualURL = driver.getCurrentUrl();

		if (actualURL.equals(expectedURL)) {
			System.out.println("correct URL SHOW sucessfully...");
		} else {
			System.out.println("Either URL not CORRECT  or page URL got changed");
		}
				System.out.println("title"+driver.getTitle());
				String expectedTitle1 = "actiTIME - Login";
				String actualTitle2 = driver.getTitle();
				System.out.println("length " + driver.getTitle().length());
				
				if (actualTitle2.equals(expectedTitle1)) {
					System.out.println("Login page opened sucessfully...");
				} else {
					System.out.println("Either login page not opened or page title got changed");
				}
				// loginButton
				// identify the required element from the UI
				WebElement UserName = driver.findElement(By.id("username"));
				UserName.sendKeys("admin");
				// UserName.clear();
				// UserName.sendKeys("admin");

				WebElement PasswordName = driver.findElement(By.name("pwd"));
				PasswordName.sendKeys("manager");
				// UserName.clear();
				// PasswordName.sendKeys("manager");

				WebElement LoginButton =driver.findElement(By.id("loginButton"));
				//LoginButton.click();

			//	driver.close();	
		}
}
