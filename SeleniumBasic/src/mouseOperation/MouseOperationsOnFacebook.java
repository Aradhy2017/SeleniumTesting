package mouseOperation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseOperationsOnFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		to get Url
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[text() ='Create New Account']")).click();
		WebElement username = driver.findElement(By.xpath("//input[@name='firstname']"));
		username.sendKeys("admin");
	    Actions act =new Actions(driver);
//	    to select All Text
	   act.moveToElement(username).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//	   paste
	   driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(Keys.chord(Keys.CONTROL,"v"));

	 
	    
		
		
		
		}

}
