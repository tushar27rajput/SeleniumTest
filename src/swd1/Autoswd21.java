package swd1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Autoswd21 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.gecko.driver", "E:\\swd\\geckodriver.exe");
		WebDriver driver2=new FirefoxDriver();
		driver2.get("https://www.mercurytravels.co.in");
		
		WebElement e=driver2.findElement(By.name("nights"));
		Select s=new Select(e);
		if(s.isMultiple())
		{
			System.out.println("MultiSelect DropDowns");
		}
		else
		{
			System.out.println("SingleSelect DropDowns");
		}
		Thread.sleep(5000);
		s.selectByVisibleText("39Nights+40Days");
		Thread.sleep(5000);
		s.selectByIndex(4);
		Thread.sleep(5000);
		s.selectByValue("21Nights / 22Days");
		Thread.sleep(5000);	
		int o=s.getOptions().size();
		System.out.println("Count of items in Dropdown is :"+o);
		Thread.sleep(5000);
		for (int i=0;i<o;i++)
		{
			String x=s.getOptions().get(i).getText();
			System.out.println(x);
		}
		Thread.sleep(5000);
		driver2.close();
		
	}

}
