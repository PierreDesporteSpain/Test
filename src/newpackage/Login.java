package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
		
		  public static final String USER = "pierretest3";
		  public static final String PWD = "Tiller123";
		  
		  String username;
		  String password;
		  
			public Login() {
				  username = USER;
				  password = PWD;  
			  }
			  
			  
			  public Login(String user, String pwd){
				  username = user;
				  password = pwd;
			  }
		  
		  public String getUsername() {
			return username;
		}
	
	
		public void setUsername(String username) {
			this.username = username;
		}
	
	
		public String getPassword() {
			return password;
		}
	
	
		public void setPassword(String password) {
			this.password = password;
		}
		
		public boolean connect(Driver driver) throws InterruptedException {
			// Find the element
	        WebElement username = driver.findElement(By.id("username")); 
	        WebElement password = driver.findElement(By.id("password")); 
	        // Find the radio button for “Se souvenir de moi” using its ID and click on it
	        WebElement checkBox = driver.findElement(By.xpath("//label[text()='Se souvenir de moi']"));
	        WebElement button = driver.findElement(By.xpath("//button[text()='Se connecter']")); 
	        

	        username.sendKeys(this.username); 
	        password.sendKeys(this.password); 
	        
	        checkBox.click();
	        button.submit();
  
	        return true;
		}
	}
