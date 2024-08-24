package ExapmplesProgr;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.PointerInput.PointerEventProperties;

public class LoginExapmles {

	static WebDriver driver;

	public void scrollDown()
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
	}

	public static void main(String[] args) {
		LoginExapmles examples= new LoginExapmles();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\navee\\Downloads\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


		String currentURL =	 driver.getCurrentUrl();
		System.out.println("The current URL is: " + currentURL);

		examples.scrollDown();
		String currentWindow=driver.getWindowHandle();
		WebElement MultipleWindowButton=  driver.findElement(By.id("windowButton"));		
		MultipleWindowButton.click();
		Set<String> multipleWindow = driver.getWindowHandles();

		for (String newWindow : multipleWindow) {
			if(!newWindow.equals(currentWindow))
			{
				driver.switchTo().window(newWindow);

			}

		}
		String currentURL1 =	 driver.getCurrentUrl();
		System.out.println("The current URL is: " + currentURL1);
		int size=multipleWindow.size();
		System.out.println("The number of windows opened is: " +size);


	}
}

