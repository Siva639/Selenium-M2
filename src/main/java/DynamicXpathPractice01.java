import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpathPractice01 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.flipkart.com/");

Thread.sleep(2000);

driver.findElement(By.name("q")).sendKeys("mobiles");
driver.findElement(By.className("_2iLD_")).click();

List<WebElement>mobiles =driver.findElements(By.className("KzDlHZ"));
Thread.sleep(2000);

for (WebElement mobile : mobiles) {
	String name = mobile.getText();
	WebElement price = driver.findElement(By.xpath("//div[text()='CMF by Nothing Phone 1 (Black, 128 GB)']/ancestor::div[@class='yKfJKb row']/decendant::div[@class='Nx9bqj _4b5DiR']))"
			
		System.out.println(name +"\t"+price.getText());
	
}
Thread.sleep(200);
driver.quit();

	}

}
