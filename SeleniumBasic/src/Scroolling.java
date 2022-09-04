import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scroolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://www.flipkart.com/");
		WebElement Scroll = driver.findElement(By.xpath("//body"));
		Scroll.sendKeys(Keys.ESCAPE);
		
		//scrolling using page down button
		for(int i=0;i<10;i++)
		{
			Scroll.sendKeys(Keys.PAGE_DOWN);
			Thread.sleep(1500);
		}
//		Home start
		Scroll.sendKeys(Keys.CONTROL,Keys.HOME);
//		Direct End page
		Scroll.sendKeys(Keys.CONTROL,Keys.END);
	}

}
