package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://amazon.in");
//		click on Mobile
		driver.findElement(By.xpath("//a[text()='Mobiles']")).click();
//		click on smartphone & Basic Mobile
		driver.findElement(By.xpath("//span[text()='Smartphones & Basic Mobiles']")).click();
//		click on smartphone
		driver.findElement(By.xpath("//span[text()='Smartphones']")).click();
//		Print OnePlus Nord CE 2 Lite 5G 
		WebElement OnePlusNordCE2Lite5G=driver.findElement(By.xpath("//span[text()='OnePlus Nord CE 2 Lite 5G (Blue Tide, 6GB RAM, 128GB Storage)']"));
		System.out.println("Print OnePlusNord: "+OnePlusNordCE2Lite5G.getText());
//		Price of OnePlusNordCE2Lite5G
		WebElement PriceofOnePlusNord=driver.findElement(By.xpath("//div[div[h2[a[span[text()='OnePlus Nord CE 2 Lite 5G (Blue Tide, 6GB RAM, 128GB Storage)']]]]]/div[3]/div[2]/a/span[1]"));
		System.out.println("PriceofOnePlusNor "+PriceofOnePlusNord.getText());
	}

}
