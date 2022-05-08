package BrowserOperationAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

                                                                    //Assignment-2
public class AutoFacebook {

	public static void main(String[] args) {

//site www.facebook.com open by using chrome browser,gettitle,pagesource,currentUrl,close;

		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("title" + driver.getTitle());
		String sourceCode = driver.getPageSource();
		System.out.println("pagesource" + sourceCode);
		System.out.println("current url " + driver.getCurrentUrl());
		driver.close();

	}

}
