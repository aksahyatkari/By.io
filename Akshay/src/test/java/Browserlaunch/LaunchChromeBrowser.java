package Browserlaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Akshay\\workspace\\Akshay\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		String title=driver.getTitle();
		System.out.println("Print URL title:" +title);
		
	
	}

}
