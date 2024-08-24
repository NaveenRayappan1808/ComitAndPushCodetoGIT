package ExapmplesProgr;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autocomplete {
	static WebDriver driver;


	public static void main(String[] args) {
		LoginExapmles examples= new LoginExapmles();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\navee\\Downloads\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/auto-complete");
		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(450,572)", "");
		
		
	 WebElement listt= driver.findElement(By.id("tags"));
	 listt.sendKeys("basic");
			
		
		
	}

}
