package seleniumAssignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceebookAutomation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\bacup\\Accelration\\Workspace\\SeleniumBasics\\Executable\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS);
		
		String pagetitle=driver.getTitle();
		System.out.println("Page title :"+pagetitle);
		System.out.println("Title Validation "+pagetitle.equals("Facebook – log in or sign up"));
		
		String pageurl=driver.getCurrentUrl();
		System.out.println("Page Title :"+pageurl);
		System.out.println("URL Validation "+pageurl.equals("https://www.facebook.com/"));
		
		WebElement creatButton=driver.findElement(By.cssSelector("div._6ltg a"));
		System.out.println("Creat Button Displayed or Not? :"+creatButton.isDisplayed());
		System.out.println("Creat Button Enable or Not? :"+creatButton.isEnabled());
		creatButton.click();
		Thread.sleep(2000);
		WebElement firstName=driver.findElement(By.cssSelector("input[name='firstname']"));
		System.out.println("First Name Displayed or Not "+firstName.isDisplayed());
		System.out.println("First Name Enable or Not "+firstName.isEnabled());
//		System.out.println("Text in first name box: "+firstName.getText());
		firstName.sendKeys("AKASH");
//		Month Operation
		System.out.println("****************Date list Operation start************");
		WebElement disday=driver.findElement(By.cssSelector("select#day"));
		System.out.println("display :" +disday.isDisplayed());
		System.out.println("display :" +disday.isEnabled());
//		multiselect option
		System.out.println("Multiselect :"+disday.isSelected());
//		option Count
		List <WebElement> disday1= driver.findElements(By.cssSelector("select#day"));
		for(int i=0;i<disday1.size();i++)
		{
			System.out.println(disday1.get(i).getText());
		}
		System.out.println("Count of day is :"+disday1.size());
	
		disday.click();
		Select select=new Select(disday);
		String  CurrentValue  =select.getFirstSelectedOption().getText();
		System.out.println("Print default value "+ CurrentValue);
		WebElement updatedvalue =driver.findElement(By.cssSelector("select#day>option:nth-of-type(14)"));
		System.out.println("Updated value is :"+updatedvalue.getText());
		updatedvalue.click();
		System.out.println("change valueCheck updated : "+updatedvalue.equals(CurrentValue));
		System.out.println("****************Date list Operation End************");
		
		
		System.out.println("****************Month list Operation start************");
       WebElement month= driver.findElement(By.cssSelector("select#month"));
       System.out.println("Month visble or not: "+month.isDisplayed());
       System.out.println("Month enabled or not :"+month.isEnabled());
       System.out.println("Month multiselected or not :"+month.isSelected());
//       count and name of Month
       List<WebElement> monthcount =driver.findElements(By.cssSelector("select#month"));
       System.out.println("Count of Month is: "+monthcount.size());
       for(int i=0;i<monthcount.size();i++)
       {
    	   System.out.println(monthcount.get(i).getText());
       }
        
		
		Select select1=new Select(month);
		String DefaultMonth =select1.getFirstSelectedOption().getText();
		System.out.println("Default month is :"+DefaultMonth);
		month.click();
	
		WebElement Updatedmonth=driver.findElement(By.cssSelector("select#month>option:nth-of-type(9)"));
		System.out.println("updataed month is :"+Updatedmonth.getText());
		Updatedmonth.click();
		System.out.println("Check the updated value: "+Updatedmonth.equals(DefaultMonth));
		System.out.println("****************Month list Operation End************");
		
		System.out.println("************Year list operation start*********");
		WebElement year =driver.findElement(By.cssSelector("select#year"));
		System.out.println("year visible or not :"+year.isDisplayed());
		System.out.println("year enable or not : "+year.isEnabled());
		System.out.println("year multiselected or not : "+year.isSelected());
		List<WebElement> yearcount =driver.findElements(By.cssSelector("select#year"));
		System.out.println("year count is :"+yearcount.size());
		for(int i=0;i<yearcount.size();i++)
		{
			System.out.println(yearcount.get(i).getText());
		}
		Select select2 =new Select(year);
		String Defaultyear =select2.getFirstSelectedOption().getText();
		System.out.println("Default year is: "+Defaultyear);
		Thread.sleep(100);
//		year.click();
		
//		WebElement changeyear = driver.findElement(By.cssSelector("select#year>option:nth-of-type(2017)"));
//		System.out.println("Updated year is  :"+changeyear.getText());
//		changeyear.click();
//		System.out.println("Check year status :"+Defaultyear.equals(changeyear));
		WebElement male=driver.findElement(By.cssSelector("span>span>input#u_3_2_4T"));
		System.out.println("male is selected or not :"+male.isSelected());
		
//		driver.close();
		


	}

}
