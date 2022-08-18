package Browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragNDrog {

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
	 driver.get("https://dhtmlgoodies.com");
	 
      // find source & target web element
	 
	 WebElement source = driver.findElement(By.id("box6"));// rome
	 WebElement target = driver.findElement(By.id("box106"));// rome
	  Actions act = new Actions(driver);
	  
	  // Drag and drop
        act.dragAndDrop(source,target).perform();	  

	  
	  
	}

}
