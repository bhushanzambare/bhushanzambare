package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginLogoutWithHomePageValidationWithSleep {

	public static void main(String[] args) throws InterruptedException {
		
		String driverPath = System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		//step1: set driver executable path by using System.setProperty(String key,String value)
		
		System.setProperty("webdriver.chrome.driver",driverPath);
		//step2: creat an instance of chrome browser
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		String expectedTitle="actiTIME - Login";
		String actualTitle=driver.getTitle();//0-30
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("login page opened sucessfully...");
			
		}else {
			System.out.println("Either Login Page not opened or page title got changed");
			
		}
		//identify the required element from the UI and perform required action 0-30
		driver.findElement(By.id("username")).sendKeys("admin");
		//identify the required element from the UI and perform required action 0-30
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//identify yje required element from the UI and perform reqquired action
		driver.findElement(By.id("loginButton")).click();//0-30
		
		//explicit wait -- hard coded wait
		Thread.sleep(2000);
		String actualHomePageTitle=driver.getTitle();//0-30
		System.out.println("Actual HomePage title: "+actualHomePageTitle);
		String expectedHomePageTitle="actiTIME - Enter Time-Track";
		if(actualHomePageTitle.equals(expectedHomePageTitle)) {
			System.out.println("Login is sucessfill and home page title is also varified..");
		}else {
			System.out.println("Either Login is failed or home page title is changed");
		}
		driver.findElement(By.id("logoutLink")).click();
		//close browser 
		driver.close();
		
	}

}
