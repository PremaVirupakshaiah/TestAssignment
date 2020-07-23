package Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScenerioFour {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\swami\\Downloads\\driver\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     
	     driver.get("http://automationpractice.com/index.php?controller=authentication");
	     driver.manage().window().maximize();
	 
		driver.findElement(By.id("email")).sendKeys("premahv3@gmail.com");
		driver.findElement(By.id("passwd")).sendKeys("Anu@123");
		Thread.sleep(2000);
		driver.findElement(By.id("SubmitLogin")).click();
		
		
	}

}
