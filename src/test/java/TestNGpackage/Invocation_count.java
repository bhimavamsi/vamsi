package TestNGpackage;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation_count {
	@Test(invocationCount = 5)
	public void tc() {
	Reporter.log("hiii",true);
	}

}
