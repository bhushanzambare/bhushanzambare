package browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericWayToOpenChromeBrowser {

	public static void main(String[] args) {
		
		String driverPath1="C:\\Javaworkspace\\SeleniumPractice\\executables\\chromedriver.exe";
		                  //or
		String driverPath2=".\\executables\\chromedriver.exe";
		                  //or
		String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe";
		
		//step1:set driver executable path by using sysotem.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver",driverPath3);
		//step2:create an instance of chrome Browser
		WebDriver driver = new ChromeDriver();

	}

}
