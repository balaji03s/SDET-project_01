package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClass7 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumsetup\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.opencart.com/");
		driver.findElement(By.xpath("//a[@class='btn btn-black navbar-btn']")).click();
		WebElement drpdon=driver.findElement(By.id("input-country"));
		Select sc =new Select(drpdon);
		sc.selectByVisibleText("India");
		sc.selectByValue("10"); //Argentina
		sc.selectByIndex(12);  //Australia
		
		//without using method
		List<WebElement> alloption=sc.getOptions();
		for(WebElement option:alloption)
		{
			if(option.getText().equals("Cuba"))
			{
				option.click();
				break;
			}
		}
		
	}

}
