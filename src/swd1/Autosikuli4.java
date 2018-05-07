package swd1;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class Autosikuli4 
{

	public static void main(String[] args) throws Exception 
	{
		System.out.println("Test Start");
		System.setProperty("webdriver.chrome.driver", "E:\\swd\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		Thread.sleep(5000);
		File f=new File("E:\\swd\\ytube11111.PNG");
		Screen s=new Screen();
		ScreenImage si=s.capture();
		BufferedImage bi=si.getImage();
		ImageIO.write(bi, "PNG", f);
		File f1=new File("E:\\swd\\yytube2.PNG");
		Region r=new Region(367,471,250,200);
		ScreenImage si_1=s.capture(r);
		BufferedImage bi_1=si_1.getImage();
		ImageIO.write(bi_1, "PNG", f1);
		driver.close();
		System.out.println("Test End");
		
		
		
	}

}
