package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@name='btnLogin'")).click();
		String text=driver.switchTo().alert().getText();
		System.out.println(text);
	}

	
	

}
