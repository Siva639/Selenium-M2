package Assertions;

import org.testng.annotations.Test;

public class WhyNotifElse {
	@Test
	public void Demo() {
		String s1 = "Hello";
		String s2 = "Hii";
		
		if(s1.equals(s2))
			System.out.println("pass");
		else
			System.out.println("fail");
		
	}

}
