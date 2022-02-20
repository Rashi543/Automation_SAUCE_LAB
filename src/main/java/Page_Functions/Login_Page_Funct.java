package Page_Functions;

import Utils.CoreActions;
import org.openqa.selenium.WebDriver;
import Object_Repository.Login_Page;

public class Login_Page_Funct extends CoreActions {
    protected WebDriver driver1;
    public Login_Page_Funct(WebDriver driver)
    {
        super(driver);
        this.driver1=driver;
//        if(!pageTitle().equalIgnoreCase("xyz"))
//        {
//            throw new SkipException("Not login page");//hard assertion
//        }
    }
    public void sendUsername(String text)
    {
        waitForVisibility(Login_Page.TITLE);
        clear_data(Login_Page.USERNAME);
        sleep(2);
        enter_values(Login_Page.USERNAME,text);
    }
    public void sendPassword(String text)
    {
        clear_data(Login_Page.PASSWORD);
        sleep(2);
        enter_values(Login_Page.PASSWORD,text);
    }
    public Home_Page_Funct ClickSubmit()
    {
        click(Login_Page.SUBMIT);
        return new Home_Page_Funct(driver1);
    }
}

