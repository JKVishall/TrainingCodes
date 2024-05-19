package day25AlertsandPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alerts {

	public static void main(String[] args) {
//		ChromeDriver alerting=new ChromeDriver();
//		alerting.manage().window().maximize();
//		
//		alerting.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		
//		alerting.get("https://the-internet.herokuapp.com/javascript_alerts");
//		
//		//alerting.findElement(By.linkText("Click for JS Alert")).click();
//		alerting.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		
//		//We need to use SwitchTo().alert(); method to switch our control to the popped up alert & then we can act on it
//		//Alert is a pre-defined class in which alert windows will be stored 
//		Alert alertwindow=alerting.switchTo().alert();
//		alertwindow.accept();
		
		ChromeDriver alerting = new ChromeDriver();
        alerting.manage().window().maximize();
        
        // Set an explicit wait with a timeout of 15 seconds
        WebDriverWait wait = new WebDriverWait(alerting, Duration.ofSeconds(15));

        alerting.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Click the "Click for JS Alert" button
        alerting.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
        
        //We can close it directly by
        alerting.switchTo().alert().accept();
        //Or
        // Wait for the alert to be present
        Alert alertWindow = wait.until(ExpectedConditions.alertIsPresent());

        // accept the alert
        alertWindow.accept();

	}

}
