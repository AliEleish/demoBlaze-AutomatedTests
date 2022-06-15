package pages.PlaceOrder;

import Data.ReadTestData;
import base.PageObjectBase;
import org.openqa.selenium.WebDriver;

public class PlaceOrderPage extends PlaceOrderPO {

    public PlaceOrderPage(WebDriver driver) {
        super(driver);
    }
    public void clickOnPlaceOrderCTAFromCartScreen() throws InterruptedException {
        clickElement(PlaceOrderCTA,50);
    }

    public void FillOrderData()
    {
      enterTextIntoElement(PlaceOrderNameTxtField , 50 , ReadTestData.getName("Name"));
      enterTextIntoElement(PlaceOrderCountryTxtField , 50 , ReadTestData.getName("Country"));
      enterTextIntoElement(PlaceOrderCityTxtField , 50 , ReadTestData.getName("City"));
      enterTextIntoElement(PlaceOrderCreditCardTxtField , 50 , ReadTestData.getName("Credit Card"));
      enterTextIntoElement(PlaceOrderMonthTxtField , 50 , ReadTestData.getName("Month"));
      enterTextIntoElement(PlaceOrderYearTxtField , 50 , ReadTestData.getName("Year"));
    }

    public void clickOnPurchaseCTA() throws InterruptedException {
        scrollDownToAnElement(PlaceOrderPurchaseCTA);
        clickElement(PlaceOrderPurchaseCTA,50);
    }

    public void ClickOnOkCTAfromSuccessfulPlaceOrder() throws InterruptedException {
        clickElement(SuccessfulPlacedOrder_OkCTA , 50);
    }

}
