package swd1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autoswd38
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\swd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Test Start");
		driver.get("https://demos.telerik.com/aspnet-ajax/calendar/overview/defaultcs.aspx");
		WebDriverWait w1=new WebDriverWait(driver,100);
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='rcMainTable']")));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.findElement(By.linkText("10")).click();
		FluentWait w2=new FluentWait(driver).pollingEvery(5,TimeUnit.SECONDS).withTimeout(100,TimeUnit.SECONDS);
		w2.until(ExpectedConditions.invisibilityOfElementLocated(By.className("raDiv")));
		driver.close();
		System.out.println("Test End");
		
		
		
	}

}
