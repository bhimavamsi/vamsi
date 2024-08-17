
public class demo {
public static void main(String[] args) {
	argsriver driver = new ChromeDriver();

    driver.get("https://www.selenium.dev/selenium/web/web-form.html");

    driver.getTitle();

    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

    WebElement textBox = driver.findElement(By.name("my-text"));
    WebElement submitButton = driver.findElement(By.cssSelector("button"));

    textBox.sendKeys("Selenium");
    submitButton.click();

    WebElement message = driver.findElement(By.id("message"));
    message.getText();

    driver.quit();
}
}
