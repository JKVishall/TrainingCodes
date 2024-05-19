package day23Waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicitWait {

	public static void main(String[] args) {
		ChromeDriver usingSleep=new ChromeDriver();
		usingSleep.manage().window().maximize();
		
		usingSleep.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//declaring explicit wait
		WebDriverWait myWait=new WebDriverWait(usingSleep, Duration.ofSeconds(10)); 
		
		//explicit wait is element specific, so we need to apply it to needed elements manually
		WebElement uName=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		uName.sendKeys("Admin");
		//the above condition returns Ture or False
		//usingSleep.findElement(By.name("username")).sendKeys("Admin");
		
		WebElement pWord=myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		pWord.sendKeys("admin123");
		//usingSleep.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		

	}

}
