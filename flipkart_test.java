package JAVAPAKAGE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flipkart_test {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
       WebElement searchbox=driver.findElement(By.name("q"));
       searchbox.sendKeys("Ambrane Crest");
       searchbox.submit();
       driver.findElement(By.xpath("//div[@data-id='SMWGHJKRBGFUHHKK']//a[@title='Ambrane Crest 1.39\" display 360*360 High Resolution, 500 Nits Brightness with BT Calling Smartwatch'][contains(text(),'Ambrane Crest 1.39\" display 360*360 High Resolutio')]")).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']//*[name()='svg']")).click();
       Thread.sleep(3000);
		
	}

}
