package GridSetupTest.GridSetupTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromeGridTest {

	WebDriver driver;
	String baseURL, nodeURL;
	// define desired capabilities
	// platform=WIN10, browser name=chrome

	@BeforeTest
	public void setUp() throws MalformedURLException {
		baseURL = "http://newtours.demoaut.com/";
		nodeURL = "http://192.168.137.1:5566/wd/hub";

		DesiredCapabilities capability = DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.WIN10);
		driver = new RemoteWebDriver(new URL(nodeURL), capability);

	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

	@Test
	public void getTitleTest() {
		driver.get(baseURL);
		Assert.assertEquals("Welcome: Mercury Tours", driver.getTitle());
		System.out.println("Title: " + driver.getTitle());
	}

}
