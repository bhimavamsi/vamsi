package Drop_down;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import org.openqa.selenium.support.ui.Select;

public class LIST_BOX {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select s=new Select(day);
		s.selectByVisibleText("5");
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select s1=new Select(month);
		s1.selectByVisibleText("may");
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select s2=new Select(year);
		s2.selectByVisibleText("2023");
		
		
		//select=[@label='Month'
	}

}
