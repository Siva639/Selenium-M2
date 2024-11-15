package dataDrivenTesting;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

public class ReadFromProperties {

	public static void main(String[] args, Reader fis) throws IOException {
	//Step 1: Convert physical file into java readable object
		new FileInputStream("./src/test/resources/Data.properties");
		
		//Step 2:Create an instance of properties class
		Properties property = new Properties();
		
		
		//Step 3: Load all key-value pairs from fis to property
		property.load(fis);
		//Step 4: Read data from properties
		String browser=property.getProperty("browser");
		System.out.println(browser);
		
		String time=property.getProperty("time");
		System.out.println(time);
		

	}

}
