package swd1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Autoswd12 
{

	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.gecko.driver", "E:\\swd\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.nightexpress.in");
		String x=driver.getTitle();
		System.out.println(x);
		driver.findElement(By.name("Area")).sendKeys("AUNDH-BANER LINK ROAD, PUNE");
		driver.findElement(By.xpath("//*[@value='Search']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@class='icon pe-7s-menu']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(@href,'Register.jsp')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(@name,'FName')]")).sendKeys("tushar");
		driver.findElement(By.xpath("//*[contains(@name,'LName')]")).sendKeys("Rajput");
		driver.findElement(By.xpath("//*[contains(@name,'Add1')]")).sendKeys("Near Bajrang Bogda");
		driver.findElement(By.xpath("//*[contains(@name,'Add2')]")).sendKeys("5-A Laxman Nagar ");
		driver.findElement(By.xpath("//*[contains(@name,'Email')]")).sendKeys("tushar.rajput774@gmail.com");
		driver.findElement(By.xpath("//*[contains(@name,'MobileNo')]")).sendKeys("9579778909");
		driver.findElement(By.xpath("//*[contains(@name,'Password')]")).sendKeys("1ntel@metbkc");
		//WebElement city_value=driver.findElement(By.xpath("//*[contains(@class,'filter-option pull-left')]"));
		//Select city_select=new Select(city_value);
		//WebElement city_sel=city_select.getFirstSelectedOption();
		//System.out.println("After select value is :"+city_sel.getText());
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[contains(@value,'Signup')]")).click();
		String y=driver.switchTo().alert().getText();
		System.out.println(y);
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
		driver.close();
	}

}
