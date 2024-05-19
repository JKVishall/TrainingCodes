package day27WebTables;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicTablewithPagination {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver dynamicTableDeal=new ChromeDriver();
		dynamicTableDeal.manage().window().maximize();
		
		dynamicTableDeal.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		dynamicTableDeal.get("https://demo.opencart.com/admin/");
		
		dynamicTableDeal.findElement(By.name("username")).sendKeys("demo");
		dynamicTableDeal.findElement(By.name("password")).sendKeys("demo");
		dynamicTableDeal.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		dynamicTableDeal.findElement(By.xpath("//button[@class='btn-close']")).click();
		
		dynamicTableDeal.findElement(By.xpath("//li[@id='menu-customer']//a[@class='parent collapsed']")).click();
		
		dynamicTableDeal.findElement(By.xpath("//ul[@id='collapse-5']//a[text()='Customers']")).click();
		
		//Finding the number of pages in the dynamic table
		String A=dynamicTableDeal.findElement(By.xpath("//div[text()='Showing 1 to 10 of 16280 (1628 Pages)']")).getText();
		//In line 28, we are getting the string which shows page details
		//Now, we will extract the page number from this string
		
		int b=A.indexOf('(')+1; //gives index number of page number beginning
		int c=A.indexOf("Pages")-1; //gives index number of page number ending
		
		int totPages=Integer.parseInt(A.substring(b,c)); 
		//A.substring(b,c). From string A, substring(b,c) will extract the particular index from b to c
		//it is then converted to int using Integer.parseInt
		System.out.println(totPages);
		
		//Now we need to loop through these pages
		//p=1 since page numbers start from 1
		for(int p=1;p<=totPages;p++) {
			
			    if(p>1) {
				WebElement pageTo= dynamicTableDeal.findElement(By.xpath("//ul[@class='pagination']//li//a[text()="+p+"]"));
				pageTo.click();
			    }
				//dynamicTableDeal.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+p+"]"));	

				//inorder to use number variables in x path, we need give a + before & after the variable name as shown above in text()="+p+"
				
//				if(totPages>1)
//				{
//					WebElement active_Page=dynamicTableDeal.findElement(By.xpath("//ul[@class='pagination']//li//*[text()="+p+"]"));	
//					System.out.println(" Active Page : "+active_Page.getText());
//					active_Page.click();
//					Thread.sleep(2000);
//				}
					
		}

	}

}
