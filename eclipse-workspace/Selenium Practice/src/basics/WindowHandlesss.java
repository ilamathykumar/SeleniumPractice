package basics;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesss {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/");
		System.out.println(driver.getTitle() + " : This is parent window");
		
		WebElement crm = driver.findElement(By.xpath("//p[text()='CRM']"));
		crm.click();
		
		Set<String> wh = driver.getWindowHandles();
		Iterator<String> iterator = wh.iterator();
		
		String parentWindow = iterator.next();
		String childWindow = iterator.next();
		
		driver.switchTo().window(childWindow);
		
		System.out.println(driver.getTitle() + " : This is child window's title");
		
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getTitle() + " : This is parent window");
		
		WebElement search = driver.findElement(By.xpath("//button[@class ='btn btn-primary btn-lg btn-block btn-booking']"));
		search.click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		

		
	}

}
