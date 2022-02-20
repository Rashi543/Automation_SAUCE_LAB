package Page_Functions;

import Object_Repository.Overview_Page;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;

public class Overview_Page_Funct extends CoreActions {
    protected WebDriver driver7;
    public Overview_Page_Funct(WebDriver driver)
    {
        super(driver);
        this.driver7=driver;
    }
    public void click_Finish()
    {
        click(Overview_Page.FINISH);
    }
}
