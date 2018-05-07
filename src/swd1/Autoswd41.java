package swd1;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autoswd41
{

	public static void main(String[] args) throws Exception 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\swd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Test Start");
		driver.get("https://www.gmail.com");
		WebDriverWait w = new WebDriverWait(driver,100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("identifier")));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.findElement(By.name("identifier")).sendKeys("tushar.rajput774@gmail.com");
		driver.findElement(By.id("identifierNext")).click();
		w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.name("password")));
		driver.findElement(By.name("password")).sendKeys("nokia5233ebay");
		driver.findElement(By.xpath("//div[@id='passwordNext']/content[@class='CwaK9']")).click();
		driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
		driver.findElement(By.xpath("//*[@name='to']")).sendKeys("tushar.rajput774@hotmail.com");
		driver.findElement(By.name("subjectbox")).sendKeys("Please check my Resume ..");
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@aria-label='Message Body'][2]")));
		//driver.findElement(By.xpath("//*[@aria-label='Message Body'][2]")).sendKeys("Hello sir /n Good Afternnon /n Thank You");
		driver.findElement(By.xpath("//div[@class='Ar Au']/div[@class='Am Al editable LW-avf']")).sendKeys("Hello sir /n Good Afternnon /n Thank You");
		driver.findElement(By.xpath("//*[@class='a1 aaA aMZ']")).click();
		StringSelection ss=new StringSelection("E:\\Study\\PDF\\bill.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		Robot r =new Robot();
		Thread.sleep(5000);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			Thread.sleep(5000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[contains(@title,'Google Account')]/span"));
		driver.findElement(By.xpath("//div[@id='gb']/div/div/div[2]/div[5]/div/a/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("gb_71")).click();
		//driver.findElement(By.cssSelector("a#gb_71")).click();
		System.out.println("Test End");
		
	}

}
