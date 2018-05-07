package swd1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Autoswd8 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\swd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Test Start");
		driver.get("http://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("9579778909");
		driver.findElement(By.name("pass")).sendKeys("1ntel@meetbkc");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(@value,'Log In')]")).submit();
		System.out.println("Test End");
		
	}

}
