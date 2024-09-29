package Allpages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Loginpage
{
	public WebDriver driver;
	public WebDriverWait wait;
	public JavascriptExecutor js;
	
	@FindBy(id = "username")
	private WebElement usernametext;
	
	@FindBy(name = "pwd")
	private WebElement passwordtext;
	
	@FindBy(id = "keepLoggedInCheckBox")
	private WebElement keepmelogin;
	
	@FindBy(xpath = "//div[text()='Login ']")
	private WebElement loginbutton;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void login()
	{
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(usernametext));
		usernametext.sendKeys("sahoosatya0808@gmail.com");
		
		wait=new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.visibilityOf(passwordtext));
		passwordtext.sendKeys("12345678");
		
		wait.until(ExpectedConditions.visibilityOf(keepmelogin));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", keepmelogin);
		
		wait.until(ExpectedConditions.visibilityOf(loginbutton));
		js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", loginbutton);
		
		
	}

}
