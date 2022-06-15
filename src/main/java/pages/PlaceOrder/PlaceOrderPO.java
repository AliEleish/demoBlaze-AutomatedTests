package pages.PlaceOrder;

import base.PageObjectBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PlaceOrderPO extends PageObjectBase {

    public PlaceOrderPO(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH , using = "//button[@data-toggle='modal']")
    public WebElement PlaceOrderCTA;

    @FindBy(how = How.ID , using = "name")
    public WebElement PlaceOrderNameTxtField;

    @FindBy(how = How.ID , using = "country")
    public WebElement PlaceOrderCountryTxtField;

    @FindBy(how = How.ID , using = "city")
    public WebElement PlaceOrderCityTxtField;

    @FindBy(how = How.ID , using = "card")
    public WebElement PlaceOrderCreditCardTxtField;

    @FindBy(how = How.ID , using = "month")
    public WebElement PlaceOrderMonthTxtField;

    @FindBy(how = How.ID , using = "year")
    public WebElement PlaceOrderYearTxtField;

    @FindBy(how = How.XPATH , using = "(//button[@class='btn btn-primary'])[3]")
    public WebElement PlaceOrderPurchaseCTA;

    @FindBy(how = How.XPATH , using = "//div[@class='sa-confirm-button-container']/button")
    public WebElement SuccessfulPlacedOrder_OkCTA;

}
