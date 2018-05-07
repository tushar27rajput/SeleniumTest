package swd1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoswd35
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\swd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Test Start");
		driver.get("https://www.google.co.in");
		//driver.get("https://www.seleniumhq.org/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		//String tool_tip=driver.findElement(By.xpath("//li[@id='menu_download']/a")).getAttribute("title");
		String tool_tip1=driver.findElement(By.xpath("//INPUT[@id='lst-ib']")).getAttribute("title");
		String x=driver.findElement(By.xpath("//*[@class='gsst_a']")).getAttribute("aria-label");
		System.out.println(x);
		System.out.println("Tool Tips is :"+tool_tip1);
		System.out.println("Test End");
		driver.close();

	}

}
