package seleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SeleniumAssignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\bacup\\Accelration\\Workspace\\SeleniumBasics\\\\Executable\\chromedriver.exe");
        WebDriver driver =new ChromeDriver();
//         launch browser
         driver.get("https://www.google.com");
         
//         fetch current URL
         String url=driver.getCurrentUrl();
         System.out.println("Current Url is: "+url);
         
//         fetch source of current web page
         String src=driver.getPageSource();
         System.out.println("Source of web page: "+src);
         
//         Page source length 
         int len=driver.getPageSource().length();
         System.out.println("Page source length is: "+len);
  
//         close current browser
         driver.close();
	}

}
