package SeleniumTraining.Day17;



import javax.annotation.concurrent.ThreadSafe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		//Opening chrome app
		WebDriver drive1=new ChromeDriver();
		//Opening a website
		drive1.get("https://opensource-demo.orangehrmlive.com/");
		//Maximizing the window size
		drive1.manage().window().maximize();
		
		Thread.sleep(5000);
		
		//Giving User Name
		
		//drive1.findElement(By.name("username"));
		//the above method returns an element of type WebElement
		//so, we can store the returned element uing a variable of type WebElement
		///WebElement userName1 = drive1.findElement(By.name("username"));
		//Now we can perform opertaions on the found WebElement
		///userName1.sendKeys("Admin");
		
		//or we can do line 21&23 in a fingle line
		drive1.findElement(By.name("username")).sendKeys("Admin");
		
		//Giving password
		drive1.findElement(By.name("password")).sendKeys("admin123");
		
		//Clicking login button
		drive1.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		//Fetching the title of a page
		//IMPORTANT
		//Need to use .getTitle(); to find the title of a page.Returns a string value
		String pageTitle=drive1.getTitle();
		
		String expectedTitle="OrangeHRM";
		
		if(pageTitle.equals(expectedTitle)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		/*In the above page title comparison, all pages in the website seem to have same title,
		 * so, we can't validate if we are in the correct page or not
		 * thus, we are using the below to validate the page header
		 * which is being displayed in UI, using .getText();
		 */
		
		
		//comparing page header instead of title
		//.getText(); is used to return whatever the element has as a string
		//so, we store it in a String variable
		//String a = drive1.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		
		/***VERY IMPORTANT
		 * We can't have double quotes inside double quotes in java.
		 * So, since XPATH seems to have double quotes in it(line 61),
		 * we need to convert it into single quotes(line 39&68) for the code to work
		 */
		
		Thread.sleep(3000);
		String a = drive1.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
		String exp="Joshboard";
		
		if(a.equals(exp)) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		
		//to close a browser
		drive1.quit();
		
		
		
		
		
		
	}

}
