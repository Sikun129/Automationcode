package Allpages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage
{
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	@FindBy(id = "container_tasks")
	private WebElement Taskbartext;
	
	@FindBy(id = "logoutLink")
	private WebElement logouttask;
	
	public Homepage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void taskmethod()
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(Taskbartext));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", Taskbartext);
	}
	
	public void lagoutmethod()
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(logouttask));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()",logouttask);
	}

}
