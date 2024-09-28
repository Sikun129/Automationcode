package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Validate 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		String tittle=driver.getTitle();
		//if(tittle.equals("YouTube"))
		
		//if(tittle.equalsIgnoreCase("YouTube"))
		
		//if(tittle.contains("You"))
		
		if(tittle.contentEquals("YouTube"))
			System.out.println("tittle is matching");
		else
			System.out.println("tittle is not matching");
		driver.close();
		
	}

}
