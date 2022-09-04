package vacationasignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\bacup\\Accelration\\Workspace\\SeleniumBasics\\Executable\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement user=driver.findElement(By.id("username"));
		user.sendKeys("admin");
		WebElement pass=driver.findElement(By.name("pwd"));
		pass.sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
//		click on task
		driver.findElement(By.cssSelector("tbody>tr>td:nth-of-type(4)>a>div#container_tasks")).click();
//		validate task page using Title
		String TaskTitle =driver.getTitle();
		System.out.println("Task Page Title is:"+TaskTitle);
		System.out.println("Validation status :"+TaskTitle.equals("actiTIME - Task List"));
//		validate task page using Url
		String TaskUrl =driver.getCurrentUrl();
		System.out.println("Task list url:"+TaskUrl);
		System.out.println("Validation of page :"+TaskUrl.equals("https://demo.actitime.com/tasks/tasklist.do"));
//		click on Add new
		driver.findElement(By.cssSelector(".addNewButton")).click();
//		click On select new task
		driver.findElement(By.cssSelector(".createNewTasks")).click();
//		First DropDown
	//	driver.findElement(By.cssSelector(".selectorWithPlaceholderContainer .selectedItem")).click();
	//	driver.findElement(By.cssSelector(".selectorWithPlaceholderContainer .searchItemList>div:nth-of-type(5)")).click();
////		Second Dropdown
//		driver.findElement(By.cssSelector(".projectSelector .selectedItem")).click();;
//		driver.findElement(By.cssSelector(".projectSelector .searchItemList>div:nth-of-type(4)")).click();
//		Create Task
		
		
//		driver.findElement(By.cssSelector(".commitButtonPlaceHolder ")).click();
//		WebElement input =driver.findElement(By.cssSelector("input['placeholder=Enter task name']"));
//		input.click();
//		input.sendKeys("testing");
//	
//		driver.findElement(By.cssSelector("#ext-gen49")).click();
//	//   driver.findElement(By.cssSelector("tbody>tr:nth-of-type(3)>td:nth-of-type(2)>a.x-date-date>em>span")).click();
//calendar
		driver.findElement(By.id("ext-gen45")).click();
		driver.findElement(By.id("ext-gen110")).click();
		
		driver.findElement(By.cssSelector(".x-date-inner>tbody>tr:nth-of-type(3)>td:nth-of-type(2)")).click();
		driver.close();
	}

}
