package sel_sample_browsers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\MY PROJECT\\Source Files\\Drivers\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.quit;

	}

}
