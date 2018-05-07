package swd1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoswd33
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\swd\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("Test Start");
		
		driver.get("https://semantic-ui.com/modules/dropdown.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Scroll Page from Top to Bottom 
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		
		Thread.sleep(5000);
		
		//Scroll Page from Bottom to Up
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
	
		Thread.sleep(5000);

		//Scroll to Specific Element 
		WebElement e=driver.findElement(By.xpath("//*[@class='ui fluid dropdown selection multiple']"));
		js.executeScript("arguments[0].scrollIntoView();",e);
	
		System.out.println("Test End");
	}

}
