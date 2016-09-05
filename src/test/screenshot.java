package test;

import java.io.File;
import java.nio.file.FileAlreadyExistsException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;


public class screenshot extends Settings {

	
	@Test
	public void testsc() throws Exception {
		driver.get(baseurl);
		getscreenshot();
		
			
		}
	
public void getscreenshot() throws Exception {
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(scrFile, new File("F:\\Screenshot\\sch.jpg"));
			
}
}
