package day26iFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class frameInsideFrame {

	public static void main(String[] args) {
		ChromeDriver frmInfrm=new ChromeDriver();
		frmInfrm.manage().window().maximize();
		
		frmInfrm.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		frmInfrm.get("https://ui.vision/demo/webtest/frames/");
		
		//before accessing an element inside a frame, we need to switch to the frame first
		/*since, we don;t directly see the frame name or id,
		 *we need to get the frame via xpath and the store it in a webelement
		 * like in line 25 & then switch to it like in line26
		 */
		
		WebElement f1=frmInfrm.findElement(By.xpath("//frame[@src='frame_1.html']"));
		frmInfrm.switchTo().frame(f1);
		/*once switching is done, we can interact with that element
		 */
		WebElement fnf=frmInfrm.findElement(By.xpath("//input[@name='mytext1']"));
		fnf.click();
		fnf.sendKeys("JJ");
		//Now, we need to come out of this frame inorder to interact with other frames
		frmInfrm.switchTo().defaultContent();
		
		//WORKING WITH FRAME3 WHICH HAS A FRAME INSIDE IT
		
		WebElement f3=frmInfrm.findElement(By.xpath("//frame[@src='frame_3.html']"));
		frmInfrm.switchTo().frame(f3);
		
		WebElement fff=frmInfrm.findElement(By.xpath("//input[@name='mytext3']"));
		fff.click();
		fff.sendKeys("move to the frame inside frame 3");
		
		
		WebElement jj=frmInfrm.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
		frmInfrm.switchTo().frame(jj);
		//OR
		//since we have only one inner frame, we can directly index it
		   //frmInfrm.switchTo().frame(0);
		
//		WebDriverWait wait = new WebDriverWait(frmInfrm, Duration.ofSeconds(30));
//		WebElement elementToClick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='x0k1lc MbhUzd']")));
//		elementToClick.click();
		
		frmInfrm.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[1]")).click();
		
		WebElement jij=frmInfrm.findElement(By.xpath("//div[@class='MocG8c HZ3kWc mhLiyf LMgvRb KKjvXb DEh1R']"));
		jij.click();
		jij.sendKeys("Well");
		jij.sendKeys(Keys.RETURN);
		//jij.click();
		
		frmInfrm.findElement(By.xpath("//span[@class='e19J0b CeoRYc']")).click();
		
		
		
		
		

	}

}
