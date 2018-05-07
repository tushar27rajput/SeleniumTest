package swd1;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoswd6
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","E:\\swd\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.naukri.com");
		String pagetitile=driver.getTitle();
		System.out.println(pagetitile);
		
		//String windowlist=driver.getWindowHandle();
		//System.out.println("Another Window"+windowlist);
		
		String url_current=driver.getCurrentUrl();
		System.out.println(url_current);
		
		
		
		
		
		
		
	}

}
