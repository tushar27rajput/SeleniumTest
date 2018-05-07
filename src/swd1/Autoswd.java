package swd1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Autoswd 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		System.setProperty("webdriver.gecko.driver","E:\\swd\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		System.out.println("Test Start");
		
		driver.get("http://newtours.demoaut.com");
		
		driver.manage().window().maximize();
		
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		driver.findElement(By.name("firstName")).sendKeys("abc");
		
		driver.findElement(By.name("lastName")).sendKeys("abc");
		
		driver.findElement(By.name("phone")).sendKeys("1234567890");
		
		driver.findElement(By.name("userName")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.name("address1")).sendKeys("ABC Nagar");
		
		driver.findElement(By.name("address2")).sendKeys("Near ABC");
		
		driver.findElement(By.name("city")).sendKeys("ABC");
		
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		
		driver.findElement(By.name("postalCode")).sendKeys("123456");
		
		WebElement e=driver.findElement(By.name("country"));
		
		Select s= new Select(e);
		
		s.selectByVisibleText("INDIA");
		
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("123456");
		
		driver.findElement(By.name("confirmPassword")).sendKeys("123456");
		
		driver.findElement(By.name("register")).click();
		
		Thread.sleep(50000);
		
		driver.close();
		
		System.out.println("Test End");
		
		
		

	}

}
