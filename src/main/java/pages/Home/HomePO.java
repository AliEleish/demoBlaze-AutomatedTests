package pages.Home;

import base.PageObjectBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;



public class HomePO extends PageObjectBase {

        public HomePO(WebDriver driver)
        {super(driver);}

       @FindBy(how = How.XPATH , using = "(//div[@class='card h-100'])[2]/a")
       public WebElement SecondProductInHomePage;


        @FindBy(how=How.XPATH , using ="//a[@class='btn btn-success btn-lg']")
        public WebElement AddToCartButton;

        @FindBy(how = How.XPATH , using = "//li[@class='nav-item active']/a")
        public WebElement HomeIcon;

        @FindBy(how = How.XPATH , using = "(//div[@class='card h-100'])[1]/a")
        public WebElement FirstProductInHomePage;


        @FindBy(how = How.ID, using = "cat")
        public WebElement CategoriesSection_HomePage;


}
