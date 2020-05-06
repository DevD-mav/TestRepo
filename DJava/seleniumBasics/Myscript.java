package seleniumBasics;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myscript {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Selenium\\chromedriver.exe");

		    WebDriver driver = new ChromeDriver();

		    driver.manage().window().maximize();

		    driver.get("http://tinyupload.com/");
            driver.findElement(By.name("uploaded_file")).click();
            Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\fileupload.exe");
            Thread.sleep(3000);
	}

}
