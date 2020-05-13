package newpackage;


public class MyClass {

	 public static final String URL = "https://new.tillersystems.com/login";
	 
    public static void main(String[] args) throws InterruptedException {
    	
		Driver driver = new Driver();
        String actualTitle = driver.getTitle(); 
        System.out.println(actualTitle);
       
        Login login = new Login(); 
        
        if(login.connect(driver)) {
        	 String actualUrl = URL; 
             System.out.println(actualUrl);
             System.out.println("Login Done with Submit");
             
             String MainWindow = driver.getWindowHandle();
             System.out.println(MainWindow);

             //driver.findElement(By.linkText("Découvrir")).click(); //Try to click
             
             //close
     		System.out.println("TestFinish");
        }
 
        driver.quit();  
        System.exit(0);
    }

}