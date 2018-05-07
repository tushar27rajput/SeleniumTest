package swd1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Autoswd23
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "E:\\swd\\geckodriver.exe");
		WebDriver driver3=new FirefoxDriver();
		driver3.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver3.manage().window().maximize();
		Thread.sleep(5000);
		driver3.switchTo().frame("iframeResult");
		WebElement e=driver3.findElement(By.name("cars"));
		Select s2=new Select(e);
		Thread.sleep(5000);
		Actions a=new Actions(driver3);
		a.keyDown(Keys.CONTROL).build().perform();
		a.click(s2.getOptions().get(2)).build().perform();
		a.click(s2.getOptions().get(3)).build().perform();
		a.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		int p=s2.getOptions().size();
		System.out.println(p);
		int q=s2.getAllSelectedOptions().size();
		System.out.println("Selected items COunt ::"+q);
		String r=s2.getFirstSelectedOption().getText();
		System.out.println(r);
		Thread.sleep(5000);
		driver3.close();
		
		
	}

}
