import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.description.ModifierReviewable.OfAbstraction;

public class Drag_and_drop {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement srcel=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement dest=driver.findElement(By.xpath("//div[@id='droppable'"));
		Actions a=new Actions(driver);
		a.dragAndDrop(srcel, dest).perform();
		
		
	}

}
