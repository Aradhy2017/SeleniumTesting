package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
	    WebElement GoogleInputField = driver.findElement(By.xpath("//input[@name='q']"));
	    GoogleInputField.click();
	    GoogleInputField.sendKeys("Selenium Interview Question");
	    List<WebElement>count =driver.findElements(By.xpath("//ul/li"));
	    System.out.println("Suggestion of Selenium Interview Question count:"+count.size());
	    for(int i=0;i<count.size();i++)
	  {
		System.out.println(count.get(i).getText());
	  }
   }

 }
