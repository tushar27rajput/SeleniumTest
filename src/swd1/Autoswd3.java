package swd1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoswd3
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "E:\\swd\\chromedriver.exe");
		
		WebDriver driver_2 = new ChromeDriver();
		System.out.println("Test Start");
		driver_2.get("https://www.gmail.com");
		driver_2.manage().window().maximize();
		driver_2.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("tushar.rajput774@gmail.com");;
		driver_2.findElement(By.xpath("//*[contains(@class,'CwaK9')]")).click();
		//driver_2.findElement(By.xpath("//*[text()='Next']")).click();
		driver_2.findElement(By.xpath("//*[@type='password']")).sendKeys("nokia5233ebay");
		String str=driver_2.getTitle();
		System.out.println("Title is"+str);
		System.out.println("Test Complete");
		
		
		
		
		

	}

}
