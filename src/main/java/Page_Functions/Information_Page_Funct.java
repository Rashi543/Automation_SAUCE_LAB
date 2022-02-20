package Page_Functions;

import Object_Repository.Information_Page;
import Utils.CoreActions;
import org.openqa.selenium.WebDriver;

public class Information_Page_Funct extends CoreActions{
    protected WebDriver driver6;
    public Information_Page_Funct(WebDriver driver)
    {
        super(driver);
        this.driver6=driver;
    }
    public void enter_first_name(String text)
    {
        enter_values(Information_Page.FIRST_NAME,text);
    }
    public void enter_last_name(String text)
    {
        enter_values(Information_Page.LAST_NAME,text);
    }
    public void enter_postal_code(String text)
    {
        enter_values(Information_Page.POSTAL_CODE,text);
    }
    public void click_continue()
    {
        click(Information_Page.CONTINUE);
    }
}
