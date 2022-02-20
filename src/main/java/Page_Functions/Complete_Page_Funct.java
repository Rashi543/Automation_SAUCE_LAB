package Page_Functions;

import Object_Repository.Complete_Page;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;

public class Complete_Page_Funct extends CoreActions {
    protected WebDriver driver8;
    public Complete_Page_Funct(WebDriver driver)
    {
        super(driver);
        this.driver8=driver;
    }
    public Home_Page_Funct click_back()
    {
        click(Complete_Page.BACK_TO_HOME);
        return new Home_Page_Funct(driver8);
    }
}
