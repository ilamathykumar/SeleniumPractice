package basics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class coronaVirusTester {

		public static void main(String[] args) throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.worldometers.info/world-population/");

			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@id='details-button']")).click();
			driver.findElement(By.xpath("//a[@id='proceed-link']")).click();
			//a[@id='proceed-link']

			//search.sendKeys("selenium");
			WebElement worldpopulation = driver.findElement
					(By.xpath("//div[@class='maincounter-number']"));
			String str=worldpopulation.getText();
			System.out.println(str);
			WebElement india = driver.findElement
					(By.xpath("//div[@class='maincounter-number']"));
			
		}

	}
