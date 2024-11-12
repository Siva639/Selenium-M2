package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class lanchChromrBrowser {

	public static void main(String[] args) {
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	FirefoxDriver driver1=new FirefoxDriver();
	driver1.get("https://www.google.co.in/");
			

	}

}
