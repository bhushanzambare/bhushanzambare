package BrowserOperationAssignment;                                        //day-7 Assignment

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class GsmarenaValidation2 {

	public static void main(String[] args) {
		
		
				System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("https://www.gsmarena.com/");
				System.out.println("current url " + driver.getCurrentUrl());

				String expectedTitle = "https://www.gsmarena.com/";
				String actualTitle = driver.getCurrentUrl();

				if (actualTitle.equals(expectedTitle)) {
					System.out.println("correct homepage SHOW sucessfully...");
				} else {
					System.out.println("Either URL not CORRECT  or page URL got changed");
				}
		        List<WebElement> FlipcartMenu = driver.findElements(By.cssSelector("div.brandmenu-v2>ul>li>a"));
				System.out.println("count element is " + FlipcartMenu.size());
				
				for (WebElement option1 : FlipcartMenu) {
					String option = option1.getText();
					System.out.println("Mobile phones name  is:" + option);
					

				}
			}

	}

