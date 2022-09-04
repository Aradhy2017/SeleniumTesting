package vacationasignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrickinfoTC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\bacup\\Accelration\\Workspace\\SeleniumBasics\\Executable\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
//        implicit wait
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
//        Maximize
        driver.manage().window().maximize();
//        to get open
        driver.get("https://cricinfo.com");
//        to get Title
        String PageTitle = driver.getTitle();
        System.out.println("Page title is :"+PageTitle);
        System.out.println("Validate page Title :"+PageTitle.equals("Live cricket scores, match schedules, latest cricket news, cricket videos"));
        List<WebElement> menu =driver.findElements(By.cssSelector("div.ds-shrink-0>div.ds-flex>span"));
        for(int i=0;i<menu.size();i++)
        {
        	System.out.println(menu.get(i).getText());
        }
        System.out.println("count menunar: "+menu.size());
        driver.close();
	}

}
