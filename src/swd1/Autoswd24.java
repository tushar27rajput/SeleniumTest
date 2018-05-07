package swd1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Autoswd24 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "E:\\swd\\geckodriver.exe");
		WebDriver driver4=new FirefoxDriver();
		driver4.get("http://www.google.com");
		Actions a=new Actions(driver4);
		
		WebElement e=driver4.findElement(By.name("btnK"));
		Thread.sleep(5000);
		a.click(e).build().perform();
		
		//Right Click an Element & Fill an Element--
		WebElement f=driver4.findElement(By.name("q"));
		a.sendKeys(f,"tushar").build().perform();
		Thread.sleep(5000);
		a.contextClick(f).build().perform();
		Thread.sleep(5000);
		
		//Move mouse-point to Element & Double Click an Element
		driver4.navigate().to("http://www.filpkart.com");
		Thread.sleep(6000);
		WebElement g=driver4.findElement(By.xpath("//*[@class='_2AkmmA _29YdH8']"));
		a.doubleClick(g).build().perform();
		Thread.sleep(5000);
		WebElement h=driver4.findElement(By.xpath("//*[text()='Women']"));
		a.moveToElement(h).build().perform();
		Thread.sleep(5000);
		
		
		//Handle Auto-Complete Element
		driver4.navigate().to("http://www.google.com");
		WebElement i=driver4.findElement(By.name("q"));
		a.sendKeys(i,"kalam").build().perform();
		Thread.sleep(5000);
		for(int l=1;l<=4;l++)
		{
			a.sendKeys(Keys.DOWN).build().perform();
			Thread.sleep(5000);
			
		}
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		
		//Search for Required Suggestions in Auto-Complete 
		driver4.close();

	}

}
