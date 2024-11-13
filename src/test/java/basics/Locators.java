package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws Exception {
		//.chromeDriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://github.com/login");
		Thread.sleep(3000);

	}

}
