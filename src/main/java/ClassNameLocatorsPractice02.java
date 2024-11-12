import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameLocatorsPractice02 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.bookmyshow.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.className("ilhhay")).sendKeys("Hyderabad");
		driver.findElement(By.className("kyELKl")).click();
		Thread.sleep(3000);
		
		

	}

}
