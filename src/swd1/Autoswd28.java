package swd1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Autoswd28
{

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\swd\\chromedriver.exe");
		WebDriver driver7=new ChromeDriver();
		System.out.println("Test Start");
		
		//lunch Website
		driver7.get("https://semantic-ui.com/modules/dropdown.html");
		driver7.manage().window().maximize();
		Thread.sleep(5000);
		
		//Automate Single Select Dropdown (<div> tag)
		
		WebElement e=driver7.findElement(By.xpath("//*[@class='ui dropdown selection'][1]"));
		Actions a=new Actions(driver7);
		a.click(e).build().perform();
		Thread.sleep(5000);
		
		//To Select Gender category as Male
		
		a.sendKeys("m").build().perform();
		Thread.sleep(5000);
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);

		//Close Site
		driver7.close();
		System.out.println("Test End");
	}

}
