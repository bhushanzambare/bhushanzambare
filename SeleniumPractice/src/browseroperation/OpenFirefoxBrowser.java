package browseroperation;

import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefoxBrowser {

	public static void main(String[] args) {

		String driverPath1 = "C:\\Javaworkspace\\SeleniumPractice\\executables\\geckodriver.exe ";
		// or
		String driverPath2 = ".\\executables\\geckodriver.exe ";
		// or
		String driverPath3 = System.getProperty("user.dir") + "\\executables\\geckodriver.exe ";

//step1:set driver executable path bu using system.setProperty(String key,String value)
		System.setProperty("webdriver.gecko.driver", driverPath3);
//step2:creat an instance of chrome browser
		FirefoxDriver cdriver = new FirefoxDriver();

	}

}