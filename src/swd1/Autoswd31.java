package swd1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autoswd31
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "E:\\swd\\chromedriver.exe");
		WebDriver driver9=new ChromeDriver();
		System.out.println("Test Start");
		
		//launch Web-site
		driver9.get("https://semantic-ui.com/modules/dropdown.html");
		driver9.manage().window().maximize();
		Thread.sleep(5000);
		
		//Get items from MultiSelect Dropdowns(Div Tag)
		
		//List<WebElement> li=driver9.findElements(By.xpath("//*[contains(@class,'dropdown selection multiple active ')][1]/div[2]/div[5]"));
		//System.out.println("all items is"+li.size());
		WebElement z=driver9.findElement(By.xpath("//*[contains(@class,'dropdown selection multiple active ')][1]/div[2]/div"));
		System.out.println(z.getSize());
		//JavascriptExecutor js=(JavascriptExecutor)driver9;
		
	//	for(int i=0;i<z.size();i++)
		//{
		//	js.executeScript("var x=arguments[0].textContent;alert(x);",z.get(i));
			//String y=driver9.switchTo().alert().getText();
			//System.out.println(y);
			//driver9.switchTo().alert().dismiss();
//		}
		
		
		driver9.close();
		
	}

}
