package mouseOperation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FlipkartMouseOperation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		enter Url
		driver.get("https://www.flipkart.com");
//		Notification close
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.ESCAPE);
//		Menu Locator
		List <WebElement> MainMenu = driver.findElements(By.cssSelector(".eFQ30H"));
		System.out.println("MainMenu Size is :"+MainMenu.size());
//		Only Show Particular Menu
		System.out.println(MainMenu.get(3).getText());
//		Print all Menu
		for(int i=0;i<MainMenu.size();i++)
		{
			System.out.println(MainMenu.get(i).getText());
		}
//		MouseOver to particular menu
		Actions act =new Actions(driver);
		act.moveToElement(MainMenu.get(4)).perform();
		
//		MouseHover to all Menu
		for(int i=0;i<MainMenu.size();i++)
		{
//			WebElement option = MainMenu.get(i);
//			act.moveToElement(option).perform();
			act.moveToElement(MainMenu.get(i)).build().perform();
			Thread.sleep(1000);
		}
		
//		calling to mouseHover
		mouseHover(act,MainMenu.get(5));
		
//		caliing to MouseHoverToAll
		MouseHoverToAll(act,MainMenu);
		
//		calling to rightClick
		rightClick(act,MainMenu.get(4));
		
//		using chord
		 mouseHoverWithCords(act, MainMenu.get(1),100,0);
		
		
	}
//            Using Method to over particular menu
	    static void mouseHover(Actions act,WebElement element)
	    {
	    	act.moveToElement(element).build().perform();
	    }
	    
//      Using Method to over all menu
	    static void MouseHoverToAll(Actions act,List<WebElement>MainMenu)
	    {
	    	for(int i=0;i<MainMenu.size();i++)
	    	{
	    		WebElement option =MainMenu.get(i);
	    		act.moveToElement(option).build().perform();
	    	}
	    }
//	    right click
	    static void rightClick(Actions act,WebElement option)
	    {
	    	act.moveToElement(option).contextClick().build().perform();
	    }
	    
//	    Using chord
	    static void mouseHoverWithCords(Actions act, WebElement option, int x, int y) throws InterruptedException {
	 		System.out.println("Option name is : " + option.getText());
	 		act.moveToElement(option, x, y).perform();
 }
}