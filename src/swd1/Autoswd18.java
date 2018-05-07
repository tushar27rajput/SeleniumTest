package swd1;

import java.io.File;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Autoswd18 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "E:\\swd\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		System.out.println("Test Start");
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		File src=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("E:\\swd\\g1.png");
		FileUtils.copyFile(src, dest);
		driver.close();
		System.out.println("Test End");
		
		
		
	}

}
