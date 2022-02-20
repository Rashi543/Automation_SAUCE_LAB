package Page_Functions;

import Object_Repository.Cart_Check_Page;
import Object_Repository.Go_to_Cart_Page;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class Go_to_Cart_Page_Funct extends CoreActions {
    SoftAssert softAssert = new SoftAssert();
    protected WebDriver driver4;
    public Go_to_Cart_Page_Funct(WebDriver driver)
    {
        super(driver);
        this.driver4=driver;
    }
    public void home_data()
    {
        catch_data(Go_to_Cart_Page.Cart_ProductName);
    }
    public void cart_price_check()
    {
        catch_price(Go_to_Cart_Page.Cart_price);
    }
    public void check_name()
    {
        softAssert.assertEquals(Home_text,Cart_text,"Product name matched");
        check_qty(Cart_Check_Page.cart_show);
        if(value!=true)
        {
            System.out.println("GO_CART_cart empty");
        }
        else
        {
            System.out.println("GO_CART_cart not empty");
        }
        System.out.println("PRODUCT NAME PASSED");
    }
    public void check_price()
    {
        softAssert.assertEquals(cart_price,Go_price,"Product price matched");
        System.out.println("PRODUCT PRICE PASSED");
    }
    public Checkout_page_Funct GO_TO_CART()
    {
        click(Go_to_Cart_Page.GO_CART);
        return new Checkout_page_Funct(driver4);
    }
}
