package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GsmArena2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com");
//		getTitle
	    String ActualTitle = driver.getTitle();
	    System.out.println("Title is :"+ActualTitle);
//	    Validate Title
	    System.out.println("Validation Title :"+ActualTitle.equals("GSMArena.com - mobile phone reviews, news, specifications and more..."));
		driver.findElement(By.xpath("//a[text()='Apple']")).click();
		List<WebElement>AppleCount = driver.findElements(By.xpath("//div[@id=review-body]/div[1]/ul/li"));
        System.out.println("Apple Phone Count is: "+AppleCount.size());
        for(int i=0;i<AppleCount.size();i++)
        {
        	System.out.println(AppleCount.get(i).getText());
        }
	}

}
