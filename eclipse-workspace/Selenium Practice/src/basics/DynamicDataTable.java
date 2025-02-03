package basics;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DynamicDataTable {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.cosmocode.io/automation-practice-webtable/");
		Thread.sleep(5000);
	/*	int rowCount=driver.findElements(By.xpath("//table[@id='countries']//tr")).size();
		System.out.println(rowCount);
		int columnsCount=driver.findElements(By.xpath("//table[@id='countries']//tr[1]//td")).size();
		System.out.println(columnsCount);
		for(int i=2;i<=rowCount;i++) {
			System.out.println(i+":");
			for(int j=2;j<=columnsCount;j++) {
				String value=driver.findElement(By.xpath("//table[@id='countries']//tr["+i+"]//td["+j+"]")).getText();
			System.out.println(value);
			}*/
			
			 List<WebElement> table = driver.findElements
					 (By.xpath("//table[@id='countries']//tr//td"));
			  for (int i = 0; i < table.size(); i++) {
				  System.out.println(table.get(i).getText() +" ");
			   }
		}
		
		
		
		
	}


