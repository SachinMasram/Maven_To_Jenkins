package e_commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ajio {
  @Test
  public void ajioTest() {
	  Reporter.log("Opening Ajio Page", true);
	  System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
	  ChromeOptions opt = new ChromeOptions();
	  opt.addArguments("--remote-allow-origins=*");
	  WebDriver driver = new ChromeDriver(opt);
	  driver.get("https://www.ajio.com");
	  driver.manage().window().maximize();
	  driver.quit();
	  
  }
}
