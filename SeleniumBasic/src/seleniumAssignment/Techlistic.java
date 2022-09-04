package seleniumAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Techlistic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\bacup\\Accelration\\Workspace\\SeleniumBasics\\Executable\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
		cd.get("https://www.techlistic.com");
		String t1=cd.getTitle();
		System.out.println("Title Name is: "+t1);

	}

}
