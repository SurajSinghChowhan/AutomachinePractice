package SeleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suraj\\Downloads\\newneee\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		driver.navigate().to("http://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//a[text()='Checkboxes']")).click();
		driver.findElement(By.xpath("//form/input[1]")).click();
		driver.findElement(By.xpath("//form/input[2]")).click();

		
	}
	
	

}
