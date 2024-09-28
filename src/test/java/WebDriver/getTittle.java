package WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTittle {

	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		String tittle=driver.getTitle();
		
		//System.out.println("Tittle of this page:"+tittle);
		System.out.println("tittle of this page:"+driver.getTitle());
		driver.close();
		

	}

}
