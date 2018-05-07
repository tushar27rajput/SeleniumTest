package swd1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoswd20 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "E:\\swd\\geckodriver.exe");
		WebDriver driver1=new FirefoxDriver();
		driver1.get("http://www.gmail.com");
		driver1.findElement(By.xpath("//*[@name='identifier']")).sendKeys("tushar.rajput774@gmail.com");
		Thread.sleep(5000);
		driver1.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		driver1.findElement(By.name("password")).sendKeys("nokia5233ebay");
		Thread.sleep(5000);
		driver1.findElement(By.xpath("//*[text()='Next']")).click();
		Thread.sleep(5000);
		List<WebElement> rl=driver1.findElements(By.xpath("//*[@role='tabpanel'][1]/descendant::table/tbody/tr"));
		Thread.sleep(5000);
		System.out.println(rl.size());
		Thread.sleep(5000);
		List<WebElement> cl=rl.get(10).findElements(By.tagName("td"));
		Thread.sleep(5000);
		cl.get(1).click();
		Thread.sleep(5000);
		
		driver1.findElement(By.xpath("//*[@role='tabpanel'][1]/descendant::table/tbody/tr[3]/td[2]/div")).click();
		Thread.sleep(5000);
		
		driver1.findElement(By.xpath("//*[contains(@title,'Google Account')]/span")).click();
		Thread.sleep(5000);
		driver1.findElement(By.linkText("Sign out")).click();
		Thread.sleep(9000);
		driver1.close();
		
		
		
		
		
		
		
	}

}
