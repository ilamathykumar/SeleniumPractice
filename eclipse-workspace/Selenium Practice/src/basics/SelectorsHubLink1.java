package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectorsHubLink1 {

	public static void main(String[] args) {
           System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
           WebDriver driver = new ChromeDriver();
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
           driver.get("https://selectorshub.com/xpath-practice-page/");
           
           driver.findElement(By.xpath("(//*[name()='svg'])[1]")).click();
           driver.findElement(By.xpath("//input[@placeholder='First Enter name']")).sendKeys("sanjay");
           
           JavascriptExecutor js = (JavascriptExecutor)driver;
           js.executeScript("document.querySelector(\"input[placeholder='Enter Last name']\").disabled=false");
           driver.findElement(By.xpath(" //input[@placeholder='Enter Last name']")).sendKeys("kumar");
           
	}

}
