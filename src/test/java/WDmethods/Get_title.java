package WDmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Get_title {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.google.com");
	String tit=driver.getTitle();
	System.out.println(tit);
}
}
