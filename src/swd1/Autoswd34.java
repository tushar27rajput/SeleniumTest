package swd1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoswd34
{

	public static void main(String[] args) throws Exception
	{
		
		System.setProperty("web driver.chrome.driver", "E:\\swd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Test Start");
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement e=driver.findElement(By.name("q"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('disabled',true);", e);
		
		Thread.sleep(5000);
		
		js.executeScript("arguments[0].removeAttribute('disabled');", e);
		Thread.sleep(5000);
		
		System.out.println("Test End");
	}

}
