package Com_Test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Com_a6 extends Base  {

	@Test
	
	public  void verify_Element () {
		
		driver.findElement(By.name("email")).sendKeys("Testinggmail.com");
		
		driver.findElement(By.name("pass")).sendKeys("Pass@123");
		
		driver.findElement(By.name("login")).click();
		
		String expected="Facebook  log in or sign up";
		
	
	}
}
