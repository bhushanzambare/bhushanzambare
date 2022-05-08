package browseroperation;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeBrowser {

	public static void main(String[] args) {
		
		String driverPath1="C:\\Javaworkspace\\SeleniumPractice\\executables\\chromedriver.exe ";
		                     //or
		String driverPath2=".\\executables\\chromedriver.exe ";
		                     //or
		String driverPath3=System.getProperty("user.dir")+"\\executables\\chromedriver.exe ";
		
		//step1:set driver executable path bu using system.setProperty(String key,String value)
		System.setProperty("webdriver.chrome.driver",driverPath3);
		//step2:creat an instance of chrome browser
		ChromeDriver cdriver=new ChromeDriver();

	}

}
