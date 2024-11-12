package groupExicution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class test3 {
	@Test(groups = "regression")
	public void demo1() {
		Reporter.log("Test3 - demo1 - regression",true);
		
	}
	
	@Test(groups = "regression")
	public void demo2() {
		Reporter.log("Test3 - demo2 - sanity",true);
		
	}
	@Test(groups = {"regression","regression"})
	public void demo3() {
		Reporter.log("Test3 - demo3 - regression and sanity",true);
		
	}
}
