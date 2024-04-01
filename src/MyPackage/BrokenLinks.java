package MyPackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumsetup\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		int brokenLinks = 0;
		
		for(WebElement element:links)
		{
			String url=element.getAttribute("href");
			if(url==null||url.isEmpty())
			{
				System.out.println("Url is empty");
				continue;
			}
			
			URL link=new URL(url);
			try {
				HttpURLConnection httpco=(HttpURLConnection)link.openConnection();
				httpco.connect();
				
				if(httpco.getResponseCode()>=400)
				{
					System.out.println(httpco.getResponseCode()+url+"  is"+" Broken link");
					brokenLinks++;
				}
				else
				{
					System.out.println(httpco.getResponseCode()+url+  "is" + "validlink");
				}

			}catch(Exception e) {
		
			}
			
		}
		
		
		System.out.println("Number of brokelinks" +brokenLinks);
	}

}
