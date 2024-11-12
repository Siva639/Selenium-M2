import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://in.bookmyshow.com/");
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		

	}

}
