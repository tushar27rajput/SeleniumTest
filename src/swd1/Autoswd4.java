package swd1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.ui.Select;

public class Autoswd4 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("Enter the Browser Name::");
		
		Scanner sc= new Scanner(System.in);
		
		String x = sc.nextLine();
		
		WebDriver driver=null;
		
		if(x.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","E:\\swd\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(x.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\swd\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else if(x.equals("opera"))
		{
			System.setProperty("webdriver.opera.driver","E:\\swd\\operadriver.exe");
			driver=new OperaDriver();
			
		}
		else
		{
			System.out.println("Wrong Browser");
			System.exit(0);
		}
		System.out.println("Test Start");
		
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("tushar");
		
		driver.findElement(By.name("lastName")).sendKeys("rajput");
		
		driver.findElement(By.name("phone")).sendKeys("9579778909");
		
		driver.findElement(By.name("userName")).sendKeys("tushar.rajput774@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("5A Prem Nagar");
		
		driver.findElement(By.name("address2")).sendKeys("Near Bajrang Bogda");
		
		driver.findElement(By.name("city")).sendKeys("Jalgaon");
		
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		
		driver.findElement(By.name("postalCode")).sendKeys("425001");
		
		WebElement e=driver.findElement(By.name("country"));
		
		Select s= new Select(e);
		
		s.selectByVisibleText("INDIA");
		
		driver.findElement(By.name("email")).sendKeys("tushar.rajput774@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("123456");
		
		driver.findElement(By.name("confirmPassword")).sendKeys("123456");
		
		driver.findElement(By.name("register")).click();
		
		Thread.sleep(5000);
		
		driver.close();
		
		System.out.println("Test End");

	}

}
