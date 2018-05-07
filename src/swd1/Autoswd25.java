package swd1;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Autoswd25 
{

	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the word to Search:");
		String x=sc.nextLine();
		System.out.println("Enter expected Suggestions:");
		String y=sc.nextLine();
		
		
		System.setProperty("webdriver.gecko.driver", "E:\\swd\\geckodriver.exe");
		WebDriver driver5=new FirefoxDriver();
		driver5.get("http://www.google.com");
		driver5.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement e=driver5.findElement(By.name("q"));
		Actions a=new Actions(driver5);
		a.sendKeys(e,x).build().perform();
		Thread.sleep(5000);
		int c=1;
		while(2>1)
		{
			String z=e.getAttribute("value");
			
			if(z.equals(y))
			{
				System.out.println("Suggestions was Found");
				a.sendKeys(Keys.ENTER).build().perform();
				break;
				
			}
			else
			{
				if(c==10)
				{
					System.out.println("Suggestions was not Found");
					break;
					
				}
				else
				{
					a.sendKeys(Keys.DOWN).build().perform();
					c=c+1;
					Thread.sleep(5000);
					
				}
			}
		}
		Thread.sleep(5000);
		driver5.close();
		

	}

}
