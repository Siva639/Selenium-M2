import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class GetPositionSetPosition {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Point actualpoint=driver.manage().window().getPosition();
		System.out.println(actualpoint);
		Thread.sleep(30000);
		
		Point reqpoint=new Point(500,500);
		driver.manage().window().setPosition(reqpoint);
		Thread.sleep(30000);
		driver.close();
		
	}

}
