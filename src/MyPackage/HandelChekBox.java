package MyPackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelChekBox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "F:\\seleniumsetup\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//select specific test box
		
		//driver.findElement(By.xpath("//input[@id='sunday']")).click();
		
		//select all the check box
		
		List<WebElement> allEle=driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
		System.out.println("Total no.of element" +allEle.size());
		
		/*for (int i=0;i<allEle.size();i++)
		{
			allEle.get(i).click();
		}
		*/
		//select multimple check box by choice
		
		for(WebElement chk:allEle)
		{
			String chkboxname=chk.getAttribute("id");
			if(chkboxname.equals("sunday")||chkboxname.equals("saturday"))
			{
				chk.click();
				
			}
		}
		
	}

}
