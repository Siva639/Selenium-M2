import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorPractice01 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("sisaa@gmail.com");
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("765rfd");
		Thread.sleep(2000);
		 driver.findElement(By.cssSelector("button.selected")).click();
			Thread.sleep(2000);
//driver.quit();
	}

}
