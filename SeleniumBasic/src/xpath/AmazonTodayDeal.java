package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTodayDeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
       driver.get("https://www.amazon.in");
       driver.findElement(By.cssSelector("#nav-xshop>a:nth-of-type(3)")).click();
       driver.findElement(By.xpath("//span[text()='Mobiles']")).click();
       WebElement MobileName = driver.findElement(By.xpath("//div[text()='Best Price on Vivo Y21G - with 5000mAh battery and 18W fast charge']"));
       System.out.println("Mobile Name is :"+MobileName.getText());
       WebElement MobilePrice = driver.findElement(By.xpath("//div[a[div[text()='Best Price on Vivo Y21G - with 5000mAh battery and 18W fast charge']]]/span/span/span[2]"));
       System.out.println("Mobile Price is :"+MobilePrice.getText());
      
	}

}
