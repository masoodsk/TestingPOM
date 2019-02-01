package Browserutil;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class OpenBrowser {
	WebDriver driver;
	@Test

	public void OpenApplication() {

		String driverpath = "./src/main/resources/driver/chromedriver.exe";
		String dripath = "./src/main/resources/Driver/geckodriver.exe";
		String getdir = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", getdir + driverpath);
		System.setProperty("webdriver.gecko.driver", getdir + dripath);
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		driver = new ChromeDriver(options);
		driver.get("http://apps.gamonoid.com/icehrm-open/");
		System.out.println(driver.getTitle());
		driver.quit();
	}

}
