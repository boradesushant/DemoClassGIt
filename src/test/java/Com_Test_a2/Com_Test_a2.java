package Com_Test_a2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class Com_Test_a2 {

	public static void main(String[] args) throws IOException {
		

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
	WebElement	DrpContry=driver.findElement(By.xpath("//select[@name='country']"));
		
	Handle_visible_Text(DrpContry,"ARUBA");
	}
	
	public static void Handle_DropDown(WebElement Element,int index) {
		
		Select select=new Select(Element);

		select.selectByIndex(index);
	}
	
public static void Handle_value(WebElement Element,String value) {
		
		Select select=new Select(Element);

		select.selectByValue(value);
		
	}
public static void Handle_visible_Text(WebElement Element,String text) {
	
	Select select=new Select(Element);

	select.selectByValue(text);
	
}
}
