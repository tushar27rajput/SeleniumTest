package swd1;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autoswd39
{

	public static void main(String[] args) 
	{
		//get value from Keyboard
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Value:");
		String x=sc.nextLine();
		
		//Open Browser
		
		System.setProperty("webdriver.chrome.driver", "E:\\swd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Test Start");
		driver.get("https://angularjs.org");
		WebDriverWait w = new WebDriverWait(driver,100);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@ng-model='yourName']")));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement e=driver.findElement(By.xpath("//*[@ng-model='yourName']"));
		js.executeScript("arguments[0].scrollIntoView();", e);
		driver.findElement(By.xpath("//*[@ng-model='yourName']")).sendKeys(x);
		String y = driver.findElement(By.xpath("//*[contains(text(),'we build this app')][1]/preceding::*[1]")).getText();
		if(y.contains(x))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		//driver.close();
		
		System.out.println("Test End");
		
		
	}

}
