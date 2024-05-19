package day27WebTables;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class staticTable {

	public static void main(String[] args) {
		ChromeDriver staticTableDeal=new ChromeDriver();
		staticTableDeal.manage().window().maximize();
		
		staticTableDeal.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		staticTableDeal.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> allRows=staticTableDeal.findElements(By.xpath("//table[@name='BookTable']//tbody//tr"));
		System.out.println("number of rows: "+allRows.size());
		//the above code will get all the rows and stores it in a list
		//To only store a specific row, we need to index the tr which is row tag name like
		//  //table[@name='BookTable']//tbody//tr[1] which will only capture the 1st row
		
		
		/*1st for is to loop through each row
		 * once we are in each row, we need to get the column values in that row
		 * so, we are using another List to find elements with th & td tag,
		 * since th gives table header & td gives table data and both are column data
		 * once we are in each row and their specific column data is captured,
		 * we loop through them and print all column data
		 */
		for(WebElement a:allRows) {
			List<WebElement> allColumns=a.findElements(By.tagName("th"));
			for(WebElement b:allColumns) {
				System.out.print(b.getText()+" ");
			}
			List<WebElement> allColumns1=a.findElements(By.tagName("td"));
			for(WebElement c:allColumns1) {
				System.out.print(c.getText()+" ");
			}
			System.out.println();
			
		}
		
		/*Alternatively, we can just enter row & column num (tr & td) by giving their index num
		 * like //table[@name='BookTable']//tbody//tr[7]//td[1]
		 * to get a specific cell value directly & convert it into text & print as needed 
		 */

		

	}

}
