package swd1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Autoswd26
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "E:\\swd\\geckodriver.exe");
		WebDriver driver6=new FirefoxDriver();
		System.out.println("Test Start");
		driver6.get("https://jqueryui.com/droppable");
		driver6.manage().window().maximize();
		Thread.sleep(5000);
		
		//goto Frame
		driver6.switchTo().frame(0);
		
		//Perform Drag & Drop 
		WebElement e1=driver6.findElement(By.id("draggable"));
		WebElement e2=driver6.findElement(By.id("droppable"));
		Thread.sleep(5000);
		Actions a=new Actions(driver6);
		a.dragAndDrop(e1, e2).build().perform();
		Thread.sleep(5000);
		
		//Back to Home Page
		driver6.switchTo().defaultContent();
		Thread.sleep(5000);
		
		//Close Site
		driver6.close();
		System.out.println("Test Start");
		

	}

}
