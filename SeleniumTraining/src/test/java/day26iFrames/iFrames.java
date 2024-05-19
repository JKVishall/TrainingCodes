package day26iFrames;

import org.openqa.selenium.chrome.ChromeDriver;

public class iFrames {

	public static void main(String[] args) {
		 ChromeDriver frms=new ChromeDriver();
		 frms.manage().window().maximize();
		 
		 frms.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		 
		 frms.switchTo().frame("org.openqa.selenium");
		 
		 ///not working///site changed

	}

}
