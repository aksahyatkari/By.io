package Browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOver {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		// Launch chrome browser
				WebDriverManager.chromedriver().setup(); 
				
				//create object
				WebDriver driver = new ChromeDriver();
				
				// max window
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				//open url
			 driver.get("http://www.ebay.in");
			 
			 WebElement element = driver.findElement(By.linkText("Shipping & Payments"));
			 Actions act = new Actions(driver);
			 
			 act.moveToElement(element); // moveToElement() mouse over action 
	}

}
