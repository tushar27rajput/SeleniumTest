package swd1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoswd13
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "E:\\swd\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		System.out.println("Test Start");
		driver.manage().window().maximize();
		//driver.get("http://www.nightexpress.in");
		driver.get("http://www.gmail.com");
		String x=driver.getCurrentUrl();
		if(x.contains("https"))
		{
			System.out.println("Secure WebSite:"+x);
		}
		else
		{
			System.out.println("Not Secure");
		}
		driver.close();
		System.out.println("Test End");
	}

}
