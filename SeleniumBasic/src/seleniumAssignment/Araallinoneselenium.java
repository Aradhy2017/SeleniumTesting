package seleniumAssignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Araallinoneselenium {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "D:\\bacup\\Accelration\\Workspace\\SeleniumBasics\\Executable\\chromedriver.exe");
		
			WebDriver driver=new ChromeDriver();
			driver.get("https://demo.actitime.com");
			driver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
			
			WebElement userNameInputField=driver.findElement(By.id("username"));
			System.out.println("User name is displayed or not? "+userNameInputField.isDisplayed());
			System.out.println("User name is functional or not? "+userNameInputField.isEnabled());
			
			String defaultValueInUserNameInputField=userNameInputField.getAttribute("placeholder");
			System.out.println("Default value of user name input field: "+defaultValueInUserNameInputField);
			System.out.println("Default value validation for user name input field status: "+defaultValueInUserNameInputField.equals("Username"));
			userNameInputField.clear();
			userNameInputField.sendKeys("admin");
			
			WebElement passwordInputField=driver.findElement(By.name("pwd"));
			System.out.println("Password is displayed or not? "+passwordInputField.isDisplayed());
			System.out.println("Password is functional or not? "+passwordInputField.isEnabled());
			
			String defaultValueInpasswordInputField=passwordInputField.getAttribute("placeholder");
			System.out.println("Default value of password input field: "+defaultValueInpasswordInputField);
			System.out.println("Default value validation for password input field status: "+defaultValueInpasswordInputField.equals("Password"));
			passwordInputField.clear();
			passwordInputField.sendKeys("manager");
			
			WebElement keepMeLoginButton=driver.findElement(By.id("keepMeLoggedInSection"));
			System.out.println("Keep Me Login Button Displaye or not? "+keepMeLoginButton.isDisplayed());
			System.out.println("Keep Me Login Button Enable or not? "+keepMeLoginButton.isEnabled());
			System.out.println("Keep Me Login Button Text on Screen "+keepMeLoginButton.getText());
			Thread.sleep(2000);
			System.out.println("Keep Me Login Button Selected or Not? "+keepMeLoginButton.isSelected());
			
			WebElement loginButton=driver.findElement(By.id("loginButton"));
			System.out.println("Login Button Displayed or not? "+loginButton.isDisplayed());
			System.out.println("Login Button Enable or Not? "+loginButton.isEnabled());
			loginButton.click();
			
			WebElement logout=driver.findElement(By.id("logoutLink"));
			System.out.println("Logout Button Displayed or not? "+logout.isDisplayed());
			System.out.println("Logout Button Enable or Not? "+logout.isEnabled());
			logout.click();
			driver.close();
			
			
			
	}

}
