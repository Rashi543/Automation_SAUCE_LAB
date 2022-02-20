package Utils;


import Object_Repository.Checkout_Page;
import Object_Repository.Overview_Page;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import java.io.FileReader;
import java.io.IOException;
import Page_Functions.*;

@SuppressWarnings("DataProviderReturnType")
public class CoreTestIntegration {
    protected WebDriver driver;
    protected final String URL="https://www.saucedemo.com/";
    //declare login page object
    protected Login_Page_Funct login_page_obj;
    protected Home_Page_Funct home_page_obj;
    protected Go_to_Cart_Page_Funct go_to_cart_obj;
    protected Add_to_Cart_Page_Funct add_to_cart_obj;
    protected Checkout_page_Funct checkout_obj;
    protected Information_Page_Funct information_obj;
    protected Overview_Page_Funct overview_obj;
    protected Complete_Page_Funct complete_obj;
    protected Go_Again_cart_Page_Funct go_cart_again_obj;
    protected Cart_Check_Page_Funct cart_check_obj;
    protected String expected;
    @BeforeClass
    public void openBrowser()
    {
        driver=new Driver().getDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        expected=driver.getCurrentUrl();
        //initialize login page object
        login_page_obj=new Login_Page_Funct(driver);
        home_page_obj=new Home_Page_Funct(driver);
        add_to_cart_obj=new Add_to_Cart_Page_Funct(driver);
        go_to_cart_obj=new Go_to_Cart_Page_Funct(driver);
        checkout_obj=new Checkout_page_Funct(driver);
        information_obj=new Information_Page_Funct(driver);
        overview_obj=new Overview_Page_Funct(driver);
        complete_obj=new Complete_Page_Funct(driver);
        go_cart_again_obj=new Go_Again_cart_Page_Funct(driver);
        cart_check_obj=new Cart_Check_Page_Funct(driver);
    }
    protected static void logStep(String step)
    {
        Logger.step(step);
    }
    @AfterClass
    public void close()
    {
        driver.quit();
    }
    @DataProvider(name="check_data")
    public String[] readJSONDATA() throws IOException, ParseException {
        JSONParser jsonparser = new JSONParser();
        FileReader reader = new FileReader("C:\\Users\\rashi.rajan\\Documents\\ASSIGNMENT\\Second_Assessment\\src\\test\\java\\Configuration\\config.json");
        Object obj = jsonparser.parse(reader);
        JSONObject userloginobj = (JSONObject) obj;
        JSONArray userloginArray = (JSONArray) userloginobj.get("userLogin");
        String[] arr = new String[userloginArray.size()];
        for (int i = 0; i < userloginArray.size(); i++) {
            JSONObject users = (JSONObject) userloginArray.get(i);
            String user = (String) users.get("username");
            String pwd = (String) users.get("password");
            arr[i] = user + "," + pwd;
        }
        return arr;
    }
}
