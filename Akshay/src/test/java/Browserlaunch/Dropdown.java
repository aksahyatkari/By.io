package Browserlaunch;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
     //launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\ChromeBrowser\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://www.opencart.com/");
		 // max window
		 driver.manage().window().maximize();
	
		Thread.sleep(2000);
 driver.findElement(By.xpath("(//a[@class='btn btn-black navbar-btn'])[1]")).click();
 WebElement element = driver.findElement(By.id("input-country"));
  
 Select dropdown = new Select(element);
   
  dropdown.deselectByVisibleText("Iceland");
	
	if (dropdown.isMultiple())
	{
		System.out.println("Dropdown is multiple");
	}
	else
	{
		System.out.println("Dropdown is not multiple");
        
 
	}

	
	}


}
