package swd1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoswd2 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","E:\\swd\\geckodriver.exe");
		
		WebDriver driver_1 = new FirefoxDriver();
		System.out.println("Test Start");
		
		driver_1.get("http://site21.way2sms.com/content/index.html");
		
		Thread.sleep(5000);
		
		driver_1.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("9579778909");
		
		driver_1.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("admin");
		
		driver_1.findElement(By.id("loginBTN")).click();
		
		Thread.sleep(5000);
		
		System.out.println("Test End");
		
	}

}
