package swd1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Autoswd9
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\swd\\Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Test Start");
		driver.get("http://demo.guru99.com/test/guru99home");
		driver.manage().window().maximize();
		driver.switchTo().frame("a077aa5e");
		System.out.println("We are switch to frame");
		driver.findElement(By.xpath("//*[contains(@src,'Jmeter720.png')]")).click();
		System.out.println("Test End");
		
		
	}

}
