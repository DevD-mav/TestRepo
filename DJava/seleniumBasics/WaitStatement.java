package seleniumBasics;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class WaitStatement {
	public void guru99tutorials() throws InterruptedException 
	{
		    
	String eTitle = "http://demo.guru99.com/test/guru99home/";
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Selenium\\chromedriver.exe");

    WebDriver driver = new ChromeDriver();

    driver.manage().window().maximize();
	

	driver.get("eTitle" );
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	driver.quit();
	}
	

}


