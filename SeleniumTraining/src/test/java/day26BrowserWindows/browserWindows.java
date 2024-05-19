package day26BrowserWindows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserWindows {

	public static void main(String[] args) {
		ChromeDriver switchingWindows=new ChromeDriver();
		switchingWindows.manage().window().maximize();
		
		switchingWindows.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		switchingWindows.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		switchingWindows.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		//APPROACH 1
		
		/*
		  Set<String> allhandlesSet=switchingWindows.getWindowHandles(); //has 2 window ids
		//converting it to a list for ease of access
		  List<String> listofHandles=new ArrayList(allhandlesSet);
		
		  String parentWindowID=listofHandles.get(0);
		  String ChildWindowID=listofHandles.get(1);
		
		  switchingWindows.switchTo().window(ChildWindowID);
		*/
				
	}

}
