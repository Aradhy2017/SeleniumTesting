package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumproject2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\bacup\\Accelration\\Workspace\\SeleniumBasics\\Executable\\chromedriver.exe");
		ChromeDriver cd =new ChromeDriver();
		cd.get("https://www.google.com");

	}

}
