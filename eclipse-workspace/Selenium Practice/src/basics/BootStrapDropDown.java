package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
        // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
         //driver.manage().window().maximize();
         driver.get("http://www.hdfcbank.com");
         
	}

}
