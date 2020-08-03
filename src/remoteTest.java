import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class remoteTest {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
DesiredCapabilities dc= new DesiredCapabilities();
dc.setBrowserName("chrome");
dc.setPlatform(Platform.WINDOWS);
//System.setProperty("webdriver.chrome.driver","C:\\Users\\Ajay\\Downloads\\chromedriver.exe");
WebDriver driver = new RemoteWebDriver(new URL("http://192.168.29.60:4455/wd/hub"),dc);
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.manage().window().maximize();
driver.get("http://google.com");


	}

}
