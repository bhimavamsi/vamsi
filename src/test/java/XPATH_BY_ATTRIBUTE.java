import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class XPATH_BY_ATTRIBUTE {
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.xpath("//input[@id=\"user-name\"")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id=\"password\"")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id=\"login-button\"")).click();
		
	}

}
