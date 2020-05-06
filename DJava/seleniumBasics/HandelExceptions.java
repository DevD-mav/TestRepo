package seleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandelExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Selenium\\chromedriver.exe");

		    WebDriver driver = new ChromeDriver();

		    driver.manage().window().maximize();

		    driver.get("http://demo.guru99.com/test/newtours/register.php");
		    try {
		    	WebDriverWait wait = new WebDriverWait(driver, 10);
		    	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("submit")));
		    	try {
		    	driver.findElement(By.id("submit")).click();
		    	} catch (WebDriverException e) {
		    	char[] exceptional;
				System.out.println("An exceptional case");
		    	}
		    	} catch (TimeoutException e) {
		    	char[] couldn;
				System.out.println("WebDriver couldn’t locate the element");
		    	}
	}

}
