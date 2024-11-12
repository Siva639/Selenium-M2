import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[name='username']")).sendKeys("7756565600");
		Thread.sleep(3000);

		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("22233errer");
		//Thread.sleep(3000);

		driver.findElement(By.cssSelector("button[type='submit']")).click();
		Thread.sleep(3000);

		//driver.quit();
	}

}
