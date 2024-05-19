package day23Waits;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class fluentWait {

	public static void main(String[] args) {
		ChromeDriver usingSleep=new ChromeDriver();
		usingSleep.manage().window().maximize();
		
		usingSleep.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		FluentWait Josh=new FluentWait(usingSleep);
		Josh.withTimeout(Duration.ofSeconds(30));
		Josh.pollingEvery(Duration.ofSeconds(3));
		Josh.ignoring(NoSuchElementException.class);
		//usingSleep.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement uName=(WebElement)Josh.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		uName.sendKeys("Admin");
		//usingSleep.findElement(By.name("username")).sendKeys("Admin");

	}

}
