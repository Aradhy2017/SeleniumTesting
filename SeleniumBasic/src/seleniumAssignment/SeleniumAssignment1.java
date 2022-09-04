package seleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\bacup\\Accelration\\Workspace\\SeleniumBasics\\Executable\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
		cd.get("https://demo.actitime.com");
		String t1=cd.getTitle();
		System.out.println("Title Name is: "+t1);
		int length1= cd.getTitle().length();
		System.out.println("The length of Title is: "+length1);
		String expectedUrl="https://demo.actitime.com";
		String actualUrl =cd.getCurrentUrl();
		System.out.println("Print actualUrl: "+actualUrl);
		if(actualUrl.contains(expectedUrl))
		{
			System.out.println("Url is passed");
		}
		else
		{
			System.out.println("Url is Failed");
		}
		String source =cd.getPageSource();
		System.out.println("Page source is "+source);
		int len=cd.getPageSource().length();
		System.out.println("The page source legth is: "+len);
		cd.close();

	}

}
