package vtiger;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createcontact {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost:8888/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("root");
		driver.findElement(By.xpath("//input[@id='submitButton']")).click();
		
		
		
		
				
		
	}

}
