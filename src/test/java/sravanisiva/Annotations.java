package sravanisiva;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import testngpractise.ChromeDriver;

public class Annotations {
public static WebDriver driver;
@BeforeTest
public void openapplication() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver","C:\\Users/sravani/eclipse-workspace/practise/drivers/chromedriver.exe");
		Thread.sleep(2000);
		  driver=new ChromeDriver();
	       driver.get("https://adactinhotelapp.com/index.php");}
	   
@
	    

	}

}
