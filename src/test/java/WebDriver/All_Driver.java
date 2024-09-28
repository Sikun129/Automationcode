package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class All_Driver 
{
	public static void main(String[] args) 
	{
		System.setProperty("webDriver.chrome.driver","./drivera/chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		
		System.setProperty("webDriver.edge.driver","./drivera/msedgedriver.exe");
		WebDriver driver2=new EdgeDriver();
		
		System.setProperty("webDriver.gecko.driver","./drivera/geckodriver.exe");
		WebDriver driver3=new FirefoxDriver();
		
		
		
		
	}

}
