package swd1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Autosikuli1 
{

	public static void main(String[] args) throws Exception
	{
		Screen sc=new Screen();
		Pattern image =new Pattern("E:\\swd\\fname.PNG");
		Pattern image4 =new Pattern("E:\\swd\\fpwd.PNG");
		Pattern image0 =new Pattern("E:\\swd\\logon.PNG");
		System.setProperty("webdriver.gecko.driver", "E:\\swd\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		sc.wait(image, 10);
		sc.type(image, "**********");
		
		sc.type(image4, "***********");
		sc.click(image0);
		
		
	}

}
