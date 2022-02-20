package Page_Functions;

import Object_Repository.Go_Cart_Again_Page;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;

public class Go_Again_cart_Page_Funct extends CoreActions {
    public Go_Again_cart_Page_Funct(WebDriver driver)
    {
        super(driver);
    }
    public void click_cart_after_back_home()
    {
        click(Go_Cart_Again_Page.cart_click);
    }
}
