package day1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Openfirefoxbrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\bacup\\Accelration\\Workspace\\SeleniumBasics\\Executable\\geckodriver.exe");
		FirefoxDriver fb = new FirefoxDriver();
		fb.get("https://www.google.com");

	}

}
