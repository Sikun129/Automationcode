package WebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Without_get_method {

	public static void main(String[] args) throws MalformedURLException 
	{
		//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.myntra.com/");
		URL m1=new URL("https://www.flipkart.com/");
		driver.navigate().to(m1);
		driver.close();

	}

}
