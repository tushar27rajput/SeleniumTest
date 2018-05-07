package swd1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Button;
import org.sikuli.script.Location;
import org.sikuli.script.Match;
import org.sikuli.script.Screen;



public class Autosikuli2 
{

	public static void main(String[] args) throws Exception
	{
		System.out.println("Test Start");
		System.setProperty("webdriver.chrome.driver", "E:\\swd\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com");
		Thread.sleep(5000);
		driver.findElement(By.id("search")).sendKeys("abdul kalam speechs");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='search-icon-legacy']/yt-icon[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Dr. A P J Abdul Kalam in European Parliament")).click();
		Thread.sleep(1000);
		Screen s=new Screen();
		if(s.exists("E:\\swd\\skiadd.PNG") != null)
		{
			s.click("E:\\swd\\skiadd.PNG");
		}
		
		Location l=new Location(200,200);
		s.wheel(l, Button.LEFT, 0);
		s.click("E:\\swd\\pause.PNG");
		Thread.sleep(5000);
		
		s.wheel(l, Button.LEFT, 0);
		s.click("E:\\swd\\play.PNG");
		Thread.sleep(5000);
		
		s.wheel(l, Button.LEFT, 0);
		s.mouseMove("E:\\swd\\vol.PNG");
		Thread.sleep(5000);
		
		Match e= s.find("E:\\swd\\bubble.PNG");
		int x=e.getX();
		int y=e.getY();
		
		Location p1=new Location(x-25,y);
		s.dragDrop(e, p1);
		Thread.sleep(5000);
		
		Location p2=new Location(x+20,y);
		s.dragDrop(e, p2);
		
		driver.close();
		
		
		System.out.println("Test End");
		
		
		
		
		
	}

}
