package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FindElement {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",".\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://canvas.instructure.com/login/canvas");
		
		WebElement Email = driver.findElement(By.id("pseudonym_session_unique_id"));
		Email.sendKeys("abc123@gmail.com");
		WebElement Password = driver.findElement(By.id("pseudonym_session_password"));
		Password.sendKeys("123");
		WebElement Login = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div[2]/form[1]/div[3]/div[2]/button"));
		Login.click();
		
		driver.close();
		
		

	}

}
