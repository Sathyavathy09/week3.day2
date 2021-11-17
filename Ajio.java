package week3.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get(" https://www.ajio.com/");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//input[@placeholder=\"Search AJIO\"]"));
		element.sendKeys("bags");
		element.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		String number = driver.findElement(By.className("length")).getText();
		System.out.println(number);
		System.out.println("*****Brands******");
		
		List <WebElement> brand = driver.findElements(By.className("brand"));
		
		for (WebElement eachElement : brand) {
			String str = eachElement.getText();
			System.out.println(str);
			
		}
		
		System.out.println("*****Bag Names******");
		
		List <WebElement> bags = driver.findElements(By.className("name"));
		
		for (WebElement eachElement : bags) {
			String str = eachElement.getText();
			System.out.println(str);
			
		}
		
		

	}

}
