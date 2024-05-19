package SeleniumTraining.Day17;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentDay17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver assignment=new ChromeDriver();
		assignment.manage().window().maximize();
		
		assignment.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		//Entering emil id
		assignment.findElement(By.name("Email")).clear();
		assignment.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
		
		//Entering password
		assignment.findElement(By.name("Password")).clear();
		assignment.findElement(By.name("Password")).sendKeys("admin");
		
		assignment.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		
		//Verifying if page TITLE matches with our expected title name
		//IMPORTANT
		//Need to use .getTitle(); to find the title of a page.Returns a string value
		String b=assignment.getTitle();
		System.out.println(b);
		String bExpec="Dashboard / nopCommerce administration";
		
		if(b.equals(bExpec)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
		//Verifying if the page header matches with our expected header name
		String a=assignment.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		String expec="Dashboard";
		
		if(a.equals(expec)) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		assignment.quit();

	}

}
