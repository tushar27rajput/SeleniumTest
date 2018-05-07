package swd1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoswd7
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\swd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Test Start");
		
		//driver.get("http://www.gmail.com");
		//driver.findElement(By.name("identifier")).sendKeys("mindsjanfd2");
		//driver.findElement(By.xpath("//*[contains(@class,'CwaK9')]")).click();
		//String x=driver.findElement(By.xpath("//*[contains(@jsname,'B34EJ')]")).getText();
		//System.out.println(x);
		
		//driver.get("https://www.facebook.com");
		//String y=driver.findElement(By.id("email")).getCssValue("font-family");
		//String z=driver.findElement(By.id("u_0_q")).getAttribute("name");
		//System.out.println(z);
		//System.out.println(y);
		
		driver.get("https://www.google.co.in");
		driver.findElement(By.name("q")).sendKeys("jalgaon");
		if(driver.findElement(By.name("q")).isDisplayed())
		{
			System.out.println("Displayed");
		}
		else
		{
			System.out.println("Not Displayed");
		}
		if(driver.findElement(By.name("q")).isEnabled())
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		if(driver.findElement(By.name("q")).isSelected())
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Not Selected");
		}
		Thread.sleep(5000);
		driver.findElement(By.name("q")).clear();
		
		driver.close();
		System.out.println("Test End");
		
		
	}

}
