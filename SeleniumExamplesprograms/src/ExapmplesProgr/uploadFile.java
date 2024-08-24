package ExapmplesProgr;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class uploadFile {

    public static void main(String[] args) {
        // Set up the WebDriver
        System.setProperty("webdriver.chrome.driver", 
        		"C:\\Users\\navee\\Downloads\\New folder\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        // Navigate to the webpage
        driver.get("http://demoqa.com/upload-download");
        driver.manage().window().maximize();
        
        // Set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        // Locate the file input element
        WebElement uploadInput = driver.findElement(By.id("uploadFile"));
        
        // Specify the file path
        String filePath = "C:\\Users\\navee\\Downloads\\New folder\\chromedriver-win64\\sampleFile.jpeg";
        
        // Upload the file
        uploadInput.sendKeys(filePath);
        
        // Close the browser
    }
}