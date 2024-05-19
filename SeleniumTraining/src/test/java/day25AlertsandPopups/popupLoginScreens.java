package day25AlertsandPopups;

import org.openqa.selenium.chrome.ChromeDriver;

public class popupLoginScreens {

	public static void main(String[] args) {
		
		ChromeDriver gg=new ChromeDriver();
		gg.manage().window().maximize();
		
		/*The URL is
		 * https://the-internet.herokuapp.com/basic_auth
		 * But, soon as we open the URL, instead of opening the website, it gives us a pop-up,
		 * which requires user name & password
		 * So, we need to give username & PW alongside the URL inorder for it to work,
		 * since we can't inspect pop-up elements
		 * The below is the format in which we need to give the  URL & PW
		 * after https://, give username
		 * & then put a colon & givve password
		 * & then put @ and then give the site URL
		 * Shown below
		 */
		gg.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		

	}

}
