package swd1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Autoswd27
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\swd\\geckodriver.exe");
		WebDriver driver6=new FirefoxDriver();
		System.out.println("Test Start");
		driver6.get("https://jqueryui.com/slider");
		driver6.manage().window().maximize();
		Thread.sleep(5000);
		
		//Goto Frame
		driver6.switchTo().frame(0);
		
		//Automate Horizontal Slider
		
		WebElement e1=driver6.findElement(By.xpath("//*[@id='slider']/span"));
		
		int x1=e1.getLocation().getX();
		int y1=e1.getLocation().getY();
		
		Actions a=new Actions(driver6);
		
		//Horizontal Slider from Left to Right 
		
		a.dragAndDropBy(e1, x1+250, y1).build().perform();
		Thread.sleep(5000);
		
		//Horizontal Slider from  Right to Left
		
		a.dragAndDropBy(e1, x1-100, y1).build().perform();
		Thread.sleep(5000);
		
		//Back to Page
		driver6.switchTo().defaultContent();
		
		//Click Link
		driver6.findElement(By.linkText("Vertical slider")).click();
		Thread.sleep(5000);
		
		//GOto Frame
		driver6.switchTo().frame(0);
		
		//Automate Vertical Sliders
		WebElement e2=driver6.findElement(By.xpath("//*[@id='slider-vertical']/span"));
		
		int x2=e2.getLocation().getX();
		int y2=e2.getLocation().getY();
		
		//Vertical  Slider from Top to Bottom
		a.dragAndDropBy(e2, x2, y2+100).build().perform();
		Thread.sleep(5000);
		
		//Vertical  Slider from  Bottom to Up
		a.dragAndDropBy(e2, x2, y2-200).build().perform();
		
		Thread.sleep(5000);

		//Close Site
		driver6.close();
		System.out.println("Test End");


	}

}
