package swd1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoswd14
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "E:\\swd\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		System.out.println("Test End");
		
		driver.manage().deleteAllCookies();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		String y=driver.getTitle();
		System.out.println("WebSite Title is :"+y);
		Thread.sleep(5000);
		if(driver.manage().getCookies().size()!=0)
		{
			System.out.println("Cookies are New Added ");
		}
		else
		{
			System.out.println("Not Added");
		}
		driver.close();
		System.out.println("Test End");
		
		

	}

}
