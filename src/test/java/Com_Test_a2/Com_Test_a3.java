package Com_Test_a2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Com_Test_a3 {

	public static void main(String[] args) {

		
		// Execuation Browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
     // x-path by text
		//WebElement forgtn=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
   
		//forgtn.click();
		// x-path by contains
		
		//WebElement loginbtn=driver.findElement(By.xpath("//button[contains (@id,'u_0_5_')]"));
		
	//	loginbtn.click();
		// x-path-contains text
		
	//	WebElement forgtn=driver.findElement(By.xpath("//a[contains(text(), 'Forgotten ')]"));
		
		//forgtn.click();
		// x-path by contains
	WebElement	createBtn=driver.findElement(By.xpath("//a[contains(@id,'u_0_0_')]"));
		
	createBtn.click();
	// x-path by index
	driver.findElement(By.xpath("(//input[@name='firstname'])[1]")).sendKeys("Test");
	
	
	}

}
