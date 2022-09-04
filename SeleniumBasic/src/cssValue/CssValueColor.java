package cssValue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssValueColor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		//maximize browser
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http:courses.letskodeit.com/practice");
		
		WebElement RadioButton = driver.findElement(By.id("radio-btn-example"));
		System.out.println("Font color is: "+RadioButton.getCssValue("color"));
		System.out.println("Font-size is :"+RadioButton.getCssValue("font-size"));
		System.out.println("Background color is :"+RadioButton.getCssValue("background"));
		
//		Select class Example
		WebElement SelectClass =driver.findElement(By.id("select-class-example"));
		System.out.println("Font color is: "+SelectClass.getCssValue("color"));
		System.out.println("Font-size is :"+SelectClass.getCssValue("font-size"));
		System.out.println("Background color is :"+SelectClass.getCssValue("background"));
		
//		MultipleSelect class Example
		WebElement MulSelectClass = driver.findElement(By.id("select-class-example"));
		System.out.println("Font color is: "+MulSelectClass.getCssValue("color"));
		System.out.println("Font-size is :"+MulSelectClass.getCssValue("font-size"));
		System.out.println("Background color is :"+MulSelectClass.getCssValue("background"));
		
//		Checkbox Example
		WebElement Checkbox  = driver.findElement(By.id("checkbox-example-div"));
		System.out.println("Font color is: "+Checkbox .getCssValue("color"));
		System.out.println("Font-size is :"+Checkbox .getCssValue("font-size"));
		System.out.println("Background color is :"+Checkbox .getCssValue("background"));
		
//Open Window
		WebElement OpenWindow = driver.findElement(By.id("checkbox-example-div"));
		System.out.println(" OpenWindow Font color is: "+ OpenWindow .getCssValue("color"));
		System.out.println(" OpenWindow Font-size is :"+ OpenWindow .getCssValue("font-size"));
		System.out.println(" OpenWindow Background color is :"+ OpenWindow .getCssValue("background-color"));
		
//Open Tab
				WebElement OpenTab = driver.findElement(By.id("checkbox-example-div"));
				System.out.println(" OpenTab Font color is: "+ OpenTab .getCssValue("color"));
				System.out.println(" OpenTab Font-size is :"+ OpenTab .getCssValue("font-size"));
				System.out.println(" OpenTab Background color is :"+ OpenTab .getCssValue("background-color"));
	
	}

}
