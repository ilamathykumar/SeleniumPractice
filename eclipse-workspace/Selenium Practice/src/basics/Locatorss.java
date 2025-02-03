package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locatorss {

	public static void main(String[] args) throws InterruptedException{
System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://www.facebook.com/");
    System.out.println(driver.getTitle());
    
    WebElement email = driver.findElement(By.id("email"));
    WebElement password = driver.findElement(By.id("pass"));
    WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
    
    if(email.isDisplayed()) {
    	email.sendKeys("ABC123@gmail.com");
    	Thread.sleep(3000);
    	password.sendKeys("123");
    	
    	boolean loginCheck = login.isEnabled();
    	System.out.println(loginCheck);
    	
    	login.click();
    }else {
    	driver.close();
    }

	}

}
