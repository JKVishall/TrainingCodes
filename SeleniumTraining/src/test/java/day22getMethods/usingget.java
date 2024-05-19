package day22getMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingget {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver getUsage=new ChromeDriver();
		//get(URL);
		getUsage.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		getUsage.manage().window().maximize();
		
		//getTitle();
		System.out.println("Prints title of the current page we are in"+getUsage.getTitle());
		
		//getCurrentUrl();
		System.out.println("Prints the URL of the page we are in"+getUsage.getCurrentUrl());
		
		//getPageSource();
		//returns the HTML of the current page
		//Can also rightclick on webpage & click View Page Source instead
		   //System.out.println(getUsage.getPageSource());
		//we can store this HTML in a string & then use contains method to check if 
		//what we need is available in the HTML or not
		
		//getWindowHandle();
	    //returns the current window's ID for user to use
		//This window ID changes every time we reopen the same window 
		   //System.out.println(getUsage.getWindowHandle()); //3D41E790C71C066AE97096E353A6A968
		
		//getWindowHandles();
		//To get ID of all active windows in a browser
		//Used to help in switching between multiple windows easily
		Thread.sleep(3000);
		getUsage.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
		//returns a Set collection instead of List collection, since List can have duplicates
		//but Set can't store duplicates
		Set<String> handlesList=getUsage.getWindowHandles();
		//Set doesn't support indexing like List
		//so, we need to write a loop instead of directly finding size & indexing
		for(String windowIDs:handlesList) {
			System.out.println(windowIDs);
		}
		

	}

}
