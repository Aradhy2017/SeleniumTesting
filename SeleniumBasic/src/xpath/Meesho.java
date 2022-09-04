package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Meesho {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https:www.meesho.com");
		WebElement OilName=driver.findElement(By.xpath("//p[text()='Onion Hair Oil']"));

		System.out.println("BookName is :"+OilName.getText());
		WebElement OilPrice = driver.findElement(By.xpath("//div[p[text()='Onion Hair Oil']]/div[1]/h5"));
        System.out.println("BookPrice is :"+OilPrice.getText());
        


}
}