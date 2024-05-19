package day23Waits;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class usingSleep {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver usingSleep=new ChromeDriver();
		usingSleep.manage().window().maximize();
		
		usingSleep.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		usingSleep.findElement(By.name("username")).sendKeys("Admin"); //we get no such element exception, so we are using Thread.sleep() above this line
		

	}

}
