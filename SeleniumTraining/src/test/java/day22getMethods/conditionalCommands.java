package day22getMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class conditionalCommands {

	public static void main(String[] args) {
		ChromeDriver conditionalCom=new ChromeDriver();
		conditionalCom.manage().window().maximize();
		
		conditionalCom.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		
		//isDisplayed();		   
		     //WebElement availableOrNot=conditionalCom.findElement(By.xpath("//img[@src='https://demo.nopcommerce.com/Themes/DefaultClean/Content/images/logo']"));
             //System.out.println("Display status of logo"+availableOrNot.isDisplayed());
		//or
		   Boolean TorF=conditionalCom.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
           System.out.println(TorF);
        //isEnabled();
           Boolean enabledOR=conditionalCom.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isEnabled();
           System.out.println(enabledOR);
        //isSelected();
        //used for elements which are selectable...radio buttons, check boxes etc
           //ex: before click on the radio buttons
           WebElement maleRB=conditionalCom.findElement(By.xpath("//input[@id='gender-male']"));   
           WebElement femaleRB=conditionalCom.findElement(By.id("gender-female"));
           System.out.println(maleRB.isSelected());
           System.out.println(femaleRB.isSelected());
           //after clicking on the male radio button
           System.out.println("clicked on male RB");
           maleRB.click();
           System.out.println(maleRB.isSelected());
           System.out.println(femaleRB.isSelected());
           //after clicking on the female radio button
           System.out.println("clicked on female RB");
           femaleRB.click();
           System.out.println(maleRB.isSelected());
           System.out.println(femaleRB.isSelected());
           
	}

}
