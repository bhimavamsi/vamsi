import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class Scroll_mechanism {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,2000);");
		Thread.sleep(1000);//jse.executeScript("window.scrollBy(0,2000);");
		jse.executeScript("window.scrollBy(0,-1000);");
	}

}
