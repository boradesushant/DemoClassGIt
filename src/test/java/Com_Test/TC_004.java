package Com_Test;

import org.testng.annotations.Test;

public class TC_004 {

	
	@Test (priority=2)
	public void Abc() {
		
		System.out.println("Test ABC");
		
	}
	@Test 
	public void pqr() {
		
		System.out.println("Test pqr");
		
	}
	@Test (priority=1)
	public void qwe() {
		
		System.out.println("Test qwe");
		
		
		  
	}
	@Test (enabled=false)
	public void asq() {
		
		System.out.println("Test asq");
	}
	
	
}
