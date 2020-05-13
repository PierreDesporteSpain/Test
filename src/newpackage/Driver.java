package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	
	public static final String DRIVER = "webdriver.chrome.driver";
    public static final String PATH = "/usr/local/bin/chromedriver";
    public static final String URL = "http://app.tillersystems.com/";
    
    static WebDriver 	driver;
    String 				baseUrl;
    
    
    public Driver() {
    	
    	 // declaration and instantiation of objects/variables
    	System.setProperty(DRIVER,PATH);
    	driver = new ChromeDriver();
		driver.manage().window().maximize(); 
    	
        String baseUrl = URL;
        driver.get(baseUrl);
    }
    
    public String getTitle() {
    	return driver.getTitle();
    }

	public WebElement findElement(By id) {
		return driver.findElement(id);
	}

	public String getWindowHandle() {
		return driver.getWindowHandle();
	}

	public void quit() {
		driver.quit();
	}

	public Object manage() {
		return driver.manage();
	}
}
