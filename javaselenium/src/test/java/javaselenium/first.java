package javaselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\amitkumark\\eclipse-workspace\\javaselenium\\driver\\chromedriver\\chromedriver.exe");
		WebDriverManager.chromedriver().browserVersion("110.0.5481.77").setup();	
	    WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
    System.out.println("browser opened");
       driver.close();
       driver.quit();
  
    
	}

}
