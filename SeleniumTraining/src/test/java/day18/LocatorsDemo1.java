package day18;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {
		ChromeDriver locatorsTest=new ChromeDriver();
		locatorsTest.manage().window().maximize();
		
		locatorsTest.get("");
		//https://automationpractice.com/index.php NOT WORKING ANYMORE
		
		//VERY IMPORTANT
		/*in case we need to find multiple webelements at the same time,
		 * we can do so by finding element by className
		 * Since we are finding multiple elements, we need to use findElements instead if findElement
		 * and since we are have multiple web elements returned, we need to save it in a list
		 * The list is of WebElement type, so we need to give it in this format
		 * List<WebElement> 
		 * the <WebElement> being the return type and can vary 
		 * HINT: we can find the return type by hovering over findElements  
		 */
		List<WebElement> Jo=locatorsTest.findElements(By.className("homeslider-container"));
		int sizeOfList=Jo.size();
		
		
		//Finding number of images in a page
		//can use tagname since all images have the same tagname, img
		//need to use findElements instead of findElement
		List<WebElement> imgs=locatorsTest.findElements(By.tagName("img"));
		int numofImages=imgs.size();
		
		//Finding total number of links
		//tagName a means they are links
		

	}

}
