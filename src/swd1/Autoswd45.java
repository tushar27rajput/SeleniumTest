package swd1;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autoswd45
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\swd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Test Start");
		
		//Launch 
		driver.get("http://site24.way2sms.com/content/index.html?");
		WebDriverWait w = new WebDriverWait(driver,100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		driver.manage().window().maximize();
		
		//Login
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("username")).sendKeys("7972942322");
		driver.findElement(By.name("password")).sendKeys("nokia5233");
		driver.findElement(By.id("loginBTN")).click();
		driver.findElement(By.xpath("//*[@id='sendSMS']/a[1]")).click();
		w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("frame"));
		driver.findElement(By.name("mobile")).sendKeys("7972346628");
		driver.findElement(By.name("message")).sendKeys("Hello Vaibhav Nasik");
		driver.findElement(By.xpath("//*[@class='button br2up']")).click();
		driver.switchTo().defaultContent();
		if(driver.findElement(By.xpath("//*[text()='Install Chrome Plugin']")).isDisplayed())
		{
			driver.findElement(By.xpath("//*[text()='Install Chrome Plugin']")).click();
			Thread.sleep(5000);
			
			Robot r= new Robot();
			for(int i=1;i<=2;i++)
			{
				r.keyPress(KeyEvent.VK_TAB);
				r.keyRelease(KeyEvent.VK_TAB);
				r.delay(5000);
			}
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				r.delay(5000);
				
		}
		driver.switchTo().frame("frame");
		try
		{
			if(driver.findElement(By.xpath("//*[@class='ssms consuki ']/following-sibling::span")).isDisplayed())
			{
				System.out.println("Message Sent Sucessfully");
			
			}
		}	
			
		catch (Exception e)
			{
				System.out.println("Message Not sucessfully");
			}
			
				
		
		driver.switchTo().defaultContent();
		
		//Logout
		driver.findElement(By.xpath("//*[@class='out louti']")).click();
		
		//Close Website
		driver.close();
		System.out.println("Test End");
	}
}

