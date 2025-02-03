 package basics;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://omayo.blogspot.com/");
		
		//Select class example
		/*
		 * WebElement dropdown = driver.findElement(By.xpath("//select[@id='drop1']"));
		 * Select slt = new Select(dropdown); //slt.getFirstSelectedOption();
		 * List<WebElement> dd = slt.getOptions(); for (int i = 0; i < dd.size(); i++) {
		 * System.out.println(dd.get(i).getText()); } Actions action = new
		 * Actions(driver); WebElement button =
		 * driver.findElement(By.xpath("//button[text()='Button2']"));
		 * action.moveToElement(button).build().perform();
		 * action.doubleClick(button).build().perform(); Thread.sleep(5000);
		 * System.out.println("double clicked"); //
		 * action.contextClick(button).build().perform(); Thread.sleep(5000);
		 * System.out.println("right clicked");
		 */
		  
		  List<WebElement> table = driver.findElements(By.xpath("//table[@id='table1']//tr//td"));
		  for (int j = 0; j < table.size(); j++) {
			  System.out.print(table.get(j).getText() +" ");
		   }
			/*
			 * System.out.println(table.get(1).getText());
			 * System.out.println(table.get(2).getText());
			 */
	        
	        
		  
		 // JavascriptExecutor js = (JavascriptExecutor) driver;
		 // js.executeScript("document.queryselector(\"button[@id='but1']\").disabled=false");
		 //  driver.findElement(By.xpath("button[@id='but1']")).click();
		 // System.out.println("disabled clicked");
		 // Thread.sleep(5000);
			 // driver.switchTo().frame("iframe2");
			  //System.out.println("switched to frame 1");
		  //driver.switchTo().frame("aswift_1");
		  //System.out.println("switched to frame");
		 // WebElement download = driver.findElement(By.xpath("//button[text()='Download Here']"));
		 // download.click();
	        
	        WebElement home= driver.findElement(By.cssSelector("span[id=home]"));
	        home.click();
	        Thread.sleep(5000);
	        System.out.println("clicked..");
		  driver.close();



			/*
			 * driver.navigate().to(
			 * "https://jqueryui.com/resources/demos/droppable/default.html"); WebElement
			 * drag = driver.findElement(By.id("draggable")); WebElement drop =
			 * driver.findElement(By.id("droppable")); action.dragAndDrop(drag,
			 * drop).build().perform();
			 */
		 
		


	}

}
