package Browserlaunch;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
 // launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeBrowser\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.brokelink.com");
		   //max window
		   driver.manage().window().maximize();
		   Thread.sleep(2000);
		   
		   // wet for 10sec
		   
		   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   //open url
		   
		   driver.get("http://deadlinkcitycom/");
		   
		   //find hyperlinks
		   
		   List <WebElement> linkList= driver.findElements(By.tagName("a"));
		   int resCode =200;// 2xx response code is valid link
		   int brokenLinkCnt = 0;
		   for(WebElement element:linkList)
		   {
			   String url = element.getAttribute("href");
			   
			   try{ 
				   URL link = new URL(url);
				   
				  
				HttpURLConnection huc = (HttpURLConnection)link.openConnection();
				huc.setRequestMethod("HEAD");
				huc.connect();
				
				resCode = huc.getResponseCode();
				if (resCode >=400)
				{
					System.out.println(url +"broken link.");
				}
			   }
			   catch(Exception e){}
		   }
		   
	}

}
