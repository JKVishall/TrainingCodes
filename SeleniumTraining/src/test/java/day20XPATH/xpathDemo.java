package day20XPATH;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class xpathDemo {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver xpathDemo=new ChromeDriver();
		xpathDemo.manage().window().maximize();
		
		//xpathDemo.get("https://demo.opencart.com");
        
		xpathDemo.get("///C:\\Users\\vishjk\\Downloads\\test.html");
		
		//finding the element using the "inner text" used in the element
		//and then getting the text it has in it using .getText();
		System.out.println(xpathDemo.findElement(By.xpath("//a[contains(text(),'Mac')]")).getText());
		//using contains/starts-with to find partial text incase the text changes after interacting with it
		//Thread.sleep(2000);
//		xpathDemo.findElement(By.xpath("//a[contains(text(),'MacBook')]")).click();
		//xpathDemo.findElement(By.xpath("//a[text()='MacBook']")).click();
		xpathDemo.findElement(By.linkText("Mac book")).click();
		xpathDemo.findElement(By.xpath("//a[text(),'Mac']")).click();
		
		//waits
		//("//a[contains(text(),'MacBook')]")
//		WebElement element = xpathDemo.findElement(By.xpath("//a[contains(text(),'MacBook')]"));
//		WebDriverWait wait=new WebDriverWait(xpathDemo, Duration.ofSeconds(30));
//		wait.until(ExpectedConditions.elementToBeClickable(element));		
////		WebElement element = xpathDemo.findElement(By.xpath("//a[contains(text(),'MacBook')]"));
//		Actions actions = new Actions(xpathDemo);
//		actions.moveToElement(element).click().build().perform();
		
		//can use and/or to find partial text incase the text changes after interacting with it
		
		

	}

}
