package MyPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutocompleteDropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumsetup\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://twoplugs.com/");
		driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
		driver.manage().window().maximize();
		
		WebElement search=driver.findElement(By.xpath("//input[@id='autocomplete']"));
		search.clear();	
		search.sendKeys("Toronto");
		String text;
		do
		{
			search.sendKeys(Keys.ARROW_DOWN);
			text=search.getAttribute("value");
			if(text.equals("Toronto,ON,Canada"))
			{
				search.sendKeys(Keys.ENTER);
				break;
			}
			
		}while (!text.isEmpty());
	}

}
