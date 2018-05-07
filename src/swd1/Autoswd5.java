package swd1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoswd5 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\swd\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		System.out.println("Test Start");
		driver.manage().window().maximize();
		driver.get("http://site24.way2sms.com/content/index.html?");
		driver.findElement(By.xpath("//*[contains(@src,'android')]")).click();
		ArrayList<String> whs=new ArrayList<String>(driver.getWindowHandles());
		for(int i=0;i<whs.size();i++)
		{
			System.out.println(whs.get(i));
		}
		
		driver.switchTo().window(whs.get(1));
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(whs.get(0));
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("9579778909");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("admin");
		driver.findElement(By.id("loginBTN")).click();
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		System.out.println("Test End");
		

	}

}
