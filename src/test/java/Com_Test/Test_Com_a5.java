package Com_Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageFactory.PomClass;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Com_a5 {

	@Test
 public void intialliaze () {
	 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
	 
		PomClass pom=PageFactory.initElements(driver,PomClass.class );
	 
		pom.getText_Email().sendKeys("TestingGMail.com");
		
		pom.getText_Pass().sendKeys("Pass@123");
		
		pom.getText_button().submit();
		
		
 }

}
