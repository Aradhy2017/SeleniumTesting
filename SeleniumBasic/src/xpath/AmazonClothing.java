package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonClothing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		 driver.findElement(By.cssSelector("#nav-xshop>a:nth-of-type(3)")).click();
		 driver.findElement(By.xpath("//span[text()='Lightning Deals']")).click();
		 WebElement Name =driver.findElement(By.xpath("//div[text() ='JBLC100SIUBLK']"));
		 System.out.println("Name is : "+Name.getText());
		 WebElement PhonePrice=driver.findElement(By.xpath("//div[div[a[div[text() ='JBLC100SIUBLK']]]]/div/span/span"));
         System.out.println("Mobile Phone is :"+PhonePrice.getText());
         
	}

}
