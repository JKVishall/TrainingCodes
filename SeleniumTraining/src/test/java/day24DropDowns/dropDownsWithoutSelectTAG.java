package day24DropDowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropDownsWithoutSelectTAG {

	public static void main(String[] args) {
		
		//Called as BootStrap Demo
		ChromeDriver noSelectTagDD=new ChromeDriver();
		noSelectTagDD.manage().window().maximize();
		
		noSelectTagDD.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		noSelectTagDD.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		
		  //noSelectTagDD.findElement(By.xpath("//button[@class='multiselect dropdown-toggle btn btn-default']")).click();
		//Or
		    noSelectTagDD.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click();
		    
		    List<WebElement> jj=noSelectTagDD.findElements(By.xpath("//input[@type='checkbox']"));
		    for(int i=0;i<jj.size();i++) 
		    {
		    	jj.get(i).click();
		    	
		    }	    
	}

}
