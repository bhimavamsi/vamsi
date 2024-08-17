package WDmethods;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class set_size {
public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.monster.com");
	String expurl="https://www.monster.com";
	String acturl=driver.getCurrentUrl();
	if (expurl.equals(acturl)) {
		System.out.println("tc is pass");
		
	}
	else {
	
	}
	
}
}
