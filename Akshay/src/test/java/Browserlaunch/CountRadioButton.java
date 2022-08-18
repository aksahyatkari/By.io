package Browserlaunch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// launch the web browser
			WebDriverManager.chromedriver().setup();
 //create object
	 
	 WebDriver driver=new ChromeDriver();
	 
	 driver.get("https://www.calculator.net/");
	 
	 List<WebElement> radiobutton=driver.findElements(By.xpath("//input[@type='radio']"));
	 System.out.println("Total Radio Button: " + radiobutton.size());
	 
	}
}
