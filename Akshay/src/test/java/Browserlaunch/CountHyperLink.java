package Browserlaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountHyperLink {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub

		// browser launch
	    WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
		
	
		//web page launch
		 driver.get("https://www.calculator.net/");
		 
		 //list of elements
		 
		 List <WebElement> linkelements = driver.findElements(By.tagName("a")); // (use import.org.url)
		 
		 System.out.println("total links on web page:" +linkelements.size());
		 for(WebElement el:linkelements)
		 {
			 System.out.println(el.getText());
		 }
		 
		 driver.close();
		
	}

}
