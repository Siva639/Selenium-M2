package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetGetTittleGetTittleUrl {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.netflix.com/");
	String title=driver.getTitle();
	String Url=driver.getCurrentUrl();
	System.out.println(title+"\n"+Url);

	}

}
