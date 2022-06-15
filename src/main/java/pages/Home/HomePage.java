package pages.Home;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage extends HomePO{

    WebDriver driver;
    public  HomePage(WebDriver driver){
        super(driver);
        this.driver = driver;
    }


    public void clickOnSecondProductFromHomePage() throws InterruptedException {
        clickElement(SecondProductInHomePage,50);
    }

    public void addProductFromHomeScreenToCart() throws InterruptedException {
        clickElement(AddToCartButton,20);
    }

    public void verifyProductAdded() {
        Alert productAddedAlert = null;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
            wait.until(ExpectedConditions.alertIsPresent());
            productAddedAlert = driver.switchTo().alert();
            Assert.assertEquals(productAddedAlert.getText(), "Product added.");
            productAddedAlert.accept();
            driver.switchTo().defaultContent();
        } catch (Exception e) {
            productAddedAlert.accept();
            e.printStackTrace();
        }
    }

    public void clickOnHomeIcon() throws InterruptedException {
        clickElement(HomeIcon,50);
    }

    public void clickOnFirstProductFromHomePage() throws InterruptedException {
        clickElement(FirstProductInHomePage,50);
    }

    public void verifyHomePageIsDisplayed()
    {
        Assert.assertTrue(CategoriesSection_HomePage.isDisplayed());
    }
}
