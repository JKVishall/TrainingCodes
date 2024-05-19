package day20XPATH;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipKartTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver flipK=new ChromeDriver();
		flipK.get("https://www.flipkart.com/");
		flipK.manage().window().maximize();
		
		Thread.sleep(3000);
		
		flipK.findElement(By.xpath("//span[contains(@class,'_30XB9F')]")).click();
		
		
		//accessing elements which has same class name but changing element name
		//since the element location is fixed (appears at a fixed location even though the element shown varies)
		//we can access the element by class name & indexing
		    //Thread.sleep(5000);
		    //flipK.findElement(By.xpath("//div[contains(@class,'_58bkzq62 _3n8fnaug _3n8fnamv _3n8fnaf9 _3n8fna1 _3n8fna7n _58bkzq2 _1i2djtb9 _1i2djt0')]")).click();

		//accessing parent element when only child element is known
		   //flipK.findElement(By.xpath("//div[contains(@class,'_58bkzq62 _3n8fnaug _3n8fnamv _3n8fnaf9 _3n8fna1 _3n8fna7n _58bkzq2 _1i2djtb9 _1i2djt0')]/parent::*")).click();
		//accessing child element when only parent element is known
		   //flipK.findElement(By.xpath("//div[contains(@class,'_3n8fnaug _3n8fnamv _3n8fnaf9 _3n8fna1 _3n8fna7n _1i2djtb9 _1i2djt0 _1i2djt2i')]/child::div")).click();

		//Getting a list of multiple webelements with same class name and clicking them via .get().click() using lists;
//		List<WebElement> John=flipK.findElements(By.xpath("(//div[contains(@class,'_58bkzq62 _3n8fnaug _3n8fnamv _3n8fnaf9 _3n8fna1 _3n8fna7n _58bkzq2 _1i2djtb9 _1i2djt0')])[3]"));
//		System.out.println(John.size());
//		John.get(0).click();
	
		
//		List<WebElement> John=flipK.findElements(By.xpath("(//div[contains(@class,'_58bkzq62 _3n8fnaug _3n8fnamv _3n8fnaf9 _3n8fna1 _3n8fna7n _58bkzq2 _1i2djtb9 _1i2djt0')])"));
//		System.out.println(John.size());
//		John.get(3).click();
	

	}

}
