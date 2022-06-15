package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class WebTestBase {

    public  WebDriver driver;

@BeforeClass
    public void setUp()
{
    String chromeDriverPath = System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver2.exe";
    System.setProperty("webdriver.chrome.driver" , chromeDriverPath);
     driver = new ChromeDriver();
    driver.navigate().to("https://www.demoblaze.com/index.html");
}

@AfterClass
    public void tearDown()
{
    driver.quit();
}


}
