import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAutomation1 {
	public static void main(String[] args) throws IOException, InterruptedException {
		popUpAutomate();
	}

	public static void popUpAutomate() throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "A:\\SELENIUM\\chromedriver.exe");
		WebDriver webDriver = (WebDriver) new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

		webDriver.get("https:/flipkart.com/");
		WebElement upload = webDriver.findElement(By.xpath("//*[@type='text']"));
	       upload.click();
	       takeScreenshot(webDriver, 1);
	       webDriver.close();
	}
	public static void takeScreenshot(WebDriver wd, int number) throws IOException {
		File file = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(
				"C:\Users\DELL\OneDrive\Pictures\Screenshots\2023-04-13 (6).png"
						+ number + ".png"));
	}

}

