package swd1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autoswd37 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "E:\\swd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Test Start");
		driver.get("https://demos.telerik.com/aspnet-ajax/calendar/overview/defaultcs.aspx");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.findElement(By.linkText("10")).click();
		WebDriverWait w=new WebDriverWait(driver,100);
		w.until(ExpectedConditions.invisibilityOfElementLocated(By.className("raDiv")));
		driver.close();
		System.out.println("Test End");
		
	}

}
