package DropDown;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver","D:\\bacup\\Accelration\\Workspace\\SeleniumBasics\\Executable\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(35,TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
		//**** Identify dropdown list
		WebElement SkillDropdown=driver.findElement(By.id("Skills"));
		SkillDropdown.click();
		//**** Create an instance of Select class and pass above element into its constructor
		Select selectSkill =new Select(SkillDropdown);
		//**** check whether dropdown is multiselect dropdown or not
		System.out.println("Is dropdown is allowing you to select multiple option: "+selectSkill.isMultiple());
		//**** get default or already select option
		System.out.println("Already selected option show :"+selectSkill.getFirstSelectedOption().getText());
		//get option count 
		
		List<WebElement> option =selectSkill.getOptions();
		System.out.println("Dropdown option is :"+option.size());
		
	    for(int i=1;i<option.size();i++)
		{
			System.out.println(option.get(i).getText());
		}
//		//TODO: validation dropdown skills are getting displayed in ascending order
//	    
//	  //Creating a List to store all dropdown values
//	    
        List OriginalList = new ArrayList();		
        
      //Creating temp List - same copy of Original for comparing purpose
        
        List templist = new ArrayList(OriginalList);
        
        System.out.println("Temp List: " + templist);
       
        //Sorting the Original List 
        Collections.sort(OriginalList);
        
        System.out.println("Sorted List:" + OriginalList );
        System.out.println("To check sorting :"+OriginalList.equals(templist));

              
     //select options from dropdown
        selectSkill.selectByIndex(5);
        System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
        selectSkill.selectByValue("Backup Management");
		System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());
				//or
		selectSkill.selectByVisibleText("Analytics");
		System.out.println("Already selected option name: "+selectSkill.getFirstSelectedOption().getText());	
		
		System.out.println("***********Year ascending order validation*********");
		
		WebElement year=driver.findElement(By.cssSelector("select#yearbox"));
		year.click();
		Select selectyear =new Select(year);
		System.out.println("Is dropdown is allowing you to select multiple year option: "+selectyear.isMultiple());
		System.out.println("Dropdown year option :"+selectyear.getFirstSelectedOption().getText());
		List<WebElement> yearop = selectyear.getOptions();
		System.out.println("Year size is :"+yearop.size());
		for(int i1=0;i1<yearop.size();i1++)
		{
			System.out.println(yearop.get(i1).getText());
		}
	 
		List yearOriList =new ArrayList();
		List yeartempList =new ArrayList(yearOriList);
		Collections.sort(yearOriList);
		System.out.println("Sorted List:" +yearOriList );
		System.out.println("Is sorted or not: "+yearOriList.equals(yeartempList));

		 
		System.out.println("**********Month ascending order validation*********");
		
		 WebElement month=driver.findElement(By.cssSelector("select[placeholder='Month']"));
		 month.click();
		 Select selectmonth = new Select(month);
		 
		 System.out.println("Is multiple select :"+selectmonth.isMultiple());
		 
		 List Orimonth=new ArrayList();
		 
		List<WebElement> monthop =selectmonth.getOptions();
		System.out.println("Month size is :"+monthop.size());
		
		for(int i=1;i<monthop.size();i++)
		{
			System.out.println(monthop.get(i).getText());
		}
		
		List tempmonth =new ArrayList(Orimonth);
		Collections.sort(Orimonth);
		System.out.println("To check month sorting: "+Orimonth.equals(tempmonth));
		
        driver.quit();
        
	}

}
