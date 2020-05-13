package newpackage;
import org.openqa.selenium.WebDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.firefox.FirefoxDriver;
//comment the above line and uncomment below line to use Chrome
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class MyClass {

	public static final String DRIVER = "webdriver.chrome.driver";
    public static final String PATH = "/usr/local/bin/chromedriver";
    public static final String URL = "http://app.tillersystems.com/";
    public static final String URL2 = "https://new.tillersystems.com/login";
    
    public static final String USER = "pierretest3";
    public static final String PWD = "Tiller123";
      

    public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
		System.setProperty(DRIVER,PATH);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); 
    	
        String baseUrl = URL;
        String tagName = "";
        String expectedTitle = "S'identifier | Tiller Systems";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle(); 
        System.out.println(actualTitle);
       
        WebElement username = driver.findElement(By.id("username")); 
        WebElement password = driver.findElement(By.id("password")); 
        // Find the radio button for “Se souvenir de moi” using its ID and click on it
        WebElement checkBox = driver.findElement(By.xpath("//label[text()='Se souvenir de moi']"));
        WebElement login = driver.findElement(By.xpath("//button[text()='Se connecter']")); 
        
        
       

        username.sendKeys(USER); 
        password.sendKeys(PWD); 
        
        checkBox.click();
        login.submit(); 
        
        String actualUrl = URL2; 
        System.out.println(actualUrl);
        System.out.println("Login Done with Submit");
        
   
        String MainWindow = driver.getWindowHandle();
        System.out.println(MainWindow);

        driver.findElement(By.linkText("Découvrir")).click(); //Try to click
        

       
        //close
		System.out.println("TestFinish");
        driver.quit();  
        System.exit(0);
    }

}