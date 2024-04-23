package Hack;


import java.time.Duration;

import java.util.List;
 
import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
 
 
public class What {
 
	public static void main(String[] args) throws InterruptedException {

		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.navigate().to("https://www.townscript.com/i/event-registration-software");

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		JavascriptExecutor js=(JavascriptExecutor)driver;

//		js.executeScript("window.scrollBy(0,2500)");

		 WebElement myBookings=driver.findElement(By.xpath("//a[text()='My Bookings']"));

		 js.executeScript("arguments[0].scrollIntoView();",myBookings);

		 js.executeScript("window.scrollBy(0,-250)");

         js.executeScript("arguments[0].click();",myBookings);

		driver.findElement(By.xpath("//*[@class='truncate capitalize text-gray-800']")).click();

	    WebElement selectingLocation=driver.findElement(By.xpath("//*[@class='text-gray-800 capitalize text-sm'][text()='Bengaluru']"));

	    js.executeScript("arguments[0].click();",selectingLocation);

	    Thread.sleep(5000);

		js.executeScript("window.scrollBy(0,250)");

		driver.findElement(By.cssSelector("img[title='Sports & Fitness events']")).click();

		driver.findElement(By.cssSelector("div[eventlabel=\"list\"]")).click();

		WebElement ClickOnDate=driver.findElement(By.xpath("//span[@class='font-medium text-gray-900 ng-star-inserted'and text()='Date']"));

		js.executeScript("arguments[0].click();",ClickOnDate);

		WebElement ClickOnWeekend=driver.findElement(By.xpath("//li[text()='This Weekend']"));

		js.executeScript("arguments[0].click();",ClickOnWeekend);

		Thread.sleep(5000);

		WebElement load=driver.findElement(By.xpath("//span[text()='Load More']"));

		//WebElement load=driver.findElement(By.cssSelector("div.loadMoreBtn"));

		try {

		for(;;) {

//			if(load.getText().equalsIgnoreCase("Load More")) {

				js.executeScript("arguments[0].scrollIntoView();",load);

				js.executeScript("window.scrollBy(0,-250)");

//			    Thread.sleep(10000);

			    js.executeScript("arguments[0].click();",load);

//			    

//		} 

//			

		}

	}catch(Exception e) {}

		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

		Thread.sleep(10000);

		try {

			for(int i=0;i<10000;i++) {

				 js.executeScript("window.scrollBy(0,150)");

			}

		}

			catch(Exception e) {}

//		

		List<WebElement> dates=driver.findElements(By.cssSelector(".date"));

//		Thread.sleep(30000);

		List<WebElement> names=driver.findElements(By.cssSelector("div.event-name"));

//		Thread.sleep(20000);

		System.out.println(dates.size() + "-" + names.size());

		for(int i=0;i<names.size();i++) 

		{

			System.out.println("Event"+(i+1));

			System.out.println("Event Name : "+names.get(i).getText());

			System.out.println("Event Date : "+dates.get(i).getText());

			//Thread.sleep(2000);

		}

		System.out.println("===================================================================================================================================================");

		List<WebElement> popularCities=driver.findElements(By.xpath("//div[@class='popular-cities mt-2 w-2/3 pr-1']/ul"));

		System.out.println("Popular Cities are: ");

		for(WebElement h:popularCities) {

			System.out.println(h.getText());

		}

		System.out.println("===================================================================================================================================================");

		driver.navigate().to("https://www.townscript.com/i/event-registration-software");

		driver.findElement(By.cssSelector(".ng-isolate-scope")).click();

		driver.findElement(By.xpath("//span[@class=\"no-margin\"][text()='Continue with Google']")).click();

		WebElement email=driver.findElement(By.xpath("//input[@type='email']"));

		email.click();

		email.sendKeys("vavavckcb");

		driver.findElement(By.xpath("//span[text()='Next']")).click();

		WebElement errormsg=driver.findElement(By.cssSelector("div.Ekjuhf"));

		System.out.println("Invalid deatils error msg : " + errormsg.getText());

		driver.quit();
 
	}
 
}