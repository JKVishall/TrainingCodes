package day23Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitWait {

	public static void main(String[] args) {
		ChromeDriver usingSleep=new ChromeDriver();
		usingSleep.manage().window().maximize();
		
		usingSleep.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//implicit wait
		//implicit wait is applicable for all the statements in the script
		//And if an element is loaded within the given time limit,
		//the system will move on to the next statement instead of waiting till the wait limit is over
		//So, it is very useful
		usingSleep.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		usingSleep.findElement(By.name("username")).sendKeys("Admin");
		usingSleep.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		

	}

}
