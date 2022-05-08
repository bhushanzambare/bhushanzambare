package browseroperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		
		//Open Chrome browser
		//step1: executable path
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe" );
		//step2: creat an instance of requried browser
		WebDriver driver=new ChromeDriver();
		//enter google url
		driver.get("https://www.google.com/");
		
		String sourceCode=driver.getPageSource();
		System.out.println("Application source code: "+sourceCode);
		System.out.println("Source code length: "+sourceCode.length());
		
		System.out.println("Application current url: "+driver.getCurrentUrl());
		System.out.println("Application current Title: "+driver.getTitle());
		//close current instance of browser
		driver.close();
		

	}

}
