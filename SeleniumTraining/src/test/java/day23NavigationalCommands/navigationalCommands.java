package day23NavigationalCommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class navigationalCommands {

	public static void main(String[] args) {
		ChromeDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		
		d1.get("https://www.flipkart.com/");
		d1.get("https://www.amazon.com");
		
		//navigate back to previous page
		d1.navigate().back();
		//navigate to old page
		d1.navigate().forward();
		
		//refresh page
		d1.navigate().refresh();

	}

}
