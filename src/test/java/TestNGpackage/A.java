package TestNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {
	@Test
	public void tc1() {
		Reporter.log("hiii i am first test NG output",true);
	}
		
		@Test
		public void tc2() {
			Reporter.log("second progrm",true);{
		}
	}

}
