package BrowserOperationAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

                                                                                            //Assignment-3
public class AutoGoogle {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		String sourceCode = driver.getPageSource();
		System.out.println("pagesource" + sourceCode);
		System.out.println("" + driver.getTitle());
		driver.close();
	}

}
