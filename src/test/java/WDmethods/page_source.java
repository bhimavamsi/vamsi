package WDmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class page_source {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.flipkart.com");
	String pgsrc=driver.getPageSource();
	System.out.println(pgsrc);
}
}
