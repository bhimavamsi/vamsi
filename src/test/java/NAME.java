import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NAME {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	driver.findElement(By.name("user-name")).sendKeys("standard_user");
	driver.findElement(By.name("password")).sendKeys("secret_sauce");
	driver.findElement(By.name("login-button")).click();
	String expT="swag labs";
	String actT=driver.getTitle();
	if (expT.equals(actT)) {
		System.out.println("tc is pass");
	 {
			System.out.println("tc is fail");
		}
		
	}
	
	
	{
		
	}
}
}