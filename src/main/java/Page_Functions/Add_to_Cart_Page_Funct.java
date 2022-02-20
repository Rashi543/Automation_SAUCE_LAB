package Page_Functions;

import Object_Repository.Add_to_cart_Page;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;

public class Add_to_Cart_Page_Funct extends CoreActions {
    protected WebDriver driver3;
    public Add_to_Cart_Page_Funct(WebDriver driver)
    {
        super(driver);
        this.driver3=driver;
    }
    public void match_data()
    {
        store_data(Add_to_cart_Page.ProductName);
    }
    public void match_price()
    {
        store_price(Add_to_cart_Page.productPrice);
    }
    public void cart_check_before(){
        data_present_cart_page_validation(Add_to_cart_Page.cart_check);
        if(size_shown<2)
        {
            System.out.println("cart Empty you can proceed!!!");
        }
        else
        {
            System.out.println("Your cart is not empty please make it empty first!!!");
        }
    }
    public Go_to_Cart_Page_Funct ADD_TO_CART()
    {
        click(Add_to_cart_Page.CART);
        return new Go_to_Cart_Page_Funct(driver3);
    }
}
