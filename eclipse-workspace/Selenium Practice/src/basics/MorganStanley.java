package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MorganStanley {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.morganstanley.com/");
		
			Thread.sleep(5000);
		
		//WebElement ele=driver.findElement(By.xpath("//input[contains(@id,'email-subscribe')]"));
		//JavascriptExecutor	js=(JavascriptExecutor)driver;
		//js.executeScript("windows.scrollby(0,document.body.scrollHeight)");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)","");
        Thread.sleep(5000);
		//js.executeScript("arguments[0].scrollIntoView();",ele);
		//ele.sendKeys("abc@gmail.com");
		System.out.println("clicked");
		driver.close();

	}

}
