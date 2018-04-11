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

public class Autoswd42 
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
		driver.findElement(By.xpath("//div[@aria-label='Message Body']")).sendKeys("just for testing\n thank you");
		driver.findElement(By.xpath("//*[@aria-label='Attach files']")).click();
		//Automate Files Upload
		StringSelection ss=new StringSelection("E:\\Study\\PDF\\bill.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		Thread.sleep(5000);
		Robot r=new Robot();
		if(System.getProperty("os.name").contains("mac"))
				{
					r.keyPress(KeyEvent.VK_META);
					r.keyPress(KeyEvent.VK_V);
					r.keyRelease(KeyEvent.VK_V);
					r.keyRelease(KeyEvent.VK_META);
					Thread.sleep(5000);
				}
		else
		{
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			Thread.sleep(5000);
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		//w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@aria-label,'Uploading attachment:')]/descendant::table/tbody/tr[1]/td[2]/div/div/div/div")));
		//w.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[contains(@aria-label,'Uploading attachment:')]/descendant::table/tbody/tr[1]/td[2]/div/div/div/div")));
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@class='T-I J-J5-Ji aoO T-I-atl L3']")).click();
		//w.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='View message']")));
		//System.out.println(driver.findElement(By.xpath("//span[text()='View message']")).getText());
		driver.findElement(By.xpath("//*[text()='Send']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Your message has been sent')]")));
		String n=driver.findElement(By.xpath("//*[contains(text(),'Your message has been sent')]")).getText();
		System.out.println(n);
		driver.findElement(By.xpath("//*[@aria-label='Account Information']/preceding::*[3]")).click();
		driver.findElement(By.linkText("Sign out")).click();
		driver.close();
	}

}
