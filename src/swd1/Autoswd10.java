package swd1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoswd10
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\swd\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		System.out.println("Test Start");
		driver.get("http://site24.way2sms.com/content/index.html");
		//driver.findElement(By.name("username")).sendKeys("9579778909");
		driver.switchTo().activeElement().sendKeys("9579778909");
		driver.findElement(By.id("loginBTN")).click();
		String x=driver.switchTo().alert().getText();
		System.out.println(x);
		driver.switchTo().alert().accept();
		driver.close();
		System.out.println("Test End");
	}

}
