package Assertions;
import org.testng.annotations.Test;
import org.testng.Assert;

public class HardAssertTest {
	@Test
	public void Demo() {
		String s1 = "Hello";
		String s2 = "Hii";
		
		Assert.assertEquals(s1, s2);
		
		System.out.println(s1);
		System.out.println(s2);

	}

}
