package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TAG_NAME {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https//www.sausedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("passward")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
	}

}
