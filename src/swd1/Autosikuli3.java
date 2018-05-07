package swd1;

import java.util.Iterator;


import org.sikuli.script.Match;
import org.sikuli.script.Screen;

public class Autosikuli3
{

	public static void main(String[] args) throws Exception
	{
		
		System.out.println("Test Start");
		Screen s=new Screen();
		s.click("E:\\swd\\min.PNG");
		Thread.sleep(5000);
		Iterator <Match> i=s.findAll("E:\\swd\\file.PNG");
		int count=0;
		while(i.hasNext())
		{
			count=count+1;
			i.next().click();
			Thread.sleep(5000);
		}
		System.out.println(count);
		
		
		

	}

}
