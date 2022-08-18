package Browserlaunch;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemeTest1 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
      // launch web browser
		WebDriverManager.chromedriver().setup();
	
		// create object
		 WebDriver driver = new ChromeDriver();
		 
		 // wondow max
		 driver.manage().window().maximize();
		  Thread.sleep(2000);
		  
		  // open url 
		  driver.get("https://demoqa.com/upload-download");
		  
		  // find element choose file
		  
		  //driver.findElement(By.xpath("//input[@id='uploadFile'] ")).sendKeys("C:\\Users\\Akshay\\Desktop\\Interview Questions selenium.text");
		  
		  WebElement button = driver.findElement(By.xpath("//input[@id='uploadFile'] "));
		  
		  Actions act = new Actions(driver);
		  act.moveToElement(button).click().perform();
		  
		  Robot rb = new Robot();
		  
		  rb delay(2000);
		  
		  // Copy file clip board
		  StringSelection ss = new StringSelection("C:\\Users\\Akshay\\Desktop\\Interview Questions selenium.text");
	
		  
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		  // perform control + V action to paste file
		    rb.keyPress(KeyEvent.VK_CONTROL);
		    rb.keyPress(KeyEvent.VK_V);

		    
		    rb.keyRelease(KeyEvent.VK_CONTROL);
		    rb.keyRelease(KeyEvent.VK_V);
		    
		    rb.keyPress(KeyEvent.VK_ENTER);
		    
		    rb.keyRelease(KeyEvent.VK_ENTER);
		    
		    

		 
		 
		 
	}

}
