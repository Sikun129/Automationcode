package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close_quit {

	public static void main(String[] args)
	{
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		//driver.close();  //:-perticular of browser
		
		driver.quit();//:-close all browser
	}

}
