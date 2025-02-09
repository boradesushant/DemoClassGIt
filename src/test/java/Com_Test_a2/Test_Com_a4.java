package Com_Test_a2;

import java.io.IOException;

import Utility.Library;

public class Test_Com_a4 {

	public static  void main(String[] args) throws IOException {

		
		String Data1=Library.Excell_String("LoginTest", 0, 0);
		
		System.out.println(Data1);
		
		String Data2=Library.Excell_String("LoginTest", 0, 1);
		
		System.out.println(Data2);
		
	String	Data3=Library.Excell_String("LoginTest", 0, 2);
		
		System.out.println(Data3);
		
		
	}
	

}
