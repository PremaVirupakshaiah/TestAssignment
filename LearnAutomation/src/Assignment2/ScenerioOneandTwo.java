package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScenerioOneandTwo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swami\\Downloads\\driver\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("http://automationpractice.com/index.php");
	    // driver.manage().window().maximize();
	     
	     driver.manage().window().maximize();
	     WebElement Sproduct=driver.findElement(By.name("search_query"));
    Sproduct.sendKeys("Printed Dress");
    driver.findElement(By.name("submit_search")).click();
      Thread.sleep(2000);
   driver.findElement(By.linkText("Add to cart")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//span[@title='Close window']")).click();
  driver.findElement(By.xpath("//a[@title='View my shopping cart']")).click(); 
	     
	       
//	     
//	     JavascriptExecutor js=(JavascriptExecutor) driver;
//		     js.executeScript("window.ScrollTo(0,400));
//		    
		
		
		
		
	}

}
