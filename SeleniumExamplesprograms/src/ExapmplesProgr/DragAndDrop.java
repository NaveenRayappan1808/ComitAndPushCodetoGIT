package ExapmplesProgr;

import java.awt.AWTException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {


	static WebDriver driver;


	public static void main(String[] args) throws AWTException, InterruptedException {
		LoginExapmles examples= new LoginExapmles();
		//System.setProperty("webdriver.chrome.driver",
		//"C:\\Users\\navee\\Downloads\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		
		WebDriverWait webdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
		

		JavascriptExecutor executor = (JavascriptExecutor) driver ;
		executor.executeScript("window.scroll(0,250)", "");
		
		WebElement inter= driver.findElement(By.xpath
				("//*[@id=\"app\"]/div/div/div/div[1]/div/div/div[5]/span/div/div[1]"));
		inter.click();
		
		 WebElement item3Click= driver.findElement(By.id("item-3"));
		 item3Click.click();
		 
		 JavascriptExecutor executor1 = (JavascriptExecutor) driver ;
			executor1.executeScript("window.scroll(0,100)", "");
		 
		WebElement drag= driver.findElement(By.id("draggable"));
		
		WebElement drop= driver.findElement(By.id("droppable"));
		
		Actions actions= new Actions(driver);
		
		//actions.clickAndHold(drag).moveToElement(drop).release(drop).build().perform();
		
		actions.dragAndDrop(drag, drop).build().perform();
		
		
		 

	}
}