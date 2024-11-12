import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttributesTextPractice01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@aria-label=\"Search Amazon.in\"]")).sendKeys("handbags");
		driver.findElement(By.xpath("//input[@value=\"Go\"]")).click();
		
		driver.findElement(By.xpath("//span[text()='Get It by Tomorrow']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Textured Tote bag']")).click();
		Thread.sleep(2000);

		//driver.quit();

	}

}
