package iListeners;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseLayer.BaseClass;

public class TakesScreenShot extends BaseClass{
	
	TakesScreenshot ts = (TakesScreenshot)driver;
	
	File src = ts.getScreenshotAs(OutputType.FILE);
	
	File dest = new File("D:\\Mahesh\\POM\\MarchFailScreenshot\\.png");
	
//	FileUtils.copyFile(srcfile, "new File("D:\\Mahesh\\POM\\MarchFailScreenshot\\.png\");
	
	//FileUtils.copyFile(src, dest);

}
