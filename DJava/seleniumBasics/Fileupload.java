package seleniumBasics;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fileupload {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Selenium\\chromedriver.exe");

		    WebDriver driver = new ChromeDriver();

		    driver.manage().window().maximize();

		    driver.get("http://tinyupload.com/");
         driver.findElement(By.name("uploaded_file")).click();
         Runtime.getRuntime().exec("C:\\Users\\User\\Desktop\\fileupload.exe");
         Thread.sleep(3000);
	}


	}


