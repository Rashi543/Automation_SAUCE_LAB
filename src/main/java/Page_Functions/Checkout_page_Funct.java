package Page_Functions;

import Object_Repository.Checkout_Page;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;

public class Checkout_page_Funct extends CoreActions{
    protected WebDriver driver5;
    public Checkout_page_Funct(WebDriver driver)
    {
        super(driver);
        this.driver5=driver;
    }
    public Information_Page_Funct checkout_click()
    {
        click(Checkout_Page.CHECKOUT_CLICK);
        return new Information_Page_Funct(driver5);
    }
}
