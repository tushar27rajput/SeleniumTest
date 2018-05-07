package swd1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Autosikuli 
{

	public static void main(String[] args) throws Exception
	{
		Screen sc=new Screen();
		
		Pattern image =new Pattern("E:\\swd\\gmail.PNG");
		Pattern image4 =new Pattern("E:\\swd\\sign.PNG");
		Pattern image0 =new Pattern("E:\\swd\\uname.PNG");
		Pattern image1 =new Pattern("E:\\swd\\nexttopassword.PNG");
		Pattern image2 =new Pattern("E:\\swd\\pwd.PNG");
		Pattern image3 =new Pattern("E:\\swd\\submit.PNG");
		System.setProperty("webdriver.gecko.driver", "E:\\swd\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		sc.wait(image, 10);
		sc.click(image);
		
		sc.click(image4);
		
		sc.type(image0, "tushar.rajput774");
		sc.click(image1);
		sc.type(image2, "nokia5233ebay");
		sc.click(image3);
		
		
		
		
	}

}
