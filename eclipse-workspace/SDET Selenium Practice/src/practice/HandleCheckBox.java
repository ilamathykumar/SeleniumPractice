package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args) {
         System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.get("https://itera-qa.azurewebsites.net/home/automation");
         
         //Case 1: Select One CheckBox
         //driver.findElement(By.xpath("//input[@id='monday']")).click();
	   
         
         //Case 2:Select All CheckBoxes
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox' and contains(@id,'day')]"));
         /*System.out.println(checkBoxes.size());
         for(WebElement chBox:checkBoxes) {
        	 chBox.click();
         }*/
         
        //Case 3:Select Two CheckBoxes of Choice
         /*for(WebElement chbox:checkBoxes) {
        	 String checkboxname = chbox.getAttribute("id");
        	 if(checkboxname.equals("monday") || checkboxname.equals("tuesday")) {
        		chbox.click(); 
        		 
        	 }
         }*/
	
         //Case 4: Select last two CheckBoxes
         /*int totalCheckBoxes = checkBoxes.size();
            for(int i=totalCheckBoxes - 2; i<totalCheckBoxes; i++) {
            	checkBoxes.get(i).click();
            }*/
        
        //Case 5: Select first two CheckBoxes
        
        for(int i = 0; i < checkBoxes.size();i++) {
        	if(i<=2) {
        		checkBoxes.get(i).click();
        	}
        }
         
	}

}
