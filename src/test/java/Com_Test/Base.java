package Com_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

   WebDriver driver;
   
	@Parameters ({"BrowserName"})
	@Test
	public void Setup (String BrowserName) {
		
		if (BrowserName.equalsIgnoreCase("Chrome")) {
			
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
	
		}
		
		else if (BrowserName.equalsIgnoreCase("Edge")) {
		
		WebDriverManager.edgedriver().setup();
		 driver=new EdgeDriver();
		
		}
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	}
		
	@Test
	public void TearDown() {
		
	//	driver.quit();
		
	}
}
