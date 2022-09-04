package seleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\bacup\\Accelration\\Workspace\\SeleniumBasics\\\\Executable\\chromedriver.exe");
        WebDriver cd =new ChromeDriver();
        
//        Launch Web browser
        cd.get("https://www.google.com");
        
//        Open facebook Url in current browser
        cd.get("https://www.facebook.com");
        
//        Fetching home page title
        String Title=cd.getTitle();
        System.out.println("Title is: "+Title);
        
//        Verify actual title and expected title
        String expectedTitle ="Facebook – log in or sign up";
        String actualTitle = cd.getTitle();
        if(actualTitle.equals(expectedTitle))
        {
        	System.out.println("Title is passed");
        }
        else
        {
        	System.out.println("Title is Failed");
        }
        
//        print home page title
        String Title1=cd.getTitle();
        System.out.println("Title is: "+Title1);
        
//        close current browser
        cd.close();
	}

}
