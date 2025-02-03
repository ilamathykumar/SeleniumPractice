package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsPrac1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://www.tek-school.com/retail/");
        
        List<WebElement> weblinks = driver.findElements(By.tagName("div"));
        for(WebElement links : weblinks) {
        	System.out.println(links.getAttribute("value"));
        }
        

	}

}
