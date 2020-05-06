package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Selenium\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();

	    driver.manage().window().maximize();
		

		driver.get("http://demo.guru99.com/test/guru99home/" );
		driver.manage().window().maximize() ;
		//get the actual value of the title
		String aTitle = driver.getTitle();
		//compare the actual title with the expected title
		if (aTitle.contentEquals(aTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
		WebDriverWait wait = new WebDriverWait(driver, 20);
	WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
		element.click();
	}

}
