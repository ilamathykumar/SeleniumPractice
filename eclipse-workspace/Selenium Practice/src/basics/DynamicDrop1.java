package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDrop1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.aa.com/");
        
        WebElement from = driver.findElement(By.xpath("//input[@id='reservationFlightSearchForm.originAirport']"));
        from.clear();
        from.sendKeys("sacra");
        
        List<WebElement> depart = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
        
        for(WebElement departure:depart) {
        	if(departure.getText().contains("SAC")) {
        		departure.click();
        		break;
        	}
        }
	}

}
