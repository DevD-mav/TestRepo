package seleniumBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Radiobutton {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Selenium\\chromedriver.exe");

	    WebDriver driver = new ChromeDriver();

	    driver.manage().window().maximize();

		              driver.get("http://sites.ecanarys.com/Nopcommercesite");

		              driver.manage().window().maximize();

		              driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		              driver.findElement(By.linkText("Register")).click();

		              WebElement tcCheckbox = driver.findElement(By.id("accept-privacy-policy"));

		              boolean tcCheckIsDisplayed = tcCheckbox.isDisplayed();

		              System.out.println("Is Terms and condition checkbox displayed: "+tcCheckIsDisplayed);

		              boolean tcCheckboxIsEnabled = tcCheckbox.isEnabled();

		              System.out.println("Is Terms and condition checkbox enabled: "+tcCheckboxIsEnabled);

		              boolean tcCheckboxIsSelected = tcCheckbox.isSelected();

		              System.out.println("Default Terms and Condition checkbox status: "+tcCheckboxIsSelected);

		              tcCheckbox.click();

		              boolean tcCheckboxNewStatus = tcCheckbox.isSelected();

		              System.out.println("Terms and Condition checkbox status after perform click() event: "+tcCheckboxNewStatus);

		              driver.quit();

		       }

		}
	


