package Com_Test;

import org.openqa.selenium.By;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TC_002   {

	
		@Test  (groups= {"regression"})
		public void xyz() {
			
			System.out.println("Test xyz");
		}
		@Test (groups= {"critcal Regression"})
		public void pqr() {
			
			System.out.println("Test pqr");

		}
    
		@Test (groups={"regression"})
		public void wer() {
			
			System.out.println("Test wer");

		}
	
	}
