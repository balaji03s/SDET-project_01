package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumsetup\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Today's Deals")).click();
		//driver.findElement(By.partialLinkText("Deals")).click();
		
		//How to capture all the links
		List<WebElement> alllinks=driver.findElements(By.tagName("a"));
		System.out.println("Number of links present:"+alllinks.size());
		
		for(int i=0;i<=alllinks.size();i++)
		{
		   System.out.println(alllinks.get(i).getText());
		   System.out.println(alllinks.get(i).getAttribute("href"));
		}
		
		for(WebElement link:alllinks)
		{
			System.out.println(link.getTagName());
			System.out.println(link.getAttribute("href"));
		}
		
		
		}
}
