package commonFunctions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class commonFuntion {
	public static Properties prop;
	public static WebDriver driver;
	static Logger log=Logger.getLogger(commonFuntion.class);

	public static Properties LoadPropertyfile() throws IOException {
		FileInputStream fileinput=new FileInputStream("config.properties");
		prop=new Properties();
		prop.load(fileinput);
		return prop;


	}

	@BeforeTest
	public void LaunchBrowser() throws IOException {		
		LoadPropertyfile();
		PropertyConfigurator.configure("log4j.properties");
		log.info("========= Test Suite Execution Begin ===========");
		log.info("Property file loaded");
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\drivers\\chrome_latest\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@AfterTest
	public void CloseBrowser() {
		log.info("Browser is closing");
		log.info("========= Test Suite Execution End ===========");
		//driver.quit();
	}



}
