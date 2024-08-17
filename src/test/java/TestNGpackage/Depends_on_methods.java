package TestNGpackage;

import static org.testng.Assert.fail;

import org.testng.Reporter;
import org.testng.annotations.Test;

import dev.failsafe.internal.util.Assert;

public class Depends_on_methods {
	@Test
	public void login () {
		Reporter.log("login",true);
		Assert.Fai ();
		@Test(dependsOnMethods  = "login")
		publi
		
		
	}
	

}
