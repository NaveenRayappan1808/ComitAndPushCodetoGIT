package ExapmplesProgr;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class tooltipEx {

	static WebDriver driver;


	public static void main(String[] args) throws AWTException, InterruptedException {
		LoginExapmles examples= new LoginExapmles();
		//System.setProperty("webdriver.chrome.driver",
		//"C:\\Users\\navee\\Downloads\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/tool-tips");
		driver.manage().window().maximize();
		
		Actions actions = new Actions(driver);
		WebElement tooltip= driver.findElement(By.id("toolTipButton"));
		
		
		actions.moveToElement(tooltip).perform();
		WebElement toolTip1 = driver.findElement(By.xpath("//*[@id=\"toolTipButton\"]"));
		
	
		String tt = toolTip1.getText(); 
				 System.out.println("The Tooltip is: "+ tt);
		
		
		
	}

}
