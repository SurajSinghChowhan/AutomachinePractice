package SeleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns2 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suraj\\Downloads\\newneee\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		driver.navigate().to("https://www.facebook.com/signup");
		driver.findElement(By.name("firstname")).sendKeys("Suraj Singh Chowhan");
		driver.findElement(By.name("lastname")).sendKeys("chowhan");
		
		WebElement Day = driver.findElement(By.cssSelector("select#day"));
		WebElement Month = driver.findElement(By.cssSelector("select#month"));
		WebElement Year = driver.findElement(By.cssSelector("select#year"));
		
		Day_Selection( Day, "9");
		Month_Selection(Month, "Aug");
		Year_Selection(Year, "1998");
		
		driver.quit();


	}
	
	public static void Day_Selection(WebElement element, String i) 
	{
		Select New = new Select(element);
		New.selectByVisibleText(i);
		
	}
	public static void Month_Selection(WebElement element, String month) {
		Select New1 = new Select(element);
		New1.selectByVisibleText(month);
	}

	public static void Year_Selection(WebElement element, String year) {
		Select New2 = new Select(element);
		New2.selectByVisibleText(year);
	}
	

}
