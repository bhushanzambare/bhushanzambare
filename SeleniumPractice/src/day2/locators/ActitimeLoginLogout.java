package day2.locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginLogout {

	public static void main(String[] args) {
		
		String driverPath= System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		//step1: set driver executable path by using system.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver",driverPath);
		//step2:creat an instance of chrome Browser
		WebDriver driver = new ChromeDriver();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
		
		String execeptedTitle="actiTIME - Login";
		String actualTitle=driver.getTitle();//0-30
		if(actualTitle.equals(execeptedTitle)) {
			System.out.println("Login page opened sucessfully...");
		}else {
			System.out.println("Either login page not opened or page title got changed");
			
		}
		//identify the required element from the UI and perform required action 0-30
		driver.findElement(By.id("username")).sendKeys("admin");
		//identify the required element from the UI and perform required action 0-30
		driver.findElement(By.name("pwd")).sendKeys("manager");
		//identify the required element from the UI and perform required action
		driver.findElement(By.id("loginButton")).click(); //0-30
		
		//driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.id("LogoutLink")).click();
		//close browser
		driver.close();

	}

}
