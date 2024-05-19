package day24CheckBoxes;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBoxes {

	public static void main(String[] args) {
		
		ChromeDriver cBox=new ChromeDriver();
		cBox.manage().window().maximize();
		
		//always use implicit wait
		cBox.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		cBox.get("https://demo.automationtesting.in/Register.html");
		
		//finding one checkbox & clicking it
		   //cBox.findElement(By.xpath("//input[@id='checkbox1']")).click();
		
		//finding all checkboxes and clicking all
		List<WebElement> allCBoxes=cBox.findElements(By.xpath("//input[@type='checkbox']"));
		     for(WebElement a:allCBoxes) {
		    	 a.click();
		     }
		//clicking on specific chcboxes using normal for loop
		     for (int i=0;i<allCBoxes.size();i++) {
		    	 if(i==2) {
		    		 allCBoxes.get(i).click(); 
		    	 }
		     }
		     //in the above loop, changing the value of i when it is declared to be some other value
		     //will let the user directly click from only that checkbox num
		     //ex: if int i=4, it will only click from 5th checkbox
		     
		     //to deselect only selected checkboxes, use
		     for(int i=0;i<allCBoxes.size();i++) {
		    	 if(allCBoxes.get(i).isSelected()) {
		    		 allCBoxes.get(i).click();
		    	 }
		     }
		    
		
		

	}

}
