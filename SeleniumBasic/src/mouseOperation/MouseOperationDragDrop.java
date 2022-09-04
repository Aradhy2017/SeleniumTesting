package mouseOperation;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOperationDragDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//to enter required application URL use get() of WebDriver interface
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		// frame handling
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame);
		
		// create an instance of Actions class by passing required browser instance to
		// its constructor
		Actions act =new Actions(driver);
//		sourceElement
		List<WebElement> sourceElements = driver.findElements(By.xpath("//ul[@id='gallery']/li"));
//      Target
		WebElement target =driver.findElement(By.xpath("//div[@id='trash']"));
//		act.dragAndDrop( sourceElements.get(1), target).build().perform();
//		Thread.sleep(1000);
//		act.dragAndDrop(sourceElements.get(2), target).build().perform();
		
//		calling Method
		PerformDragAndDrop(act,sourceElements.get(3),target);
        
	}
         static void PerformDragAndDrop(Actions act,WebElement src,WebElement target)
         {
        	 act.dragAndDrop(src, target).build().perform();
         }
}
