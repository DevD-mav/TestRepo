package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
	 
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Selenium\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();

	    driver.manage().window().maximize();

	    driver.get("http://demo.guru99.com/test/newtours/register.php ");

         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.switchTo().frame("videoContainerDiv");
	    driver.findElement(By.id("flow_close_btn_iframe]")).click();
	    //driver.findElement(By.xpath("//table/tbody/tr[11]/td[2]/select")).click();
	    
		Select drpCountry = new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("AUSTRALIA");
	    
	}

}
