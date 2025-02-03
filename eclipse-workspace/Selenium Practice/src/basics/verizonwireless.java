package basics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verizonwireless {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.verizon.com/");

			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(3000);
			

			//search.sendKeys("selenium");
			// driver.findElement(By.xpath("//button[@id='gnav20-nav-toggle']")).click();
				Thread.sleep(3000);

			 driver.findElement
				(By.xpath("//a[text()='Mobile']")).click();
			System.out.println("clicked");
			 driver.findElement
				(By.xpath("//button[normalize-space(text())='Check out pricing & plan features']")).click();
				System.out.println("clicked2");

			  
			
		}

	}
