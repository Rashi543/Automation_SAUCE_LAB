package Page_Functions;

import Object_Repository.Home_Page;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;

public class Home_Page_Funct extends CoreActions {
    protected WebDriver driver2;
    public Home_Page_Funct(WebDriver driver)
    {
        super(driver);
        this.driver2=driver;
    }
    public Add_to_Cart_Page_Funct Select_purchase_item()
    {
        click(Home_Page.Select_option);
        return new Add_to_Cart_Page_Funct(driver2);
    }
}
