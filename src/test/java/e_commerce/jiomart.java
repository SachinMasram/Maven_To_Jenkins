package e_commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class jiomart {
  @Test
  public void jiomartTest() {
	  
	  Reporter.log("Opening Jiomart Page", true);
	  System.setProperty("webdriver.chrome.driver", "D:\\Chrome Driver\\chromedriver-win64\\chromedriver.exe");
	  ChromeOptions opt = new ChromeOptions();
	  opt.addArguments("--remote-allow-origins=*");
	  WebDriver driver = new ChromeDriver(opt);
	  driver.get("https://www.jiomart.com");
	  driver.manage().window().maximize();
	  driver.quit();
  }
}
