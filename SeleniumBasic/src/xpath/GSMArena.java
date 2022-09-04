package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GSMArena {

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
        List<WebElement> PhoneList = driver.findElements(By.xpath("//div[@class='brandmenu-v2 light l-box clearfix']"));
        System.out.println("PhoneList count is:"+PhoneList.size());
        for(int i =0;i<PhoneList.size();i++)
        {
        	System.out.println(PhoneList.get(i).getText());
        }
	}

}
