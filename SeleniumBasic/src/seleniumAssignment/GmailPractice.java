package seleniumAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GmailPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\bacup\\Accelration\\Workspace\\SeleniumBasics\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/intl/en-GB/gmail/about/");
		driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement signinbutton=driver.findElement(By.cssSelector("body>header>div>div>div>a:nth-of-type(2)"));
		signinbutton.click();
		
		WebElement enterEmailId=driver.findElement(By.id("identifierId"));
		enterEmailId.sendKeys("akash.r.avhad@gmail.com");
		
		WebElement nextbutton=driver.findElement(By.cssSelector("body>div>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div>div:nth-of-type(2)>div>div:nth-of-type(2)>div>div>div>div>button>span"));
		nextbutton.click();
	}

}
