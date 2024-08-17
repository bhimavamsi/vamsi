package TestNGpackage;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Annotations_flow {
	@Test
	public void tc() {
		Reporter.log("==actual tc==",true);
	}
	@BeforeSuite
	public void bs() {
		Reporter.log("DB connection",true);
	}
	@AfterSuite
	public void as() {
		Reporter.log("DB disconnection",true);
	}
	@BeforeClass
	public void bc() {
		Reporter.log("open browser",true);
	}
	@AfterClass
	public void ac() {
		Reporter.log("close browser",true);
	}
	@AfterMethod
	public void am() {
		Reporter.log("close the app",true);
	}

	@BeforeMethod
	public void bm() {
		Reporter.log("open app",true);
	}

	

}
