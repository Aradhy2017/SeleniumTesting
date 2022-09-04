package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MouseOperation extends Utility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseOperation m1 =new MouseOperation();
		WebDriver driver =m1.setUp("Chrome", "https:/facebook.com");
		m1.PerformClick(driver.findElement(By.xpath("//a[text()='Create New Account']")));
		System.out.println("Title is "+m1.Title());
		System.out.println("Url is :"+m1.Url());
		WebElement FirstName =driver.findElement(By.xpath("//input[@name='firstname']"));
		m1.typeInputField(FirstName, "admin");
		m1.CopyTextFromField(FirstName);
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		m1.PasteTextInToField(lastname);
//		WebElement lastname1 = driver.findElement(By.xpath("//input[@name='lastname']"));
		m1.Tab(lastname);
		WebElement MobileNo = driver.findElement(By.xpath("//input[@name ='reg_email__']"));
		m1.typeInputField(MobileNo,"7350577046");
		m1.Tab(MobileNo);
		WebElement pass =driver.findElement(By.xpath("//input[@id ='password_step_input']"));
		m1.typeInputField(pass, "Aradhy");
		m1.Tab(pass);
		driver.navigate().to("https://www.flipkart.com");
		WebElement close = driver.findElement(By.xpath("//body"));
		m1.escape(close);
		List<WebElement> Menu =driver.findElements(By.xpath("//div[@class='eFQ30H']"));
		m1.MouseAllOver(act, Menu);
		m1.MouseHover(act, Menu.get(3));
		m1.RightClick(act, Menu.get(4));
	}

	

}
