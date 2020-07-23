package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ScenerioThree {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swami\\Downloads\\driver\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("http://automationpractice.com/index.php");
	    driver.findElement(By.linkText("More")).click();
	    Thread.sleep(2000);
	    WebElement Quantity= driver.findElement(By.name("qty"));
	    Quantity.findElement(By.xpath("//a[@class='btn btn-default button-plus product_quantity_up']")).click();
	    //Quantity.findElement(By.xpath("//a[@class='btn btn-default button-minus product_quantity_down']")).click();
	    
   WebElement size=driver.findElement(By.name("group_1"));
   Select select=new Select(size);
   select.selectByValue("3");
 
	    driver.findElement(By.xpath("//a[@name='Orange']")).click();
	    driver.findElement(By.xpath("//a[@name='Blue']")).click();
	    
	    driver.findElement(By.name("Submit")).click();
	    
	    driver.close();
	
	    
	    
	    
  }

}
