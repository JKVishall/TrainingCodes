package day29MouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseHOVER {

	public static void main(String[] args) {
		ChromeDriver hov=new ChromeDriver();
		hov.manage().window().maximize();
		
		hov.get("https://demo.opencart.com/");
		
		WebElement desktop=hov.findElement(By.xpath("//a[text()='Desktops']"));
		//if we are using text() xpath and that text has spaces in it, we need to use
		//normalize-space() instead of text(), as shown below
		WebElement mac=hov.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		Actions desktopType=new Actions(hov);
		
		//to use Actions class, we need to use .perform for it to be executed
		desktopType.moveToElement(desktop).moveToElement(mac).click().perform();
		

	}

}
