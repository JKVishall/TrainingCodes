package day25AlertsandPopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class alertswithTextBox {

	public static void main(String[] args) {
		ChromeDriver alerting = new ChromeDriver();
        alerting.manage().window().maximize();
        
        // Set an explicit wait with a timeout of 15 seconds
        WebDriverWait wait = new WebDriverWait(alerting, Duration.ofSeconds(15));

        alerting.get("https://the-internet.herokuapp.com/javascript_alerts");

        // Click the "Click for JS Alert" button
        alerting.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        
        Alert aa=alerting.switchTo().alert();
        
        aa.sendKeys("yo yo");
        
        aa.accept();
       

	}

}
