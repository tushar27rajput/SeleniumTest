package swd1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoswd30
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\swd\\chromedriver.exe");
		WebDriver driver8=new ChromeDriver();
		System.out.println("Test Start");
		
		//launch Web-site
		
		driver8.get("https://www.google.com");
		driver8.manage().window().maximize();
		Thread.sleep(5000);
		//WebElement e=driver8.findElement(By.name("btnI"));
		//JavascriptExecutor js=(JavascriptExecutor)driver8;
		//js.executeScript("arguments[0].click();", e);
		JavascriptExecutor js=(JavascriptExecutor)driver8;
		//js.executeScript("document.getElementsByName('btnK')[0].click();");
		WebElement e=driver8.findElement(By.id("lst-ib"));
		js.executeScript("arguments[0].value='tushar';", e);
		Thread.sleep(5000);
		//driver8.navigate().to("https://semantic-ui.com/modules/dropdown.html");
		//driver8.manage().window().maximize();
		js.executeScript("arguments[0].style.border='2px dashed green';", e);
		Thread.sleep(6000);
		driver8.close();
		System.out.println("Test Start");
		
		
		
		

	}

}
