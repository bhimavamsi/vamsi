package WDmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigate {
public static void main(String[] args) throws InterruptedException   {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	driver.close();
	driver.get("https://www.amazon.com");
	Thread.sleep(20000);
	driver.get("https://www.flipkart.com");
	Thread.sleep(10000);
	driver.quit();
	
	
			}
}
