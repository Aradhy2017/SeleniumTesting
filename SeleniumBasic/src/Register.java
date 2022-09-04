import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Register {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//to enter required application URL use get() of WebDriver interface
		driver.get("http://demo.automationtesting.in/Register.html");
		WebElement name = driver.findElement(By.xpath("//input[@placeholder ='First Name']"));
//		//type first name as admin and use ctrl+a
		name.sendKeys("admin",Keys.chord(Keys.CONTROL,"A"));
//		//in first name field use ctrl+c
		name.sendKeys(Keys.chord(Keys.CONTROL,"c"));
//	    //in last name field use ctrl+v
		WebElement LastName = driver.findElement(By.xpath("//input[@placeholder = 'Last Name']"));
		LastName.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		LastName.sendKeys(Keys.TAB);
		
//		Address
		WebElement Address=driver.findElement(By.cssSelector("textarea[class='form-control ng-pristine ng-valid ng-touched']"));
		Address.sendKeys("Tapovan");
	
//		Email
		Thread.sleep(50);
		WebElement Email =driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-valid-email ng-invalid ng-invalid-required ng-touched']"));
		Email.sendKeys("sangale.priyanka@gmail.com",Keys.TAB);
//		phone
		driver.findElement(By.xpath("//input[@class='form-control ng-pristine ng-invalid ng-invalid-required ng-valid-pattern ng-touched']")).sendKeys("7350577046",Keys.TAB);
		
	}

}
