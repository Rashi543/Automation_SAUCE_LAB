package Page_Functions;

import Object_Repository.Cart_Check_Page;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;

public class Cart_Check_Page_Funct extends CoreActions {
    public Cart_Check_Page_Funct(WebDriver driver)
    {
        super(driver);
    }
    public void check_cart_data()
    {
        data_present_cart_page_validation(Cart_Check_Page.cart_show);
        if(size_shown==2)
        {
            System.out.println("cart empty");
        }
        else
        {
            System.out.println("cart not empty");
        }
    }
    public void click_dropdown()
    {
        click(Cart_Check_Page.going_for_logout);
    }
    public void Click_logout()
    {
        click(Cart_Check_Page.LOGOUT);
        System.out.println("LOGOUT");
    }
}
