package MyPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSortedornot {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumsetup\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://twoplugs.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space()='Live Posting']")).click();
		WebElement drpElement=driver.findElement(By.name("category_id"));
		Select drpselect=new Select(drpElement);
		List<WebElement> options=drpselect.getOptions();
		
		ArrayList original=new ArrayList();
		ArrayList templist=new ArrayList();
		
		for(WebElement option:options)
		{
			original.add(option.getText());
			templist.add(option.getText());
		}
		System.out.println("Original list:" +original);
		System.out.println("tem list:" +templist);
		
		Collections.sort(templist); //sorting
		
		System.out.println("Original list:" +original);
		System.out.println("tem list after sorting:" +templist);
		
		if(original.equals(templist))
		{
			System.out.println("Dropdown sorted");
		}
		else
		{
			System.out.println("Dropdown not sorted");
		}
		
	}

}
