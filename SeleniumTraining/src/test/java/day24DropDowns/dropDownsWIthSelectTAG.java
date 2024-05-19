package day24DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownsWIthSelectTAG {

	public static void main(String[] args) throws InterruptedException {
		
		//DROPDOWNS WITH SELECT TAG
		//we can use Select class for handling dropdowns with SELECT tag
		  ChromeDriver dWithSelectTag=new ChromeDriver();
		  dWithSelectTag.manage().window().maximize();
		
		  dWithSelectTag.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		  dWithSelectTag.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		  WebElement drp=dWithSelectTag.findElement(By.xpath("//Select[@id='country-list']"));
		  //inside a dropdown there will multiple webelements available
		  //need to use Select object to capture all the elements available inside dropdown
		
		  Select drpAll=new Select(drp);
		  
		  //1.selecting by visible text
		  drpAll.selectByVisibleText("Brazil");
		  
		  //2.selecting by value
		  drpAll.selectByValue("2");
		  
		  //3.selecting by index number
		  drpAll.selectByIndex(4);
		  
		  //Finding total num of options count
		  List<WebElement> allOptions=drpAll.getOptions();
		  System.out.println(allOptions.size());
		  
		  for(int i=0;i<allOptions.size();i++) {
			  System.out.println( allOptions.get(i).getText() );
		  }
		
		
		//DROPDOWN WITHOUT SELECT TAG	
		//ChromeDriver dNoSelectTag = new ChromeDriver();
		
		
		

	}

}
