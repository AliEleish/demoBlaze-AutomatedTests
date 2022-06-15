package pages.Cart;

import org.openqa.selenium.Alert;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class CartPage extends CartPO {

    WebDriver driver;
    public CartPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void clickOnCartIcon() throws InterruptedException {
        clickElement(CartIcon, 50);
    }
    public void AssertOnProductsAddedToCart()
    {
        try{
        waitElement(FirstProductAddedToCart_Title , 50);
        AssertOnProductTitleAfterAddedToCart(FirstProductAddedToCart_Title);
        waitElement(FirstProductAddedToCart_Price,50);
        AssertOnProductPriceAfterAddedToCart(FirstProductAddedToCart_Price);
        waitElement(SecondProductAddedToCart_Title,50);
        AssertOnProductTitleAfterAddedToCart(SecondProductAddedToCart_Title );
        waitElement(SecondProductAddedToCart_Price,50);
        AssertOnProductPriceAfterAddedToCart(SecondProductAddedToCart_Price);
    }catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void AssertOnProductTitleAfterAddedToCart(WebElement element)
    {
        String expectedProductTitle;
        if(element.getText().contains("Nokia"))
        {
            expectedProductTitle= "Nokia lumia 1520";
            AssertElementText(element , 50 , expectedProductTitle);
        }
        else if (element.getText().contains("Samsung"))
        {
            expectedProductTitle= "Samsung galaxy s6";
            AssertElementText(element , 50 , expectedProductTitle);
        }
    }
    public void AssertOnProductPriceAfterAddedToCart(WebElement element)
    {
        String expectedProductPrice;
        if (element.getText().contains("8"))
        {
            expectedProductPrice = "820";
            AssertElementText(element , 50 , expectedProductPrice);
        }
        else if (element.getText().contains("3"))
        {
            expectedProductPrice = "360";
            AssertElementText(element , 50 , expectedProductPrice);
        }
    }
    public void AssertOnProductsAddedToCartTotalPrice()
    {
       int FirstProductPrice = Integer.parseInt(getTextFromElement(FirstProductAddedToCart_Price));
       int SecondProductPrice = Integer.parseInt(getTextFromElement(SecondProductAddedToCart_Price));
       int ProductsTotalPrice = Integer.parseInt(getTextFromElement(ProductsAddedToCartTotalPrice));
       Assert.assertEquals(FirstProductPrice + SecondProductPrice , ProductsTotalPrice);
    }
}
