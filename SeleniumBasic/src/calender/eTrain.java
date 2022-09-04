package calender;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class eTrain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		//step2: create an instance of Chrome Browser
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://etrain.info/in");
		WebElement source=driver.findElement(By.cssSelector("input[placeholder='Source Station']"));
		source.click();	  
		source.sendKeys("Pune");
		Thread.sleep(50);
		driver.findElement(By.cssSelector("#suggest_row1>a>i")).click();
		WebElement Desty = driver.findElement(By.cssSelector("input[placeholder='Destination Station']"));
		Desty.click();
		
		Desty.sendKeys("Mumbai");
		
		driver.findElement(By.cssSelector("#suggest_row2>a")).click();
//	Calendar select
		
		driver.findElement(By.cssSelector("#tbsfi4")).click();
		
		driver.findElement(By.cssSelector(".nav")).click();
		
		driver.findElement(By.cssSelector("input[value='13']")).click();
		//Train button click --input[placeholder='Select Date']
//		Train select
	    WebElement SelectTrain = driver.findElement(By.id("tbsfi5"));
	    SelectTrain.click();
	    
		Select Train =new Select(SelectTrain);
		String currentTrainType = Train.getFirstSelectedOption().getText();
		System.out.println("Current selected Train is :"+currentTrainType);
//		Print all train
	     List<WebElement>TrainCount =driver.findElements(By.id("tbsfi5"));
		for(int i=0;i<TrainCount.size();i++)
		{
			System.out.println(TrainCount.get(i).getText());
		}
//		to select Particular train
		driver.findElement(By.cssSelector("#tbsfi5 option[value ='TQ']")).click(); 
//		To Get Train
		driver.findElement(By.cssSelector("#tbssbmtbtn")).click();
		List<WebElement>Trainnumber=driver.findElements(By.cssSelector("a[href='/train/Vskp-Ltt-Express-18519/schedule']"));
		for(int i=0;i<Trainnumber.size();i++) {
			System.out.print(Trainnumber.get(i).getText());
		}

	}

}
