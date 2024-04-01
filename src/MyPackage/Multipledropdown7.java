package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multipledropdown7 { //bootstamp dropdown

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumsetup\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		//product type
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		List<WebElement> drplist=driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));	
		System.out.println(drplist.size());
	
		for(WebElement ptye:drplist)
		{
			if(ptye.getText().equals("Accounts")) {
				ptye.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//div[@class='drp2']//div[@class='dropdown']")).click();
		List<WebElement> drproduct=driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		System.out.println(drproduct.size());
		
		for (WebElement ptype:drproduct)
		{
			if(ptype.getText().equals("Savings Accounts")) {
				ptype.click();
				break;
			}
		}
		
	}
	
	
	

}
