package ExapmplesProgr;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadAFile {

	static WebDriver driver;


	public static void main(String[] args) {
		LoginExapmles examples= new LoginExapmles();
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\navee\\Downloads\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/upload-download");
		driver.manage().window().maximize();


		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(450,572)", "");

		WebElement download = driver.findElement(By.id("downloadButton"));
		download.click();
		
		File file = new File( "C:\\Users\\navee\\Downloads\\New folder\\chromedriver-win64");
		File[] totalFile= file.listFiles();
		
		for (File file2 : totalFile) {
			file2.getName().equals("sampleFile.jpeg");
			System.out.println("The file is present");
			break;
		}
		
	}

}
