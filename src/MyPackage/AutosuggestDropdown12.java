package MyPackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDropdown12 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumsetup\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("selenium");
		List<WebElement> alldrop=driver.findElements(By.xpath("//li[@class='sbct PZPZlf']//span"));
		System.out.println("Size of autosuggestion "+alldrop.size());
		
		for (WebElement list:alldrop) {
			if(list.getText().contains("testing"))
			{
				list.click();
				break;
			}
		}
		
	}

}
