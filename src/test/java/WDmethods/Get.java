package WDmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(4000);
		driver.navigate().to("google");
		driver.navigate().back();
		}

}
