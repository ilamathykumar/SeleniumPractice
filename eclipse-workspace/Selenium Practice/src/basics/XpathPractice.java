package basics;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://tek-school.com/retail/");
		
		WebElement myaccount = driver.findElement(By.xpath("//span[text()='My Account']"));
		System.out.println(myaccount.isDisplayed());
		myaccount.click();
		WebElement Register = driver.findElement(By.xpath("//a[text()='Register']"));
		Register.click();
		WebElement firstname = driver.findElement(By.xpath("//input[@name = 'firstname']"));
		firstname.sendKeys("John");
		WebElement lastname = driver.findElement(By.xpath("//input[@name = 'lastname']"));
		lastname.sendKeys("Ken");
		WebElement email = driver.findElement(By.xpath("//input[@name = 'email']"));
		email.sendKeys("John123Kenn@gmail.com");
		WebElement telephone = driver.findElement(By.xpath("//input[@name = 'telephone']"));
		telephone.sendKeys("1234567");
		WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
		password.sendKeys("1***9");
		WebElement confirmpassword = driver.findElement(By.xpath("//input[@name = 'confirm']"));
		confirmpassword.sendKeys("1***9");
		
		WebElement yesbutton = driver.findElement(By.xpath("//input[@name='newsletter' and @value='1']"));
		if(!yesbutton.isSelected()) {
		yesbutton.click();
		}
		WebElement privacypolicy = driver.findElement(By.xpath("//input[@name='agree' and @value='1']"));
		if(privacypolicy.isDisplayed()) {
		privacypolicy.click();
		}
		WebElement continuebutton = driver.findElement(By.xpath("//input[@value ='Continue']"));
		continuebutton.click();
		
		
		WebElement confirmationmessage = driver.findElement(By.xpath("//h1[text()='Your Account Has Been Created!']"));
		String success = confirmationmessage.getText();
		String expectedMessage = "Your Accout Has Been Created!";
		
		if(success.equals(confirmationmessage)) {
			System.out.println("Register test passed");
		}else {
			System.out.println("Register test failed");
		}
		

	}

}
