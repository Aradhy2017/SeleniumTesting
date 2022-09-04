package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonWatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//span[text()='Watches']")).click();
	    WebElement WatchName =driver.findElement(By.xpath("//span[text()='Fossil Analog Rose Gold Dial Women's Watch-BQ3181']"));
		System.out.println("WatchName is :"+WatchName.getText());

	}

}
