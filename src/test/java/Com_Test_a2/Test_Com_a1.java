package Com_Test_a2;

<<<<<<< HEAD
public class Test_Com_a1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

=======
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Com_a1 {

	public static void main(String[] args) {

		  
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		// frame
		
		
>>>>>>> 3972a89ff0b52fb4e91bdf18630312cf1982828e
	}

}
