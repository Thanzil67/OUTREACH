package sports;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class validatesports
{
	public static void main(String[] args) throws InterruptedException {
		
		
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.townscript.com/in/india");
	WebElement ss=driver.findElement(By.xpath("//*[@id=\"cityInput\"]"));
	ss.sendKeys("coimbatore");
	ss.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id=\"mat-dialog-0\"]/app-city-selection/div/div[2]/div[1]/div[1]/app-city-search-popup/div/div/ul/div/li[1]/span/span")).click();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
	}
	
	
}