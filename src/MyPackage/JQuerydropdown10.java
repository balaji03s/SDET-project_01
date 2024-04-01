package MyPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JQuerydropdown10 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumsetup\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		
		//selectChoicevalue(driver, "choice 1");
		//selectChoicevalue(driver, "choice 2", "choice 2 3", "choice 6", "choice 6 2 1", "choice 6 2 2");
		selectChoicevalue(driver, "all");
	}
	
	
	public static void selectChoicevalue(WebDriver driver, String... value)
	{
		List<WebElement> cholist=driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		if(!value[0].equalsIgnoreCase("all"))
		{
			for(WebElement item:cholist) {
				String text=item.getText();
				
				for(String val:value)
				{
					if(text.equals(val)) {
						item.click();
						break;
					}
				}
			}
		}
		else {
			for(WebElement item:cholist) {
				item.click();
			}
			
		}
	}

}
