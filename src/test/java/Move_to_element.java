import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_to_element {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions a=new Actions(driver);
		a.moveToElement(gmail).moveToElement(gmail).perform();
		a.moveToElement(gmail).doubleClick().perform();
	}

}
