package swd1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoswd19 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "E:\\swd\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		System.out.println("Test Start");
		//driver.get("http://site21.way2sms.com/jsp/UserRegistration.jsp");
		//driver.get("http://www.facebook.com");
		//driver.get("http://www.gmail.com");
		//driver.get("http://newtours.demoaut.com");
		driver.get("http://toolsqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Get counts all the links Page
		List<WebElement>m=driver.findElements(By.xpath("//a"));
		System.out.println("Number of Links :"+m.size());
		
		//------------------------------------------------
		
		//Get counts all the Elements in Page
		List<WebElement> n=driver.findElements(By.xpath("//*"));
		System.out.println("All the Elementes in Page:"+n.size());
		
		//Frame arival or not in Page
		List<WebElement> o=driver.findElements(By.xpath("//iframe"));
		if(o.size()>0)
		{
			System.out.println("Frames are Available");
		}
		else
		{
			System.out.println("Frames are not Available");
		}
		
		
		List<WebElement> p=driver.findElements(By.xpath("//form"));
		System.out.println("No. of Forms is :"+p.size());
		
		
		//-------------------------------------------------
			//Get Count No. of TextBox in Page
		List<WebElement> q=driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println("No. of Textbox is :"+q.size());
		q.get(1).sendKeys("abc");
		Thread.sleep(5000);
		
		//-------------------------------------------------
			//Get Count No. of RadioButton in Page
		List<WebElement> r=driver.findElements(By.xpath("//input[@type='radio']"));
		r.get(0).click();
		System.out.println("No. of RadioButtons is :"+r.size());
		Thread.sleep(5000);
		
		//-------------------------------------------------
			//Get Count No. of CheckBox in Page
		List<WebElement> s=driver.findElements(By.xpath("//input[@type='checkbox']"));
		s.get(0).click();
		System.out.println("No.of Checkbox is :"+s.size());
		Thread.sleep(5000);
		
		//-------------------------------------------------
			//Collect all Links and Display in Pre-Link
		List<WebElement> t=driver.findElements(By.xpath("//a"));
		System.out.println("No. of Links is :"+t.size());
		for(int i=0;i<t.size();i++)
		{
			System.out.println(t.get(i).getText());
		}
		
		//-------------------------------------------------
			//Get Count No. of Images in Page
		List<WebElement> bal=driver.findElements(By.xpath("//input[@type='img']"));
		System.out.println("No. of Images in Page is :"+bal.size());
		
			//Close the Site
		driver.close();
		System.out.println("TEst End");
	}

}
