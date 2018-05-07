package swd1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Autoswd22 
{

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver", "E:\\swd\\geckodriver.exe");
		WebDriver driver3=new FirefoxDriver();
		driver3.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver3.manage().window().maximize();
		Thread.sleep(5000);
		driver3.switchTo().frame("iframeResult");
		WebElement e=driver3.findElement(By.name("cars"));
		Select s1=new Select(e);
		Thread.sleep(5000);
		if(s1.isMultiple())
		{
			Actions a=new Actions(driver3);
			a.keyDown(Keys.CONTROL).build().perform();
			a.click(s1.getOptions().get(2)).build().perform();
			a.click(s1.getOptions().get(3)).build().perform();
			a.keyUp(Keys.CONTROL).build().perform();
			Thread.sleep(5000);
			
			
		}
		else
		{
			System.out.println("Not Multi-Select Dropdowns");
		}
		s1.deselectAll();
		s1.deselectByIndex(2);
		s1.deselectByValue("audi");
		s1.deselectByVisibleText("Audi");
		driver3.switchTo().defaultContent();
		Thread.sleep(5000);
		
		driver3.close();
	}

}
