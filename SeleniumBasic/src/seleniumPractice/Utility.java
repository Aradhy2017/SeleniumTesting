package seleniumPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Utility {
	private static  WebElement WebElement = null;
	public static WebDriver driver =null;
	public static Actions act =null; 
	public static WebDriverWait wait; 
	
	public WebDriver setUp(String browserName,String appurl)
	{

		if (browserName.equalsIgnoreCase("Chrome")) {
			// use setup method of WebDriverManager
			 WebDriverManager.chromedriver().setup();
			;
			// step2: create an instance of Chrome Browser
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			// use setup method of WebDriverManager
			WebDriverManager.iedriver().setup();
			
			// step2: create an instance of Chrome Browser
			driver = new InternetExplorerDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			// use setup method of WebDriverManager
			 WebDriverManager.firefoxdriver().setup();
			
			// step2: create an instance of Chrome Browser
			driver = new FirefoxDriver();
		}
		// maximize browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver,30);
	    act = new Actions(driver); 
	 
	    driver.get(appurl);
	   
		return driver;
	}
		
		public void PerformClick(WebElement element)
		{
			element.click();
		}
		public String Title()
		{
			String Title1 = driver.getTitle();
			return Title1;
		}
		public String Url()
		{
			String Url = driver.getCurrentUrl();
			return Url;
		}
		public void typeInputField(WebElement element,String text)
		{
			element.clear();
			element.sendKeys(text);
		}		
		public void CopyTextFromField(WebElement element)
		{
			act.doubleClick(element).perform();
			element.sendKeys(Keys.chord(Keys.CONTROL,"c"));
			
		}
		public void PasteTextInToField(WebElement element)
		{
			element.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		}
		public void Tab(WebElement element)
		{
			element.sendKeys(Keys.TAB);
		}
	    public void escape(WebElement element)
	    {
	    	element.sendKeys(Keys.ESCAPE);
	    }
		
		public void MouseAllOver(Actions act,List<WebElement>element)
		{
			for(int i=0;i<element.size();i++)
			{
				WebElement option =element.get(i);
				act.moveToElement(option).build().perform();
				
			}
		}
		public void MouseHover(Actions act,WebElement element)
		{
			act.moveToElement(element).perform();
		}
		public void RightClick(Actions act,WebElement element)
		{
			System.out.println("Option Name is :"+element.getText());
			act.moveToElement(element).contextClick().build().perform();
			
		}
		public void doubleClick(Actions act,WebElement element)
		{
			act.moveToElement(element).doubleClick().build().perform();
		}
		public void DragAndDrop(WebElement src,WebElement target)
		{
			act.moveToElement(src).dragAndDrop(src, target).build().perform();
		}
	}
