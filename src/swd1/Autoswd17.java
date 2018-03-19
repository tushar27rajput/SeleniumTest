package swd1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autoswd17 
{

	public static void main(String[] args) throws IOException
	{
		System.setProperty("webdriver.gecko.driver", "E:\\swd\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		TakesScreenshot scrShot=((TakesScreenshot)driver);
		System.out.println("Test Start");
		driver.get("http:\\www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		File src=scrShot.getScreenshotAs(OutputType.FILE);
		File descFile=new File("E:\\swd\\fb1.png");
		FileUtils.copyFile(src, descFile);
		driver.close();
		System.out.println("Test End");
		
		
		
	
		
	}

}
