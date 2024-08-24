package ExapmplesProgr;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesExamples {

	static WebDriver driver;


	public static void main(String[] args) {
		LoginExapmles examples= new LoginExapmles();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\navee\\Downloads\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/broken");
		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(450,572)", "");

		WebElement brokenImage = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/img[2]"));

		if (brokenImage.getAttribute("naturalWidth").equals("0"))
		{
			System.out.println("This is Broken image");
		}
		else
		{
			System.out.println("This is not Broken image");
		}
		
		List<WebElement> allLink=  driver.findElements(By.tagName("a"));
		int size =allLink.size();
		System.out.println("The no.of link is: " +size);

		WebElement brokenLink = driver.findElement(By.linkText("Click Here for Broken Link"));
		brokenLink.click();

		String title= driver.getTitle();
		if(title.contains("The Internet"))
		{
			System.out.println("Broken Link");
		}
		
		driver.navigate().back();
		
		WebElement whereToGo= driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/a[1]"));
		String value = whereToGo.getAttribute("href");
		System.out.println("Link to go: " + value);
	}

}
