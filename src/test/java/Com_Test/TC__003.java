package Com_Test;

import org.testng.annotations.Test;

public class TC__003 {

	@Test  (groups={"regression"})
	public void m1 () {
		
	System.out.println("Test M1");
		
	}
	
	@Test (groups={"critcal Regression"})
	public void m2 () {
		
	System.out.println("Test m2");
		
	}
	
	@Test  (groups={"critcal Regression"})
	public void m3 () {
		
	System.out.println("Test M3");
		
	}

}
