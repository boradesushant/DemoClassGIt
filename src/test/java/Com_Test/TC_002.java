package Com_Test;

import org.testng.annotations.Test;

public class TC_002 {

	

public class Test_Com_a3 {

	@Test  (priority=4)
	public void abc() {
		
		
		System.out.println("Test abc");
		
		
	}
	
	@Test   (priority=3)
	public void qas() {
		
		
		System.out.println("Test qas");
	}

	@Test   (priority=5)
	public void pqr() {
		
		
		System.out.println("Test pqr");
	}
	@Test  (priority=1)
	public void xyz() {
		
		
		System.out.println("Test xyz");
	}
	
	@Test 
	(enabled=false)
	public void wer() {
		
		
		System.out.println("Test wer");
	}
}
	
	}
