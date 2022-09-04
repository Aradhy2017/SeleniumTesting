package mouseOperation;

import java.awt.Menu;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOperation2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://www.globalsqa.com/demo-site/");
		List<WebElement>MainMenu = driver.findElements(By.xpath("//div[@id='menu']/ul/li"));
		System.out.println("Mainmenu size is :"+MainMenu.size());
//		to print all MainMenu
		for(int i=0;i<MainMenu.size();i++)
		{
			System.out.println(MainMenu.get(i).getText());
		}
//		hover Mouse to particular menu
		Actions act = new Actions(driver);
		act.moveToElement(MainMenu.get(2)).perform();
		
//		hover the mouse to all menu
		for(int i=0;i<MainMenu.size();i++)
		{
//			WebElement option =MainMenu.get(i);
//			act.moveToElement(option).perform();
			act.moveToElement(MainMenu.get(i)).perform();
		}
		mouseHoverOverTheElement(act, MainMenu.get(3));
		
		mouseHover(act, MainMenu);
		//act.moveToElement(mainMenu.get(1), 100, 0).perform();
		 mouseHoverWithCords(act, MainMenu.get(1),100,0);

		rightClick(act, MainMenu.get(1));
		

	}
//	Methods For selecting Particular Menu
    
    static void mouseHoverOverTheElement(Actions act ,WebElement element)
    {
    	act.moveToElement(element).perform();
    }
    
//	Methods For selecting all Menu
    static void mouseHover(Actions act, List<WebElement>MainMenu) throws InterruptedException
    {
    	for(int i=0; i<MainMenu.size();i++)
    	{
    		WebElement option =MainMenu.get(i);
    		act.moveToElement(option).perform();
    		Thread.sleep(1000);
    	}
    }
//    Method for RightClick
     static void rightClick(Actions act,WebElement option)
     {
    	 System.out.println("Option Name is :"+option.getText());
    	 act.moveToElement(option).contextClick().build().perform();
     }
     
     static void mouseHoverWithCords(Actions act, WebElement option, int x, int y) throws InterruptedException {
 		System.out.println("Option name is : " + option.getText());
 		act.moveToElement(option, x, y).perform();
 	}
}
