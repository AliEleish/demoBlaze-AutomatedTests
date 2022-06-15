package pages.Cart;

import base.PageObjectBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPO extends PageObjectBase {


    public CartPO(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH , using = "//li[@class='nav-item'][3]/a")
    public WebElement CartIcon;

    @FindBy(how = How.XPATH , using = "//tr[@class='success'][1]/td[2]")

    public WebElement FirstProductAddedToCart_Title;

    @FindBy(how = How.XPATH , using = "//tr[@class='success'][1]/td[3]")
    public WebElement FirstProductAddedToCart_Price;

    @FindBy(how = How.XPATH , using = "//tr[@class='success'][2]/td[2]")
    public WebElement SecondProductAddedToCart_Title;

    @FindBy(how = How.XPATH , using = "//tr[@class='success'][2]/td[3]")
    public WebElement SecondProductAddedToCart_Price;

    @FindBy(how = How.ID , using = "totalp")
    public WebElement ProductsAddedToCartTotalPrice;

}
