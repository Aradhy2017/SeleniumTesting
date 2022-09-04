package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MouseOperationusingUtilities extends SeleniumUtility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MouseOperationusingUtilities m1 =new MouseOperationusingUtilities();
		WebDriver driver = m1.setUp("Chrome", "https:/facebook.com");
		m1.performClick(driver.findElement(By.xpath("//a[text()='Create New Account']")));
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		m1.typeInput(FirstName, "admin");
		m1.copyTextFromField(FirstName);
		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));
		m1.pasteTextInToField(lastname);
		
		String u = m1.Url();
		System.out.println("Current Url is :"+u);
		
		String CurrentTitle = m1.Title();
		System.out.println("Current Title is :"+CurrentTitle);
		
	
		
		
		
	}

}