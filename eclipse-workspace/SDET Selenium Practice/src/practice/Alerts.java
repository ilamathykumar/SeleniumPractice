package practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.sun.org.apache.bcel.internal.classfile.Utility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver",
		// ".\\drivers\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		ChromeOptions ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
	WebDriver driver = new ChromeDriver(ops);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		// 1. Alert window with OK button
		/*
		 * driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click()
		 * ; Thread.sleep(5000); driver.switchTo().alert().accept();
		 * 
		 * // 2. Alert Window with TWO Buttons OK and CANCEL
		 * driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click
		 * (); // driver.switchTo().alert().accept();
		 * driver.switchTo().alert().dismiss();
		 */

		// 3.
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		alert.sendKeys("welcome");
		alert.accept();
		
		
		
	
		
		
		
	}

}
