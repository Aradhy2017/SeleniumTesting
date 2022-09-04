package mouseOperation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://the-internet.herokuapp.com/drag_and_drop");
		// frame handling
		WebElement frame = driver.findElement(By.cssSelector("#content"));
		driver.switchTo().frame(frame);
		// create an instance of Actions class by passing required browser instance to
		// its constructor
		Actions act =new Actions(driver);
         //	to select SourceFrame	
		List<WebElement> SourceElement= driver.findElements(By.xpath("//div[@id='column-a']"));
//		  to select DestinationFrame
		WebElement Desti = driver.findElement(By.xpath("//div[@id='column-b"));
		act.dragAndDrop(SourceElement.get(1),Desti);
		
       //	calling method	
		DragAndDrop(act,SourceElement.get(1),Desti);
		
		
		
	}
          static void DragAndDrop(Actions act,WebElement src,WebElement target)
          {
        	  act.dragAndDrop(src, target).build().perform();
          }
}
