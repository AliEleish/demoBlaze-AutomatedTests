package base;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class PageObjectBase {

    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    public PageObjectBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver , this);

    }

    public void clickElement(WebElement element , int waitTime) throws InterruptedException {

        wait = new WebDriverWait(driver , Duration.ofSeconds(waitTime));
        wait.until(ExpectedConditions.visibilityOf(element));
        try {
            element.click();
        }catch(Exception e)
        {
          Thread.sleep(500);
            element.click();
        }
    }

    public void enterTextIntoElement(WebElement element , int waitTime,String text)
    {
        wait = new WebDriverWait(driver , Duration.ofSeconds(waitTime));
        wait.until(ExpectedConditions.visibilityOf(element));
        element.sendKeys(text);
    }

    public void AssertElementText(WebElement element , int waitTime, String expectedValue)
    {
        wait = new WebDriverWait(driver , Duration.ofSeconds(waitTime));
        wait.until(ExpectedConditions.visibilityOf(element));
        Assert.assertEquals(element.getText(), expectedValue );
    }

    public void waitElement(WebElement element , int waitTime)
    {
        wait = new WebDriverWait(driver , Duration.ofSeconds(waitTime));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public String getTextFromElement(WebElement element)
    {
        return element.getText();
    }

    public void scrollDownToAnElement(WebElement element)
    {
        actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
}
