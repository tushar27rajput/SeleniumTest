package swd1;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autoswd29 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\swd\\chromedriver.exe");
		WebDriver driver8=new ChromeDriver();
		System.out.println("Test Start");
		
		//launch Web-site
		
		driver8.get("https://semantic-ui.com/modules/dropdown.html");
		driver8.manage().window().maximize();
		Thread.sleep(5000);
		
		//Click on Multi-Select Drop-down (<div Tag>)
		
		WebElement e_1=driver8.findElement(By.xpath("//*[@class='ui fluid dropdown selection multiple']"));
		Actions a=new Actions(driver8);
		a.click(e_1).build().perform();
		Thread.sleep(5000);
		
		//Collect all items in that Dropdowns
		List<WebElement> li=driver8.findElements(By.xpath("//*[@class='menu transition visible']/div"));
		System.out.println("All items count is :"+li.size());
		
		//Displays all Items 
		for(int i=0;i<li.size();i++)
		{
			System.out.println(li.get(i).getText());
		}
		
		//Select required items
		
		a.sendKeys("a").build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();
		a.sendKeys("h").build().perform();
		Thread.sleep(5000);
		a.sendKeys("i").build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ESCAPE).build().perform();
		Thread.sleep(5000);
		
		//Get Count of Selected items 
		List<WebElement> sil=driver8.findElements(By.xpath("//*[@class='ui fluid dropdown selection multiple upward']/child::a"));
		System.out.println("Selected items Counts is :"+sil.size());
		for(int r=0;r<sil.size();r++)
		{
			System.out.println(sil.get(r).getText());
		}
		
		
		//DSelect 1st item 
		
		driver8.findElement(By.xpath("//*[@class='ui fluid dropdown selection multiple upward']/child::a[1]/child::*")).click();
		Thread.sleep(5000);
		
		//Close WebSite
		driver8.close();
		
		System.out.println("Test End");
		
	}

}
