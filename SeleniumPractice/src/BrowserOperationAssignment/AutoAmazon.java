package BrowserOperationAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoAmazon {
                                                                           //Assignment-1
	public static void main(String[] args) {
		
		//site www.reddit.com open by using chrome browser we launch,gettitle,pagesource,currentUrl,close;
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.reddit.com/");
		System.out.println("title"+driver.getTitle());
		String sourceCode = driver.getPageSource();
		System.out.println("pagesource" + sourceCode);
		System.out.println("current url "+driver.getCurrentUrl());
		driver.close();
		
		//site www.amazon.in open by using firefox we launch,gettitle,pagesource,currentUrl,close;
		System.setProperty("webdriver.gecko.driver",".\\executables\\geckodriver.exe" );
		WebDriver driver1=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		System.out.println("title"+driver1.getTitle());
		String sourceCode1 = driver1.getPageSource();
		System.out.println("pagesource" + sourceCode1);
		System.out.println("current url "+driver.getCurrentUrl());
		driver1.close();
		
	}

}
