package browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericWayToOpenAnyBrowser {

	public static void main(String[] args) {
		
		String geckoDriverPath=System.getProperty("user.dir")+"\\executables\\geckodriver.exe ";
		String chromeDriverPath=System.getProperty("user.dir")+"\\executables\\chromedriver.exe ";
		openBrowser(geckoDriverPath,"firefox");
		openBrowser(chromeDriverPath,"chrome");

	}
	static void openBrowser(String driverPath,String browserName) {
		if(browserName.equalsIgnoreCase("chrome")) {
			//step1: set driver excutable path by using System.setProperty(String key,String value)
			System.setProperty("webdriver.chrome.driver",driverPath);
			//step2:creat an instance of chrome browser
			WebDriver driver=new ChromeDriver();
			}else if(browserName.equalsIgnoreCase("firefox")) {
				//step1:set driver executable path by using System.setProperty(String key,String value)
				System.setProperty("webdriver.gecko.driver", driverPath);
				//step2:creat an instance of Firefox Browser
				WebDriver driver=new FirefoxDriver();
			}
	}

}
