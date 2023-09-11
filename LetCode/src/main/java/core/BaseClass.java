package core;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


import java.util.concurrent.TimeUnit;

public class BaseClass {
	protected static WebDriver driver;




	protected static void initializeDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

	}


	public static void closeDriver() {
		if (driver != null) {
			driver.quit();
		}
	}
}